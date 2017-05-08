public class TAFloorInt extends TAFloor implements TAIntValue{
	
	TAIntValue op;
	int value;
	
	
	
	
	public int value()
	{
		return value;
	}
	
	public void evaluate()
	{
		//op.evaluate();
		value = op.value(); //The floor of an integer is an integer
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
			ListStrategy.list("floor");
		}
	}
	
	
	
	TAFloorInt (TAIntValue a) 
	{
		op = a;
		a.addFunction(this);
	}
	
	
	TAFloorInt (TAIntValue a, String s)
	{
		this(a);
		name = s;
	}
	
	
	
	
	
}
