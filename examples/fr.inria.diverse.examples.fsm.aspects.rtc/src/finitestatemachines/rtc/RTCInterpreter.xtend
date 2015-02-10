package finitestatemachines.rtc

import FSM.interfaces.Context
import FSM.interfaces.Interpreter
import finitestatemachines.FinitestatemachinesPackage
import finitestatemachines.StateMachine
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl

import static extension finitestatemachines.rtc.StateMachineAspect.*

class RTCInterpreter implements Interpreter {
	
	override execute(String modelPath, String input){
		
		var String expression = input
		var Context context = new Context(expression)
		
		var fact = new XMIResourceFactoryImpl
		if (!EPackage.Registry.INSTANCE.containsKey(FinitestatemachinesPackage.eNS_URI)) {
			EPackage.Registry.INSTANCE.put(FinitestatemachinesPackage.eNS_URI, FinitestatemachinesPackage.eINSTANCE);
		}
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("*", fact);
		
		var rs = new ResourceSetImpl()

		var uri = URI.createFileURI(modelPath);
		var res = rs.getResource(uri, true);
		var StateMachine _stateMachine = res.contents.get(0) as StateMachine
		var String filePath = modelPath + "-results" + System.currentTimeMillis + ".pdf"
		
		_stateMachine.eval(context, filePath)
	}
	
}