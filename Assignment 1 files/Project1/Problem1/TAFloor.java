
public class TAFloor extends TAObject implements TAIntValue{
	
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
	{operation.list();}
	
	
	protected TAFloor()
	{}
	
	
	
	
	<E extends TAIntValue> TAFloor (E a) 
	{operation = new TAFloorInt(a);}
	<E extends TADoubleValue> TAFloor (E a)
	{operation = new TAFloorDouble(a);}
	
	
	
	
	<E extends TAIntValue> TAFloor (E a, String s)
	{operation = new TAFloorInt(a,s);}
	<E extends TADoubleValue> TAFloor (E a, String s)
	{operation = new TAFloorDouble(a,s);}
	
	
	
	

	
	
	TAFloor operation;
	String name;
	
}

