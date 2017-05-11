
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
	
	  TAInt ivariable; //The variable to be changed; the variable should be a primitive and not an expression
	  TASetInt idomain; //The domain where the formula will be evaluated
	  
	  TADouble dvariable; 
	  TASetDouble ddomain; 
	  
	  TABool bvariable;
	  TASetBool bdomain;
	  
	  boolean integer;
	  boolean bool;
	  
	  TABoolValue expression; //The formula itself
	    
	   
	  boolean value; //Result of the operation
	    
	
	public boolean value()
	{
		return value;
	}
	
	
	public void list()
	{
		if (integer)
		{
			ListStrategy.list("for every ", ivariable, " in ", idomain, ": ", expression);
		}
		else if (bool)
		{
			ListStrategy.list("for every ", bvariable, " in ", bdomain, ": ", expression);
		}
		else
		{
			ListStrategy.list("for every ", dvariable, " in ", ddomain, ": ", expression);
		}
	}


	public void evaluate() {
		
		if (bool)
		{
			value = TAHelper.forEvery(bdomain, expression, bvariable);
		}
		else if (integer)
		{
			value = TAHelper.forEvery(idomain, expression, ivariable);
		}
		else
		{
			value = TAHelper.forEvery(ddomain, expression, dvariable);
		}
		
		updateAll();
	}
	
	void printState()
	{
		System.out.print(value);
	}

	
	protected TAForEvery(TABoolValue expression)
	{
		bool = false;
		integer = false;
		
		this.expression = expression;
	}
	
	
	//Constructors to determine the operand types
	 TAForEvery (TASetBool D, TABoolValue expression, TABool x)
	{
		 this(expression);
		 bool = true;
		 
		 bdomain = D;
		 bvariable = x;
		 
		
	}

	 TAForEvery (TASetInt D, TABoolValue expression, TAInt x)
	 {
		 this(expression);
		 integer = true;
		 
		 idomain = D;
		 ivariable = x;
		 
		
	 }

	 TAForEvery (TASetDouble D, TABoolValue expression, TADouble x)
	 {
		 this(expression);
		 
		 ddomain = D;
		 dvariable = x;
	}

	 
	
}
