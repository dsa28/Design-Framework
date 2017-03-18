public class TAFloorDouble extends TAFloor implements TAIntValue{
	
	TADoubleValue op;
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
		op.evaluate(); //need to update the value of the operand
		value = (int)Math.floor(op.value());
	}
	
	
	public void list()
	{
		if (name != null)
		{
			ListStrategy.list(name);
		}
		else
		{
			ListStrategy.list("floor", op);
		}
	}
	
	
	
	TAFloorDouble (TADoubleValue a) 
	{
		op = a;
	}
	
	
	TAFloorDouble (TADoubleValue a, String s)
	{
		op = a;
		name = s;
	}
	
	
	
	
	
}

