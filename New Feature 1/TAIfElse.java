class TAIfElse extends TAObject
{
	/*
	 * Class IfElse is similar to a factory class for the e1?e2:e3 feature
	 *  
	 *  For instance, depending on the types of arguments we will pass our IfElse constructor,
	 *  it will either generate a new TAIfElseBoolean object or a new TAIfElseNumeric object
	 *  which will be stored in the "operation" variable.
	 *
	 * Like all operations, it needs to implement the following methods:
	 * list()
	 * evaluate()
	 * printstate()
	 * 
	 * It also needs constructors for the following cases
	 * Formula and Formula
	 * Numeric and Numeric
	 * (For numeric and numric, we will make it illegal to mix doubles and integers)
	 * 
	 */
	
	
	TAIfElse operation; //This variable will store our generated object (TAIfElseNumeric or TAIfElseBoolean)
	//It depends on the argument type
	

	
	
	//List function to recursively print the expression
	void list()
	{
		operation.list();
		
	}
	
	
	//Recursively evaluate the expression 
	void evaluate()
	{
		operation.evaluate();
	}
	
	//Print the value of the function (Depends on the value of e1)
	void printstate()
	{
		operation.printstate();
	}
	
	
	
	//Constructors for all possible allowed cases:
	TAIfElse(TAFormula e1, TAFormula e2, TAFormula e3)
	{
		operation = new TAIfElseBool(e1,e2,e3);
	}
	
	<T extends TAIntValue>TAIfElse(TAFormula e1, T e2, T e3)
	{
		operation = new TAIfElseInt(e1,e2,e3);
	}
	
	<T extends TADoubleValue>TAIfElse(TAFormula e1, T e2, T e3)
	{
		
	}

	protected TAIfElse()
	{
		//Constructor by default that should be called by inherited classes
	}
	
	String type() {
		return "";
	}
	
	
}