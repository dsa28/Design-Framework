
public class TAMinusDouble extends TAMinus implements TADoubleValue {

	TADoubleValue op1, op2;
	double value;
	
	public void evaluate()
	 {
		op1.evaluate();
		
		if (!single)
		 {
			op2.evaluate();
			value = op1.value()-op2.value();
		 }
		 else
		 {
			 value = -op1.value();
		 }
	 }
	 
	 
	 
	public void list()
	{
		if (name!= null)
		{
			ListStrategy.list(name);
		}
		else
		{
			
			if (single)
			{
				ListStrategy.list("-", op1);
			}
			else
			{
				ListStrategy.list("-", op1, op2);
			}
			
			
		}
		
	}

	void printState()
	{
		System.out.print(value);
	}
	
	String type()
	{
		return "double";
	}


	public double value()
	{
		return value;
	}

	TAMinusDouble(TADoubleValue a)
	{
		op1 = a;
		single = true;
		
		a.addFunction(this);
	}

	TAMinusDouble (TADoubleValue a, String s)
	{
		this(a);
		name = s;

	}

	TAMinusDouble(TADoubleValue a, TADoubleValue b)
	{
		op1 = a;
		op2 = b;
		single = false;
		
		addOperands(a,b);

	}

	TAMinusDouble(TADoubleValue a, TADoubleValue b, String s)
	{
		this(a,b);
		name =s;
	}





		


}
