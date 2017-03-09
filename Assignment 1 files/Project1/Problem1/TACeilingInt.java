public class TACeilingInt<T extends TAIntValue> extends TACeiling implements TAIntValue{
	
	String type()
	{
		return "int";
	}
	
	public void evaluate()
	{op.evaluate();
	value = op.value(); //the ceiling of an integer is the integer itself
	}
	
	public int value()
	{return value;}
	
	
	public void list()
	{
		if (name != null)
			System.out.print(name);
		else
			{System.out.print("(ceiling" + " " );
			op.list();
			System.out.print(")");
			}
	}
	
	
	
	TACeilingInt (T a) 
	{op = a;}
	
	
	TACeilingInt (T a, String s)
	{op = a;
	name = s;}
	

	
	T op;
	int value;
	
	
}

