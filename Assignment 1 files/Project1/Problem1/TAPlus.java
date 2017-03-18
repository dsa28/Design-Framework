
public class TAPlus extends TANumericFunction {


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

	protected TAPlus()
	{
		opvalue = "+";
	}
	
	
	
	 TAPlus(TAIntValue a, TAIntValue b)
	{
		operation = new TAPlusInt(a,b);
	}
	 
	 TAPlus (TADoubleValue a, TADoubleValue b)
	 {
		 operation = new TAPlusDouble(a,b);
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
	
