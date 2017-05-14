public class TAPlusInt extends TAPlus implements TAIntValue {

	 
	TAIntValue op1, op2;
	int value;

	
	public void evaluate()
	 {
<<<<<<< HEAD
=======
		op1.evaluate();
		op2.evaluate();
>>>>>>> parent of af8e566... Refactoring old classes so they support observer pattern
		value = op1.value()+op2.value();
	 }
	
	
	public void list()
	{
		if (name!= null)
		{
			ListStrategy.list(name);
		}
		else
		{
			ListStrategy.list("+", op1, op2);
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
	
	
	
	

	 TAPlusInt(TAIntValue a, TAIntValue b)
	{
		op1 = a;
		op2 = b;
		
	}
	 
	 TAPlusInt (TAIntValue a, TAIntValue b, String s)
	 {
		 this(a,b);
		 name = s;
	 }
	
	 

	
}