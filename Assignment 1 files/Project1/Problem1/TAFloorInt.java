public class TAFloorInt extends TAFloor implements TAIntValue{
	
	TAIntValue op;
	int value;
	
	
	String type()
	{
		return "int";
	}
	
	public int value()
	{
		return value;
	}
	
	public void evaluate()
	{
		op.evaluate();
		value = op.value(); //The floor of an integer is an integer
	}
	
	
	public void list()
	{
		if (name != null)
		{
			ListStrategy.list(name);
		}
		else
		{
			ListStrategy.list("floor");
		}
	}
	
	
	
	TAFloorInt (TAIntValue a) 
	{
		op = a;
	}
	
	
	TAFloorInt (TAIntValue a, String s)
	{
		op = a;
		name = s;
	}
	
	
	
	
	
}
