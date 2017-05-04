
public class TAOr extends TAObject implements TABoolValue {

	TABoolValue op1, op2;
	boolean value;
	
	String type()
	{
		return "bool";
	}
	
	public void evaluate() {
	
		value = op1.value()||op2.value();
		updateAll();
		
	}
	
	
	public boolean value()
	{
		return value;
	}
	
	TAOr(TABoolValue a, TABoolValue b) 
	{
		
			
		op1 = a;
		op2 = b;
		
		addOperands(a,b);
		
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
	

}
