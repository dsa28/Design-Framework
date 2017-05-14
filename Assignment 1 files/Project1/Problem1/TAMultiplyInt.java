public class TAMultiplyInt extends TAMultiply implements TAIntValue {

	
	TAIntValue op1, op2;
	int value;
	
	public void evaluate()
	 {
		//op1.evaluate();
		//op2.evaluate();
		value = op1.value()*op2.value();
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
			ListStrategy.list("*", op1, op2);
		}
		
	}
	
	
	void printState()
	{
		System.out.print(value);
	}
	
	
	String type()
	{
		return "int";
	}
	
	
	public int value()
	{
		return value;
	}
	
	


	
	 TAMultiplyInt(TAIntValue a, TAIntValue b)
	{
		op1 = a;
		op2 = b;
		
	}
	 
	 TAMultiplyInt (TAIntValue a, TAIntValue b, String s)
	 {
		 this(a,b);
		 name = s;
	 }
	
	 
	
	
}