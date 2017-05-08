
public class TALessThan extends TAObject implements TABoolValue{
	
	TALessThan operation;
	
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
	
	
	protected TALessThan()
	{}
	
	
	void printState()
	{
		System.out.println(operation.value());
	}
	
	TALessThan (TAIntValue a, TAIntValue b) 
	{
		operation = new TALessThanInt(a,b);
	}
	
	TALessThan (TADoubleValue a, TADoubleValue b)
	{
		operation = new TALessThanDouble(a,b);
	}
	
	
	
	
	 TALessThan (TAIntValue a, TAIntValue b, String s)
	{
		 operation = new TALessThanInt(a,b,s);
	}
	 
	 TALessThan (TADoubleValue a, TADoubleValue b, String s)
	{
		 operation = new TALessThanDouble(a,b,s);
	}
	
	
	
	

	
	
	
	
	
}
