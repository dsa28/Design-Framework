
public class TACeiling extends TANumericFunction implements TAIntValue{
	
	/*
	 * Class TACeiling acts as a wrapper class for either a TACeilingDouble or
	 * a TACeilingInt, depending on the input value
	 * Either way, it returns an integer
	 * 
	 */

	TACeiling operation;
	
	
	String type()
	{
		return "int";
	}
	

	
	public int value() {
		return operation.value();
	}
	
	
	protected TACeiling()
	{
		
	}
	
	

	 TACeiling (TAIntValue a) 
	{
		 operation = new TACeilingInt(a);
	}
	
	 
	TACeiling (TADoubleValue a)
	{
		operation = new TACeilingDouble(a);
	}
	
	
	
	 TACeiling (TAIntValue a, String s)
	{
		 operation = new TACeilingInt(a);
		 name = s;
	}
	 
	
	 TACeiling (TADoubleValue a, String s)
	{
		 operation = new TACeilingDouble(a);
		 name = s;
	}




	
}

