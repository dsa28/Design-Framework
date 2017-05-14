
public class TAImplies extends TAObject implements TABoolValue{
	
	
	TABoolValue op1, op2;
	boolean value;
	
	
	public boolean value()
	{
		return value;
	}

	
	public void list()
	{
		ListStrategy.list("implies", op1, op2);
	}
	
	
	public void evaluate()
	{
		op2.evaluate();
		
		if (op2.value()) //if the second operand is true, the result is necessarily true
		{
			value = true;
			return;
		}
		
		op1.evaluate();
		value = !op1.value(); //if the second is false but the first is true- the result is false
		//otherwise, the result is true
		
		
	}
	
	
	TAImplies(TABoolValue a, TABoolValue b) 
	{
			op1 = a;
			op2 = b;

	}
	
	
	
	
}
