public class TAMultiplyDouble extends TAMultiply implements TADoubleValue {
	
	TADoubleValue op1, op2;
	double value;
	
	public void evaluate()
	 {
		op1.evaluate();
		op2.evaluate();
		value = op1.value()*op2.value();
	
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
	

	
	public double value()
	{
		return value;
	}
	
	

	 TAMultiplyDouble(TADoubleValue a, TADoubleValue b)
	{
		op1 = a;
		op2 = b;
		
	}
	 
	 TAMultiplyDouble (TADoubleValue a, TADoubleValue b, String s)
	 {
		 this(a,b);
		 name = s;
	 }
	
	
	
	
}