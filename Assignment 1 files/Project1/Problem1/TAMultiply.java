
public class TAMultiply extends TANumericFunction {
	


	String type()
	{
		return operation.type();
		
	}
	
	
 
	/*void operands()
	{
		operation.operands();
	}
	*/
	
	protected TAMultiply()
	{
		opvalue = "*";
	}
	
	public void addOperands(TAValue a, TAValue b)
	{
		a.addFunction(operation);
		b.addFunction(operation);
	}
	

	TAMultiply(TAIntValue a, TAIntValue b)
	{
		operation = new TAMultiplyInt(a,b);
		addOperands(a,b);
	}
	 
	TAMultiply(TADoubleValue a, TADoubleValue b)
	{
		 operation = new TAMultiplyDouble(a,b);
		 addOperands(a,b);
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
