package fr.inria.diverse.melange.utils

import de.ovgu.featureide.fm.core.base.IFeatureModel
import de.ovgu.featureide.fm.core.base.impl.DefaultFeatureModelFactory
import de.ovgu.featureide.fm.core.base.impl.FMFactoryManager
import fr.inria.diverse.melange.metamodel.melange.Feature
import fr.inria.diverse.melange.metamodel.melange.OneOf
import fr.inria.diverse.melange.metamodel.melange.SomeOf
import fr.inria.diverse.melange.metamodel.melange.Variability
import java.util.Map

class FeatureIDEUtil {
	def IFeatureModel buildFeatureModel(Variability vm) {

		// initialization of the feature model and factory
		val IFeatureModel fm = FMFactoryManager::emptyFeatureModel
		val DefaultFeatureModelFactory factory = DefaultFeatureModelFactory::instance

		val Map<String, de.ovgu.featureide.fm.core.base.impl.Feature> mapFeatures = this.initializeFeatures(factory, fm,
			true, vm)

		this.configureFeatures(mapFeatures, fm, vm)

		fm

	}

	private def dispatch Map<String, de.ovgu.featureide.fm.core.base.impl.Feature> initializeFeatures(
		DefaultFeatureModelFactory factory, IFeatureModel fm, boolean isRoot, Feature feature) {
		val f = factory.createFeature(fm, feature.name)
		if(isRoot) fm.structure.root = f.structure else fm.addFeature(f)
		newHashMap(feature.name -> f)
	}

	private def dispatch Map<String, de.ovgu.featureide.fm.core.base.impl.Feature> initializeFeatures(
		DefaultFeatureModelFactory factory, IFeatureModel fm, boolean isRoot, OneOf feature) {
		val f = factory.createFeature(fm, feature.name)
		if(isRoot) fm.structure.root = f.structure else fm.addFeature(f)
		val maps = feature.children.map[this.initializeFeatures(factory, fm, false, it)]
		val ret = newHashMap(feature.name -> f)
		maps.forEach[ret.putAll(it)]
		ret
	}

	private def dispatch Map<String, de.ovgu.featureide.fm.core.base.impl.Feature> initializeFeatures(
		DefaultFeatureModelFactory factory, IFeatureModel fm, boolean isRoot, SomeOf feature) {
		val f = factory.createFeature(fm, feature.name)
		if(isRoot) fm.structure.root = f.structure else fm.addFeature(f)
		val maps = feature.children.map[this.initializeFeatures(factory, fm, false, it)]
		val ret = newHashMap(feature.name -> f)
		maps.forEach[ret.putAll(it)]
		ret
	}

	private def dispatch void configureFeatures(Map<String, de.ovgu.featureide.fm.core.base.impl.Feature> mapFeatures,
		IFeatureModel fm, Feature feature) {
		val f = mapFeatures.get(feature.name)
		f.structure.mandatory = !feature.isOptional
	}

	private def dispatch void configureFeatures(Map<String, de.ovgu.featureide.fm.core.base.impl.Feature> mapFeatures,
		IFeatureModel fm, OneOf oneOf) {
		val f = mapFeatures.get(oneOf.name)
		oneOf.children.forEach [
			f.structure.addChild(mapFeatures.get(it.name).structure)
		]

		f.structure.mandatory = !oneOf.isOptional
		// we first explictly attach the sub features to the parents before configuring them
		oneOf.children.forEach[configureFeatures(mapFeatures, fm, it)]
		f.structure.setAlternative
	}

	private def dispatch void configureFeatures(Map<String, de.ovgu.featureide.fm.core.base.impl.Feature> mapFeatures,
		IFeatureModel fm, SomeOf someOf) {
		val f = mapFeatures.get(someOf.name)
		someOf.children.forEach [
			f.structure.addChild(mapFeatures.get(it.name).structure)
		]
		f.structure.mandatory = !someOf.isOptional
		someOf.children.forEach [
			configureFeatures(mapFeatures, fm, it)
		]

	}
}
