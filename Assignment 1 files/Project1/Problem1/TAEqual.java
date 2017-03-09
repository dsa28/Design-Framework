
public class TAEqual implements TABoolValue{
	
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
	
	
	protected TAEqual()
	{}
	
	
	
	
	<E extends TAIntValue> TAEqual (E a, E b) 
	{operation = new TAEqualInt(a,b);}
	<E extends TADoubleValue> TAEqual (E a, E b)
	{operation = new TAEqualDouble(a,b);}
	<E extends TABoolValue> TAEqual(E a, E b)
	{operation = new TAEqualBool(a,b);}
	
	
	
	<E extends TAIntValue> TAEqual (E a, E b, String s)
	{operation = new TAEqualInt(a,b,s);}
	<E extends TADoubleValue> TAEqual (E a, E b, String s)
	{operation = new TAEqualDouble(a,b,s);}
	<E extends TABoolValue> TAEqual (E a, E b, String s)
	{operation = new TAEqualBool(a,b,s);}
	
	
	
	

	
	
	TAEqual operation;
	String name;
	
}
