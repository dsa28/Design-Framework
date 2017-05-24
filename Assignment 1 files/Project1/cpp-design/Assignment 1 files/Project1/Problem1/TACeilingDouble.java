public class TACeilingDouble<T extends TADoubleValue> extends TACeiling implements TAIntValue{
	
	String type()
	{
		return "int";
	}
	
	public int value()
	{return value;}
	
	public void evaluate()
	{op.evaluate(); //need to update the value of the operand
	value = (int)Math.ceil(op.value()); }
	
	
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
	
	
	
	TACeilingDouble (T a) 
	{op = a;}
	
	
	TACeilingDouble (T a, String s)
	{op = a;
	name = s;}
	
	
	T op;
	int value;
	
	
}

