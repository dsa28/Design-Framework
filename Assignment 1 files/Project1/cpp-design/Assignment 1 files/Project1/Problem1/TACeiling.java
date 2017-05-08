
public class TACeiling implements TAIntValue{
	
	String type()
	{
		return "int";
	}
	
	public int value()
	{
		return operation.value();
	}
	
	public void evaluate()
	{operation.evaluate();}
	
	public void list()
	{
		operation.list();
	}
	
	
	protected TACeiling()
	{}
	
	
	
	
	<E extends TAIntValue> TACeiling (E a) 
	{operation = new TACeilingInt(a);}
	<E extends TADoubleValue> TACeiling (E a)
	{operation = new TACeilingDouble(a);}
	
	
	
	
	<E extends TAIntValue> TACeiling (E a, String s)
	{operation = new TACeilingInt(a,s);}
	<E extends TADoubleValue> TACeiling (E a, String s)
	{operation = new TACeilingDouble(a,s);}
	
	
	
	

	
	
	TACeiling operation;
	String name;
	
}

