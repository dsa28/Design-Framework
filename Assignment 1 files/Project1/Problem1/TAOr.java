
public class TAOr extends TAObject implements TABoolValue {

	TABoolValue op1, op2;
	boolean value;
	

	
	public void evaluate() {
	
		op1.evaluate();
		
		if (op1.value()) //optimization: if the first value is true, no need to evaluate the second
		{
			value = true;
			return;
		}
		
		op2.evaluate();
		value = op2.value();
		
		
	}
	
	
	public boolean value()
	{
		return value;
	}

	
	
	public void list()
	{
		if (name!= null)
		{
			ListStrategy.list(name);
		}
		else
		{
			ListStrategy.list("or", op1, op2);
		}
				
	}
	
	
	TAOr(TABoolValue a, TABoolValue b) 
	{	
		op1 = a;
		op2 = b;
		
	}

}
