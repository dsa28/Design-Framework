
public class TAMultiply extends TANumericFunction {
	
	void list()
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
	{operation.operands();}
	
	
	
	

	
	protected TAMultiply()
	{
		opvalue = "*";
	}
	
	
	
	
	
	//two arguemnts
	 <E extends TAIntValue> TAMultiply(E a, E b)
	{
		operation = new TAMultiplyInt(a,b);
	}
	 
	 <E extends TADoubleValue> TAMultiply(E a, E b)
	 {
		 operation = new TAMultiplyDouble(a,b);
	 }
	 
	 
	 
	 
	 //two arguments and a name
	 <E extends TAIntValue> TAMultiply(E a, E b, String s)
	 {
		 operation = new TAMultiplyInt(a,b,s);
	}
	
	 <E extends TADoubleValue> TAMultiply(E a, E b, String s)
	 {
		 operation = new TAMultiplyDouble(a,b,s);
	}
	 
	 
	 
	
	private TAMultiply operation;




	
	
	
}
