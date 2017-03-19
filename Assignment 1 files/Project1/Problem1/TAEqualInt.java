public class TAEqualInt extends TAEqual implements TABoolValue {

	TAIntValue op1, op2;
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
			ListStrategy.list("==", op1, op2);
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
	{return value;}
	


	
	 TAEqualInt(TAIntValue a, TAIntValue b)
	{
		op1 = a;
		op2 = b;
		
	}
	
	 
	
}