package cfgAnalysis;

import soot.Scene;
import soot.SootClass;
import soot.Body;
import soot.SootMethod;
import soot.toolkits.graph.*;


public class Do_CFG {
	
	public static void main(String[] args) {
		
		SootClass sc =  Scene.v().loadClassAndSupport("cfgAnalysis.Demo1");
		sc.setApplicationClass();
		
		 
		SootMethod sm = sc.getMethodByName("perform_computation");
		Body b = sm.retrieveActiveBody();
		
		BriefUnitGraph ug = new BriefUnitGraph(b);
		BriefBlockGraph bg = new BriefBlockGraph(ug);
		
		System.out.println(bg.getBlocks());
	}

}
