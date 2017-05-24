
public class TAGreaterThan extends TAFormula implements TABoolValue{
	
	String type()
	{
		return "bool";
	}
	
	public boolean value()
	{
		return operation.value();
	}
	
	public void evaluate()
	{operation.evaluate();}
	
	public void list()
	{
		operation.list();
	}
	
	
	protected TAGreaterThan()
	{}
	
	
	
	
	<E extends TAIntValue> TAGreaterThan (E a, E b) 
	{operation = new TAGreaterThanInt(a,b);}
	<E extends TADoubleValue> TAGreaterThan (E a, E b)
	{operation = new TAGreaterThanDouble(a,b);}
	
	
	
	
	<E extends TAIntValue> TAGreaterThan (E a, E b, String s)
	{operation = new TAGreaterThanInt(a,b,s);}
	<E extends TADoubleValue> TAGreaterThan (E a, E b, String s)
	{operation = new TAGreaterThanDouble(a,b,s);}
	
	
	
	

	
	
	TAGreaterThan operation;
	String name;
	
}
