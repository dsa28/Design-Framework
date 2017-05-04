
public class TAMinus extends TANumericFunction {

	boolean single; //Indicates whether we are using minus as a binary or unary operator
	
	
	
	protected TAMinus()
	{
		opvalue = "-";
	}
	
	
	
	
	//One argument
	TAMinus(TAIntValue a)
	{
		operation = new TAMinusInt(a);
		
	}
	
	TAMinus(TADoubleValue a)
	{
		operation = new TAMinusDouble(a);
		
	}
	
	
	
	
	//One argument and a name
	 TAMinus(TAIntValue a, String s)
	{
		operation = new TAMinusInt(a,s);
		
	}
	
	 TAMinus(TADoubleValue a, String s)
	{
		operation = new TAMinusDouble(a,s);
		
	}
	
	
	
	
	//two arguemnts
	 TAMinus(TAIntValue a,TAIntValue b)
	{
		operation = new TAMinusInt(a,b);
		
	}
	 
	 TAMinus (TADoubleValue a, TADoubleValue b)
	 {
		 operation = new TAMinusDouble(a,b);
	
	 }
	 
	 
	 
	 
	 //two arguments and a name
	TAMinus (TAIntValue a, TAIntValue b, String s)
	 {
		 operation = new TAMinusInt(a,b,s);
	
	}
	
	TAMinus (TADoubleValue a,TADoubleValue b, String s)
	{
		 operation = new TAMinusDouble(a,b,s);
		 
	}
	 
	 
	
	
	
}
