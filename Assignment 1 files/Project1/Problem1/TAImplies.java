
public class TAImplies extends TAFormula implements TABoolValue{
	
	
	TABoolValue op1, op2;
	boolean value;
	
	
	public boolean value()
	{
		return value;
	}
	
	String type()
	{
		return "bool";
	}
	
	public void list()
	{
		ListStrategy.list("implies", op1, op2);
	}
	
	
	public void evaluate()
	{
		if (op1.value() && !op2.value())
		{
			value = false;
		}
		else
		{
			value = true;
		}
	}
	
	
	TAImplies(TABoolValue a, TABoolValue b) 
	{
		
			op1 = a;
			op2 = b;
	
		
	}
	
	
	
	
}
