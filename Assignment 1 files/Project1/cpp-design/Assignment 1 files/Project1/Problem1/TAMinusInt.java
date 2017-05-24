
public class TAMinusInt<T extends TAIntValue> extends TAMinus implements TAIntValue {

	
	public void evaluate()
	 {
		op1.evaluate();
		 if (!single)
		 {op2.evaluate();
		 value = op1.value()-op2.value();}
		 else
		 value = -op1.value();
	 }
	 
	
	public void list()
	{
		if (name!= null)
			System.out.println(name);
		else
		{
			System.out.print("(- ");
			op1.list();
			if (!single)
			{
				System.out.print(" ");
				op2.list();
				System.out.print(")");
			}
			
			
		}
		
	}
	
	
	void printState()
	{
		System.out.print(value);
	}
	
	String type()
	{
		return "int";
	}
	
	
	 
	public int value()
	{return value;}
	
	
	
	
	
	
	TAMinusInt(T a)
	{
		op1 = a;
		single = true;
	}
	
	TAMinusInt (T a, String s)
	{
		this(a);
		name = s;
		
	}
	
	 TAMinusInt(T a, T b)
	{
		op1 = a;
		op2 = b;
		single = false;
		
	}
	 
	 TAMinusInt (T a, T b, String s)
	 {
		 this(a,b);
		 name = s;
	 }
	
	 
	
	 
	 
	T op1, op2;
	int value;
	
	
	
	
}
