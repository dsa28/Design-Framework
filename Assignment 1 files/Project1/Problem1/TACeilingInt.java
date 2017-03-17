public class TACeilingInt extends TACeiling implements TAIntValue{
	
	TAIntValue op; //The operand
	int value; //The result
	
	
	
	String type()
	{
		return "int";
	}
	
	public void evaluate()
	{
		op.evaluate();
		value = op.value(); //the ceiling of an integer is the integer itself
	}
	
	public int value()
	{
		return value;
	}
	
	
	public void list()
	{
		if (name != null)
		{
			System.out.print(name);
		}
		else
		{
			System.out.print("(ceiling" + " " );
			op.list();
			System.out.print(")");
		}
	}
	
	
	
	TACeilingInt (TAIntValue a) 
	{
		op = a;
	}
	
	

	
}

