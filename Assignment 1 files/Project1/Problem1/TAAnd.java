
public class TAAnd extends TAObject implements TABoolValue {

 /*
	 * The AND operator is a binary operator 
	 * which takes as input two boolean values
	 * and outputs a boolean value
	 */
	

	TABoolValue op1,op2;
	boolean value;

	
	
	public void evaluate()
	{
		op1.evaluate();
		
		if (!op1.value()) //optimization: if the value of op1 is false- no need to evaluate op2
		{
			value =  false;
			return;
		}
		
		op2.evaluate();
		value = op2.value(); 
	}
	
	public boolean value()
	{
		return value;
	}
	
	TAAnd(TABoolValue a, TABoolValue b) 
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
			ListStrategy.list("&", op1, op2);
		}
				
	}


	
	

	


		

}
