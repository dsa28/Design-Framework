
public class TALessThan implements TABoolValue{
	
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
	
	
	protected TALessThan()
	{}
	
	
	void printState()
	{System.out.println(operation.value());}
	
	<E extends TAIntValue> TALessThan (E a, E b) 
	{operation = new TALessThanInt(a,b);}
	<E extends TADoubleValue> TALessThan (E a, E b)
	{operation = new TALessThanDouble(a,b);}
	
	
	
	
	<E extends TAIntValue> TALessThan (E a, E b, String s)
	{operation = new TALessThanInt(a,b,s);}
	<E extends TADoubleValue> TALessThan (E a, E b, String s)
	{operation = new TALessThanDouble(a,b,s);}
	
	
	
	

	
	
	TALessThan operation;
	String name;
	
}
