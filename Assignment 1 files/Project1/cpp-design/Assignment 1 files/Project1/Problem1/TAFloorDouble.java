public class TAFloorDouble<T extends TADoubleValue> extends TAFloor implements TAIntValue{
	
	String type()
	{
		return "int";
	}
	
	public int value()
	{return value;}
	
	public void evaluate()
	{op.evaluate(); //need to update the value of the operand
	value = (int)Math.floor(op.value()); }
	
	
	public void list()
	{
		if (name != null)
			System.out.print(name);
		else
			{System.out.print("(floor" + " " );
			op.list();
			System.out.print(")");
			}
	}
	
	
	
	TAFloorDouble (T a) 
	{op = a;}
	
	
	TAFloorDouble (T a, String s)
	{op = a;
	name = s;}
	
	
	T op;
	int value;
	
	
}

