class TAIfElseBool extends TAIfElse
{
	//Three arguments, first one is the condition to be evaluated
	//The two other are the possible choices
	TAFormula e1;
	TAFormula e2;
	TAFormula e3;
	
	boolean value; //The value to which the if condition evaluates to

	
	//List functionality
	void list()
	{
		System.out.print("(");
		e1.list();
		System.out.print("?");
		e2.list();
		System.out.print(":");
		e3.list();
		System.out.print(")");
	}
	
	
	void evaluate()
	{
		e1.evaluate();
		if (e1.value())
		{
			value = e2.value();
		}
		else
		{
			value = e3.value();
		}
		
	}
	
	
	boolean value()
	{
		return value;
	}
	
	void printstate()
	{
		System.out.print(value);
	}
	
	
	TAIfElseBool(TAFormula e1, TAFormula e2, TAFormula e3) {
		
		this.e1 = e1;
		this.e2 = e2;
		this.e3 = e3;
	}
	
	}