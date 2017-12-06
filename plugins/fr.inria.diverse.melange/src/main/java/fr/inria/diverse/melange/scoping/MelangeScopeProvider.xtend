package fr.inria.diverse.melange.scoping

import fr.inria.diverse.melange.metamodel.melange.LanguageConcern
import fr.inria.diverse.melange.metamodel.melange.MelangePackage
import fr.inria.diverse.melange.metamodel.melange.Realisation
import fr.inria.diverse.melange.metamodel.melange.Reuse
import fr.inria.diverse.melange.metamodel.melange.TaggedElement
import fr.inria.diverse.melange.metamodel.melange.Variability
import java.util.Collection
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.MapBasedScope
import org.eclipse.xtext.xbase.scoping.batch.XbaseBatchScopeProvider
import javax.swing.text.html.parser.TagElement

class MelangeScopeProvider extends XbaseBatchScopeProvider {
	override IScope getScope(EObject context, EReference reference) {
		if (reference == MelangePackage::eINSTANCE.referenceReuseFeature_Ref) {
			val reuse = context.eContainer as Reuse
			val Collection<IEObjectDescription> map = reuse.languageconcern.eAllContents.filter(Variability).map [
				EObjectDescription::create(it.name, it)
			].toList
			MapBasedScope::createScope(IScope::NULLSCOPE, map)
		} else if (reference == MelangePackage::eINSTANCE.realisation_Targets) {
			val realisation = context as Realisation
			val concern = realisation.eContainer as LanguageConcern

			val Collection<IEObjectDescription> map = concern.operators.map [
				val l1 = it.eAllContents.filter(TaggedElement).map [
					EObjectDescription::create(it.name, it)
				].toList
				
				if(it instanceof TaggedElement) {
					if(it.name !== null)
						l1.add(EObjectDescription::create(it.name, it))
				}
				
				l1
			].flatten.toList
			MapBasedScope::createScope(IScope::NULLSCOPE, map)
		} else {
			super.getScope(context, reference)
		}
	}
}
