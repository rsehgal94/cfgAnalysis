package cfgAnalysis;

public class Demo1 {
	
	private int x;
	private int a,b;
	
	public Demo1(int x){
		this.x=x;		
	}
	
	public Demo1(){
		this.x=0;
	}
	
	int perform_computation(){
		if(x==0)
		{
			if(a<b)
				x=a;
			else 
				x=b;
		}
		else{
			if(a>b)
				x=a;
			else 
				x=b;
		}
	return x;
	}

}
