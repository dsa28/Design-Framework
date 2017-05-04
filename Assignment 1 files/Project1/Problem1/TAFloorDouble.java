public class TAFloorDouble extends TAFloor implements TAIntValue{
	
	TADoubleValue op;
	int value;
	
	public int value()
	{
		return value;
	}
	
	public void evaluate()
	{
		//op.evaluate(); //need to update the value of the operand
		value = (int)Math.floor(op.value());
		updateAll();
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
		a.addFunction(this);
	}
	
	
	TAFloorDouble (TADoubleValue a, String s)
	{
		this(a);
		name = s;
	}
	
	
	
	
	
}

