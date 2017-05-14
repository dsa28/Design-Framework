
public class TAMultiply extends TANumericFunction {
	
	private TAMultiply operation;
	
	void list()
	{
		operation.list();
	}
	
	
	void printState()
	{
		operation.printState();
	}

<<<<<<< HEAD
=======
	String type()
	{
		return operation.type();
		
	}
	
	
	public void evaluate()
    {
		operation.evaluate();
	}
		 
	void operands()
	{
		operation.operands();
	}
	
>>>>>>> parent of f8f95b3... Refactoring
	
	protected TAMultiply()
	{
		
	}
	
	

	TAMultiply(TAIntValue a, TAIntValue b)
	{
		operation = new TAMultiplyInt(a,b);
<<<<<<< HEAD
		
=======
>>>>>>> parent of f8f95b3... Refactoring
	}
	 
	TAMultiply(TADoubleValue a, TADoubleValue b)
	{
		 operation = new TAMultiplyDouble(a,b);
<<<<<<< HEAD
		
=======
>>>>>>> parent of f8f95b3... Refactoring
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
