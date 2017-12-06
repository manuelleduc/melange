package fr.inria.diverse.melange.scoping

import fr.inria.diverse.melange.metamodel.melange.MelangePackage
import fr.inria.diverse.melange.metamodel.melange.Reuse
import fr.inria.diverse.melange.metamodel.melange.Variability
import java.util.Collection
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.resource.EObjectDescription
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.impl.MapBasedScope
import org.eclipse.xtext.xbase.scoping.batch.XbaseBatchScopeProvider

class MelangeScopeProvider extends XbaseBatchScopeProvider {
	override IScope getScope(EObject context, EReference reference) {
		if (reference == MelangePackage::eINSTANCE.reuse_Features) {
			val reuse = context as Reuse
			val Collection<IEObjectDescription> map = reuse.languageconcern.eAllContents.filter(Variability).map [
				EObjectDescription::create(it.name, it)
			].toList
			MapBasedScope::createScope(IScope::NULLSCOPE, map)
		} else {
			super.getScope(context, reference)
		}
	}
}
