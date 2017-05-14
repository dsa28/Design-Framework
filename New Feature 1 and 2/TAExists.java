
public class TAExists extends TAObject implements TABoolValue  {
	
	/*
	 * Class TAExists which represents the existential quantifier
	 * It takes in as input a domain (represented by a TASet element)
	 * and a boolean expression.
	 * If the expression is true for at least one elements in the domain, then it returns true, otherwise it returns flase
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
			ListStrategy.list("exists ", ivariable, " in ", idomain, ": ", expression);
		}
		else if (bool)
		{
			ListStrategy.list("exists ", bvariable, " in ", bdomain, ": ", expression);
		}
		else
		{
			ListStrategy.list("exists ", dvariable, " in ", ddomain, ": ", expression);
		}
	}
	
	

	public void evaluate() {
		
		if (bool)
		{
			value = TAHelper.exists(bdomain, expression, bvariable);
		}
		else if (integer)
		{
			value = TAHelper.exists(idomain, expression, ivariable);
		}
		else
		{
			value = TAHelper.exists(ddomain, expression, dvariable);
		}
		

	}
	
	void printState()
	{
		System.out.print(value);
	}
	
	TAExists(TABoolValue expression)
	{
		this.expression = expression;
		
	}
	
	//Constructors to determine the operand types
	 TAExists (TASetBool D, TABoolValue expression, TABool x)
	{
		 this(expression);
		 bool = true;
		 
		 bdomain = D;
		 bvariable = x;
		 
		
	}

	 TAExists (TASetInt D, TABoolValue expression, TAInt x)
	 {
		 this(expression);
		 integer = true;
		 
		 idomain = D;
		 ivariable = x;
		 

	 }

	 TAExists (TASetDouble D, TABoolValue expression, TADouble x)
	 {
		 this(expression);
		 ddomain = D;
		 dvariable = x;
		 
		
	}

	 
	

	protected TAExists()
	{
		
	}


			
	    
	    
	    
	
}
