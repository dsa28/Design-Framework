public class TAPlusDouble extends TAPlus implements TADoubleValue {

 
	TADoubleValue op1, op2;
	double value;
	
	
	public void evaluate()
	 {
		
		value = op1.value()+op2.value();
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
			ListStrategy.list("+", op1,op2);
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


	
	 TAPlusDouble(TADoubleValue a, TADoubleValue b)
	{
		op1 = a;
		op2 = b;
		
	}
	 
	 TAPlusDouble (TADoubleValue a, TADoubleValue b, String s)
	 {
		 this(a,b);
		 name = s;
	 }
	

	
}