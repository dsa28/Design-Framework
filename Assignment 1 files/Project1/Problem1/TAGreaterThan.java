
public class TAGreaterThan extends TAObject implements TABoolValue{
	
	
	TAGreaterThan operation;

	
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
	
	
	protected TAGreaterThan()
	{
		
	}
	
	
	
	
	TAGreaterThan (TAIntValue a,TAIntValue b) 
	{
		operation = new TAGreaterThanInt(a,b);
	}
	
	TAGreaterThan (TADoubleValue a, TADoubleValue b)
	{
		operation = new TAGreaterThanDouble(a,b);
	}
	
	
	
	
	TAGreaterThan (TAIntValue a, TAIntValue b, String s)
	{
		operation = new TAGreaterThanInt(a,b);
		name = s;
	}
	
	TAGreaterThan (TADoubleValue a, TADoubleValue b, String s)
	{
		operation = new TAGreaterThanDouble(a,b);
		name = s;
	}
	
	
	
	

	

	
}
