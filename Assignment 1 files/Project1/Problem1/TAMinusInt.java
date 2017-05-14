
public class TAMinusInt extends TAMinus implements TAIntValue {

	 
	TAIntValue op1, op2;
	int value;
	
	
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
	
	
	
	 
	public int value()
	{
		return value;
	}

	
	TAMinusInt(TAIntValue a)
	{
		op1 = a;
		single = true;
	}
	
	TAMinusInt (TAIntValue a, String s)
	{
		this(a);
		name = s;
		
	}
	
	 TAMinusInt(TAIntValue a, TAIntValue b)
	{
		op1 = a;
		op2 = b;
		single = false;
		
	}
	 
	 TAMinusInt (TAIntValue a, TAIntValue b, String s)
	 {
		 this(a,b);
		 name = s;
	 }
	
	
	
	
	
}
