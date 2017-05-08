
public class TAForEvery extends TAObject implements TABoolValue {
	
	/*
	 * Class TaForEvery takes in as input a domain (represented by a TASet element)
	 * a boolean expression and the variable that will depend on the domain.
	 * If the expression is true for all elements in the domain, then TAForEvery returns true, otherwise it returns flase
	 * 
	 * This function also implements:
	 * Construction
	 * List()
	 * Evaluate()
	 */
	
	TAForEvery operation; //To keep consistency with other classes
	
	public boolean value()
	{
		return operation.value();
	}
	
	String type()
	{
		return "for every";
	}
	
	public void list()
	{
		operation.list();
	}


	public void evaluate() {
		
		operation.evaluate();
	}
	
	void printState()
	{
		operation.printState();
	}
	
	void setExpression()
	{
		
	}
	
	
	//Constructors to determine the operand types
	 TAForEvery (TASetBool D, TABoolValue expression, TABool x)
	{
		operation = new TAForEveryBool(D,expression,x);
	}

	 TAForEvery (TASetInt D, TABoolValue expression, TAInt x)
	 {
			operation = new TAForEveryInt(D,expression,x);
	 }

	 TAForEvery (TASetDouble D, TABoolValue expression, TADouble x)
	 {
			operation = new TAForEveryDouble(D,expression,x);
	}

	 
	

	protected TAForEvery()
	{
		
	}
}
