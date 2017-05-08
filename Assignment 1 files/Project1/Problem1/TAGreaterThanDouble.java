public class TAGreaterThanDouble extends TAGreaterThan implements TABoolValue {
	 
	TADoubleValue op1, op2;
	boolean value;
	
	 public void evaluate()
	 {
		 //op1.evaluate();
		 //op2.evaluate();
		 value = op1.value()>op2.value();
		 updateAll();
	}
	 
	 
	public void list()
	{
		if (name!= null)
		{
			ListStrategy.list(name);
		}
		else
		{
			ListStrategy.list(">", op1, op2);
		}
				
	}
	
	void printState()
	{
		System.out.print(value);
	}
	
	
	String type()
	{
		return "bool";
	}
	
	
	 
	public boolean value()
	{
		return value;
	}


	
	 TAGreaterThanDouble(TADoubleValue a, TADoubleValue b)
	{
		op1 = a;
		op2 = b;
		
		addOperands(a,b);
	}
	 
	 TAGreaterThanDouble (TADoubleValue a, TADoubleValue b, String s)
	 {
		 this(a,b);
		 name = s;
	 }
	
	 
	
	 

	
	
	
	
}