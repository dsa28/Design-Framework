public class TAGreaterThanInt extends TAGreaterThan implements TABoolValue {

	 TAIntValue op1, op2;
	 boolean value;
		
	 public void evaluate()
	 {
		 value = op1.value()>op2.value();
		 updateAll();}
	 
	 
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
	


	
	 TAGreaterThanInt(TAIntValue a, TAIntValue b)
	{
		op1 = a;
		op2 = b;
		
		addOperands(a,b);
		
	}
	 
	 TAGreaterThanInt (TAIntValue a, TAIntValue b, String s)
	 {
		 this(a,b);
		 name = s;
	 }
	
	 
	
	 
	
	
	
	
	
}