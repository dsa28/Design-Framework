
public abstract class TANumericFunction extends TAObject {

	/*
	 * TANumericFuncion, used to avoid repeating code
	 * and make modifying classes easier and faster
	 */
	

	public void addOperands(TAValue a, TAValue b)
	{
		a.addFunction(operation);
		b.addFunction(operation);
	}
	
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
	
	 String type()
	 {
		 return operation.type();
	 }
	
	
	String opvalue;
	protected TANumericFunction operation;
}
