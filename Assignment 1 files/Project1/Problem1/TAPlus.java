
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
	}
	
=======
>>>>>>> parent of f8f95b3... Refactoring
	
	
	 TAPlus(TAIntValue a, TAIntValue b)
	{
		operation = new TAPlusInt(a,b);
<<<<<<< HEAD
		
=======
>>>>>>> parent of f8f95b3... Refactoring
	}
	 
	 TAPlus (TADoubleValue a, TADoubleValue b)
	 {
		 operation = new TAPlusDouble(a,b);
<<<<<<< HEAD
	
=======
>>>>>>> parent of f8f95b3... Refactoring
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
	
