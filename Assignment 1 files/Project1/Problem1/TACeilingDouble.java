public class TACeilingDouble extends TACeiling implements TAIntValue{
	
	/*
	 * Class TACeilingDouble- takes in a TADoubleValue and evaluates its ceiling
	 */
	
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
	
	{op.evaluate(); //need to update the value of the operand
	value = (int)Math.ceil(op.value());
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
	
	
	
	TACeilingDouble (TADoubleValue a) 
	{
		op = a;
	}
	
	


	
	
	
}

