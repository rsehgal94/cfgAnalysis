package cfgAnalysis;

import soot.Scene;
import soot.SootClass;
import soot.Body;
import soot.SootMethod;
import soot.toolkits.graph.*;
import java.util.Iterator;

public class Do_CFG {
	
	public static void main(String[] args) {
	 
		SootClass sc =  Scene.v().loadClassAndSupport("cfgAnalysis.Demo1");
		sc.setApplicationClass();
		
		SootMethod sm = sc.getMethodByName("perform_computation");
		Body b = sm.retrieveActiveBody();
		
		BriefUnitGraph ug = new BriefUnitGraph(b);
		BriefBlockGraph bg = new BriefBlockGraph(ug);
		
		Iterator<Block> i = bg.iterator();
		
		while(i.hasNext()){
			Block blk = (Block)i.next();
			int n = blk.getIndexInMethod();
			System.out.println(n);
			//System.out.println(i.next());
		}
		//System.out.println(bg.getBlocks());
	}
}
