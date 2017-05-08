
public class TAMultiply extends TANumericFunction {
	


	
	protected TAMultiply()
	{
		opvalue = "*";
	}
	
	

	TAMultiply(TAIntValue a, TAIntValue b)
	{
		operation = new TAMultiplyInt(a,b);
		
	}
	 
	TAMultiply(TADoubleValue a, TADoubleValue b)
	{
		 operation = new TAMultiplyDouble(a,b);
		
	}
	 
	 
	 
	 
	TAMultiply(TAIntValue a, TAIntValue b, String s)
	{
		 operation = new TAMultiplyInt(a,b,s);
	}
	
	  TAMultiply(TADoubleValue a, TADoubleValue b, String s)
	 {
		 operation = new TAMultiplyDouble(a,b,s);
	}
	 
	 
	
	
	
}
