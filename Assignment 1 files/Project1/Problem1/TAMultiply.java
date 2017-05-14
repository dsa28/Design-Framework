
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
	
	public void addOperands(TAValue a, TAValue b)
	{
		a.addFunction(operation);
		b.addFunction(operation);
	}
	

	TAMultiply(TAIntValue a, TAIntValue b)
	{
		operation = new TAMultiplyInt(a,b);
<<<<<<< HEAD
<<<<<<< HEAD
		
=======
>>>>>>> parent of f8f95b3... Refactoring
=======
		addOperands(a,b);
>>>>>>> parent of af8e566... Refactoring old classes so they support observer pattern
	}
	 
	TAMultiply(TADoubleValue a, TADoubleValue b)
	{
		 operation = new TAMultiplyDouble(a,b);
<<<<<<< HEAD
<<<<<<< HEAD
		
=======
>>>>>>> parent of f8f95b3... Refactoring
=======
		 addOperands(a,b);
>>>>>>> parent of af8e566... Refactoring old classes so they support observer pattern
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
