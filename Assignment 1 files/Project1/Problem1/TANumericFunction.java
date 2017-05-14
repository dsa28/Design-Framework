
public abstract class TANumericFunction extends TAObject {

	/*
	 * TANumericFuncion, used to avoid repeating code
	 * and make modifying classes easier and faster
	 */
	

<<<<<<< HEAD
<<<<<<< HEAD
	
=======
	public void addOperands(TAValue a, TAValue b)
	{
		a.addFunction(operation);
		b.addFunction(operation);
	}
>>>>>>> parent of af8e566... Refactoring old classes so they support observer pattern
	
	public void list()
	{
		operation.list();
	}
	
	public void evaluate()
	{
		operation.evaluate();
	}
	
	void printState()
	{
		operation.printState();
	}
	
=======
	
>>>>>>> parent of f8f95b3... Refactoring
	
	
	String opvalue;
}
