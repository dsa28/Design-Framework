
public class TAPlus extends TANumericFunction {


<<<<<<< HEAD
=======
	private TAPlus operation;
	
	
	public void evaluate()
	{
		operation.evaluate();
	}
	 
	public void list()
	{
		operation.list();
	}
	
	
	void printState()
	{
		operation.printState();
	}
	

	String type()
	{
		return operation.type();
		
	}
	
	
		 
	void operands()
	{
		operation.operands();
	}
>>>>>>> parent of f8f95b3... Refactoring

	protected TAPlus()
	{
		opvalue = "+";
<<<<<<< HEAD
	
<<<<<<< HEAD
=======
>>>>>>> parent of af8e566... Refactoring old classes so they support observer pattern
	}
	
=======
>>>>>>> parent of f8f95b3... Refactoring
	
	public void addOperands(TAValue a, TAValue b)
	{
		a.addFunction(operation);
		b.addFunction(operation);
	}
	
	
	 TAPlus(TAIntValue a, TAIntValue b)
	{
		operation = new TAPlusInt(a,b);
<<<<<<< HEAD
<<<<<<< HEAD
		
=======
>>>>>>> parent of f8f95b3... Refactoring
=======
		addOperands(a,b);
>>>>>>> parent of af8e566... Refactoring old classes so they support observer pattern
	}
	 
	 TAPlus (TADoubleValue a, TADoubleValue b)
	 {
		 operation = new TAPlusDouble(a,b);
<<<<<<< HEAD
<<<<<<< HEAD
	
=======
>>>>>>> parent of f8f95b3... Refactoring
=======
		 addOperands(a,b);
>>>>>>> parent of af8e566... Refactoring old classes so they support observer pattern
	 }
	 
	 

	 TAPlus(TAIntValue a, TAIntValue b, String s)
	 {
		 operation = new TAPlusInt(a,b,s);
	}
	
	 TAPlus (TADoubleValue a, TADoubleValue b, String s)
	 {
		 operation = new TAPlusDouble(a,b,s);
	}
	 
	 
	
	
}
	
