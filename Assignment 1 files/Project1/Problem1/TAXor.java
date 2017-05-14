
public class TAXor extends TAObject implements TABoolValue {
	
	TABoolValue op1, op2;
	boolean value;

	
	
	public void evaluate()
	{
		op1.evaluate();
		op2.evaluate();
		
		value = (op1.value()||op2.value()) && !(op1.value()&&op2.value());
		
		
	}
	
	public boolean value()
	{
		return value;
	}
	
	TAXor(TABoolValue a, TABoolValue b) 
	{
		
			op1 = a;
			op2 = b;
			
	}
	
	
	public void list()
	{
		if (name!= null)
		{
			ListStrategy.list(name);
		}
		else
		{
			ListStrategy.list("xor", op1, op2);
		}	
	}
	
	
	
}
