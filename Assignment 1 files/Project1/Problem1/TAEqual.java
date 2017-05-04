
public class TAEqual extends TAObject implements TABoolValue{
	
	
	TAEqual operation;
	String name;
	
	
	String type()
	{
		return "bool";
	}
	
	public boolean value()
	{
		return operation.value();
	}
	
	public void evaluate()
	{
		operation.evaluate();
	}
	
	public void list()
	{
		operation.list();
	}
	
	
	protected TAEqual()
	{
		
	}
	
	
	TAEqual (TAIntValue a, TAIntValue b) 
	{
		operation = new TAEqualInt(a,b);
	}
	
	TAEqual (TADoubleValue a, TADoubleValue b)
	{
		operation = new TAEqualDouble(a,b);
	}
	
	TAEqual(TABoolValue a, TABoolValue b)
	{
		operation = new TAEqualBool(a,b);
		
	}
	
	
	
	TAEqual (TAIntValue a, TAIntValue b, String s)
	{
		operation = new TAEqualInt(a,b);
		name = s;
		
	}
	
	TAEqual (TADoubleValue a, TADoubleValue b, String s)
	{
		operation = new TAEqualDouble(a,b);
		name = s;
	}
	
	TAEqual (TABoolValue a, TABoolValue b, String s)
	{
		operation = new TAEqualBool(a,b);
		name = s;
	}
	
	
	
}
