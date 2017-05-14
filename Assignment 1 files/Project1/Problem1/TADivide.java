
public class TADivide extends TANumericFunction{
	
	/*
	 * Class TADivide acts as wrapper class for TADivideInt or TADivideDouble
	 * depending on the input values
	 */
	
	private TADivide operation;
	
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
	{
		operation.evaluate();
	}
	
	
	
	

	
	protected TADivide()
	{
	
	}
	
	
	
	
	
	//two arguemnts
	 TADivide(TAIntValue a,TAIntValue b)
	{
		operation = new TADivideInt(a,b);
	}
	 
	 TADivide(TADoubleValue a, TADoubleValue b)
	 {
		 operation = new TADivideDouble(a,b);
	 }
	 
	 
	 
	 
	 //two arguments and a name
	 TADivide(TAIntValue a,TAIntValue b, String s)
	 {
		 operation = new TADivideInt(a,b);
		 name = s;
	}
	
	 TADivide (TADoubleValue a,TADoubleValue b, String s)
	 {
		 operation = new TADivideDouble(a,b);
		 name = s;
	}
	 
	 
	
	
	
}
	

