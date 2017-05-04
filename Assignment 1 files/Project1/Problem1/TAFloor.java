
public class TAFloor extends TANumericFunction implements TAIntValue{
	
	String type()
	{
		return "int";
	}
	
	public int value()
	{
		return operation.value();
	}
	
	
	
	protected TAFloor()
	{
		
	}
	
	
	
	
	 TAFloor (TAIntValue a) 
	{
		 operation = new TAFloorInt(a);
	}
	 
	 TAFloor (TADoubleValue a)
	{operation = new TAFloorDouble(a);}
	
	
	
	
	 TAFloor (TAIntValue a, String s)
	{
		 operation = new TAFloorInt(a,s);
	}
	 
	TAFloor (TADoubleValue a, String s)
	{
		operation = new TAFloorDouble(a,s);
		}
	
	
	
	

	
	
	TAFloor operation;
	String name;
	
}

