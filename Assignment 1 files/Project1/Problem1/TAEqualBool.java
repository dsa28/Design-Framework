public class TAEqualBool extends TAEqual implements TABoolValue {

	TABoolValue op1, op2;
	boolean value;
	
	
	 public void evaluate()
	 {
		 op1.evaluate();
		 op2.evaluate();
		 value = (op1.value()==op2.value());
	}
	 
	 
	public void list()
	{
		if (name!= null)
		{
			ListStrategy.list(name);
		}
		else
		{
			ListStrategy.list("=", op1, op2);
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
	
	

	
	 TAEqualBool(TABoolValue a, TABoolValue b)
	{
		op1 = a;
		op2 = b;
		
	}
	 
	 TAEqualBool (TABoolValue a, TABoolValue b, String s)
	 {
		 this(a,b);
		 name = s;
	 }
	
	 
	
	
	
}