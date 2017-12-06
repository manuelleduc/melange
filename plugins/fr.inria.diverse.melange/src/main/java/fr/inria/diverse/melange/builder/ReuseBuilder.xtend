package fr.inria.diverse.melange.builder

import fr.inria.diverse.melange.metamodel.melange.Reuse
import java.util.Set
import org.eclipse.emf.ecore.EPackage



class ReuseBuilder extends OperatorBuilder<Reuse> {
	
	new(Reuse op) {
		super(op)
	}
	
	override make() {
		println('''Reuse make''')
		val languageConcern = this.source.languageconcern
		// 1 - solve the variability
		// if incomplete, stop
		// otherwise
		// solve the realization model
		// check each activation feature.
		// if activated, proceed
	}
	
}
