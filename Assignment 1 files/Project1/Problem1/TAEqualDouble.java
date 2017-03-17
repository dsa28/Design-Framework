public class TAEqualDouble extends TAEqual implements TABoolValue {
	
	TADoubleValue op1, op2;
	boolean value;
	
	 public void evaluate()
	 {
		 op1.evaluate();
		 op2.evaluate();
		 value = op1.value()==op2.value();
	}
	 
	 
	public void list()
	{
		if (name!= null)
		{
			System.out.println(name);
		}
		else
		{
			System.out.print("(= ");
			op1.list();
			System.out.print(" ");
			op2.list();
			System.out.print(")");
		}
				
	}
	
	void printState()
	{
		System.out.print(value);
	}
	
	
	String type()
	{
		return "bool";
	}
	
	
	 
	public boolean value()
	{
		return value;
	}
	

	
	
	 TAEqualDouble(TADoubleValue a, TADoubleValue b)
	{
		op1 = a;
		op2 = b;
		
	}
	 
	 TAEqualDouble (TADoubleValue a, TADoubleValue b, String s)
	 {
		 this(a,b);
		 name = s;
	 }
	
	 
		
	
}