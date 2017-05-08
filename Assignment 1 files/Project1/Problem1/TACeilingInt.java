public class TACeilingInt extends TACeiling implements TAIntValue{
	
	TAIntValue op; //The operand
	int value; //The result
	
	
	
	String type()
	{
		return "int";
	}
	
	public void evaluate()
	{
		//op.evaluate();
		value = op.value(); //the ceiling of an integer is the integer itself
		updateAll();
	}
	
	public int value()
	{
		return value;
	}
	
	
	public void list()
	{
		if (name != null)
		{
			ListStrategy.list(name);
		}
		else
		{
			ListStrategy.list("ceiling", op);
		}
	}
	
	
	
	TACeilingInt (TAIntValue a) 
	{
		op = a;
		a.addFunction(this);
	}
	
	

	
}

