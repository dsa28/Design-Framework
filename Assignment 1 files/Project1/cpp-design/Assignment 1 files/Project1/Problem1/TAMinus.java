
public class TAMinus extends TANumericFunction {

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
	
	
	public void evaluate()
	 {operation.evaluate();}
		 
	void operands()
	{
		operation.operands();
	}
	
	
	
	

	
	protected TAMinus()
	{
		opvalue = "-";
	}
	
	
	
	
	//One argument
	<E extends TAIntValue> TAMinus(E a)
	{
		operation = new TAMinusInt(a);
	}
	
	<E extends TADoubleValue> TAMinus(E a)
	{
		operation = new TAMinusDouble(a);
	}
	
	
	
	
	//One argument and a name
	<E extends TAIntValue> TAMinus(E a, String s)
	{
		operation = new TAMinusInt(a,s);
	}
	
	<E extends TADoubleValue> TAMinus(E a, String s)
	{
		operation = new TAMinusDouble(a,s);
	}
	
	
	
	
	//two arguemnts
	 <E extends TAIntValue> TAMinus(E a, E b)
	{
		operation = new TAMinusInt(a,b);
	}
	 
	 <E extends TADoubleValue> TAMinus (E a, E b)
	 {
		 operation = new TAMinusDouble(a,b);
	 }
	 
	 
	 
	 
	 //two arguments and a name
	 <E extends TAIntValue> TAMinus (E a, E b, String s)
	 {
		 operation = new TAMinusInt(a,b,s);
	}
	
	 <E extends TADoubleValue> TAMinus (E a, E b, String s)
	 {
		 operation = new TAMinusDouble(a,b,s);
	}
	 
	 
	 
	 
	
	boolean single;
	private TAMinus operation;
	


	
	
}
