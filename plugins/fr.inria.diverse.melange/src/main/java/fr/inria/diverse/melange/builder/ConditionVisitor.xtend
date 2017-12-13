package fr.inria.diverse.melange.builder

import fr.inria.diverse.melange.metamodel.melange.And
import fr.inria.diverse.melange.metamodel.melange.FeatureRef
import fr.inria.diverse.melange.metamodel.melange.Not
import fr.inria.diverse.melange.metamodel.melange.Or
import fr.inria.diverse.melange.metamodel.melange.ReferenceReuseFeature
import fr.inria.diverse.melange.metamodel.melange.ReuseFeature
import fr.inria.diverse.melange.metamodel.melange.Variability
import java.util.List

class ConditionVisitor {

	val List<ReuseFeature> configuration

	new(List<ReuseFeature> configuration) {
		this.configuration = configuration
	}

	def dispatch boolean visit(Or cond) {
		this.visit(cond.left) || this.visit(cond.right)
	}

	def dispatch boolean visit(And cond) {
		this.visit(cond.left) && this.visit(cond.right)
	}

	def dispatch boolean visit(Not or) {
		!this.visit(or.content)
	}

	def dispatch boolean visit(FeatureRef ref) {
		val Variability feature = ref.ref
		val ReuseFeature ff = this.configuration.findFirst[it.ref === feature]
		if (ff instanceof ReferenceReuseFeature) {
			!ff.unselected
		} else {
			// we do not deal with the valued tagged themselves in the parent, some tracability is needed 
			false
		}
	}
}
