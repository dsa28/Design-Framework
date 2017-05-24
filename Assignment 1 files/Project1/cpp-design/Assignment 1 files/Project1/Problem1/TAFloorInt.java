public class TAFloorInt<T extends TAIntValue> extends TAFloor implements TAIntValue{
	
	String type()
	{return "int";}
	
	public int value()
	{return value;}
	
	public void evaluate()
	{op.evaluate();
	value = op.value();}
	
	
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
	
	
	
	TAFloorInt (T a) 
	{op = a;}
	
	
	TAFloorInt (T a, String s)
	{op = a;
	name = s;}
	
	
	T op;
	int value;
	
	
}
