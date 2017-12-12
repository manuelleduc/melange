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

		val root = mapFeatures.get(vm.name).structure
		root.mandatory = true
		root.abstract = true

		fm

	}

	private def dispatch Map<String, de.ovgu.featureide.fm.core.base.impl.Feature> initializeFeatures(
		DefaultFeatureModelFactory factory, IFeatureModel fm, boolean isRoot, Feature mFeature) {
		val feature = factory.createFeature(fm, mFeature.name)
		if(isRoot) fm.structure.root = feature.structure
		fm.addFeature(feature)
		newHashMap(mFeature.name -> feature)
	}

	private def dispatch Map<String, de.ovgu.featureide.fm.core.base.impl.Feature> initializeFeatures(
		DefaultFeatureModelFactory factory, IFeatureModel fm, boolean isRoot, OneOf oneOf) {
		val feature = factory.createFeature(fm, oneOf.name)
		if(isRoot) fm.structure.root = feature.structure
		fm.addFeature(feature)
		val maps = oneOf.children.map[this.initializeFeatures(factory, fm, false, it)]
		val ret = newHashMap(oneOf.name -> feature)
		maps.forEach[ret.putAll(it)]
		ret
	}

	private def dispatch Map<String, de.ovgu.featureide.fm.core.base.impl.Feature> initializeFeatures(
		DefaultFeatureModelFactory factory, IFeatureModel fm, boolean isRoot, SomeOf someOf) {
		val feature = factory.createFeature(fm, someOf.name)
		if(isRoot) fm.structure.root = feature.structure
		fm.addFeature(feature)
		val maps = someOf.children.map[this.initializeFeatures(factory, fm, false, it)]
		val ret = newHashMap(someOf.name -> feature)
		maps.forEach[ret.putAll(it)]
		ret
	}

	private def dispatch void configureFeatures(Map<String, de.ovgu.featureide.fm.core.base.impl.Feature> mapFeatures,
		IFeatureModel fm, Feature mFeature) {
		val feature = mapFeatures.get(mFeature.name)
		feature.structure.mandatory = !mFeature.isOptional
	}

	private def dispatch void configureFeatures(Map<String, de.ovgu.featureide.fm.core.base.impl.Feature> mapFeatures,
		IFeatureModel fm, OneOf oneOf) {
		val feature = mapFeatures.get(oneOf.name)
		feature.structure.setAlternative
		feature.structure.mandatory = !oneOf.isOptional
		oneOf.children.forEach[feature.structure.addChild(mapFeatures.get(it.name).structure)]
		oneOf.children.forEach[configureFeatures(mapFeatures, fm, it)]
	}

	private def dispatch void configureFeatures(Map<String, de.ovgu.featureide.fm.core.base.impl.Feature> mapFeatures,
		IFeatureModel fm, SomeOf someOf) {
		val feature = mapFeatures.get(someOf.name)
		feature.structure.setAnd
		feature.structure.mandatory = !someOf.isOptional
		someOf.children.forEach[feature.structure.addChild(mapFeatures.get(it.name).structure)]
		someOf.children.forEach[configureFeatures(mapFeatures, fm, it)]

	}
}
