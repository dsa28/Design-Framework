
public class TAPlus extends TANumericFunction {


	
	
		 
/*	void operands()
	{
		operation.operands();
	}*/

	protected TAPlus()
	{
		opvalue = "+";
	
	}
	
	
	
	 TAPlus(TAIntValue a, TAIntValue b)
	{
		operation = new TAPlusInt(a,b);
		
	}
	 
	 TAPlus (TADoubleValue a, TADoubleValue b)
	 {
		 operation = new TAPlusDouble(a,b);
	
	 }
	 
	 

	 TAPlus(TAIntValue a, TAIntValue b, String s)
	 {
		this(a,b);
		name = s;
		
	}
	
	 TAPlus (TADoubleValue a, TADoubleValue b, String s)
	 {
		this(a,b);
		name = s;
	}
	 
	 
	
	
}
	
