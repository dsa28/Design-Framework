
public class TAPlus extends TANumericFunction {


	
		 
	
	protected TAPlus()
	{
		
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
		 operation = new TAPlusInt(a,b,s);
	}
	
	 TAPlus (TADoubleValue a, TADoubleValue b, String s)
	 {
		 operation = new TAPlusDouble(a,b,s);
	}
	 
	 
	
	
}
	
