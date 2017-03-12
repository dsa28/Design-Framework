
public class TAForEvery extends TABool {
	
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
	
	
	    String name;
	    
	    
	    TASet domain; //The domain where the formula will be evaluated
	    TAFormula expression; //The formula itself
	    TAVariable x; //The variable that will be affected
	    
	    //To do: Find a solution for different types of variables
	    //Maybe different subclasses depending on type? (TAForEveryBool, TAForEveryInt, TAForEveryDouble)
	    
	    boolean value; //Result of the operation
	    
	  
	    
	  
	    void setExpression(TAFormula e,TAObject x)
	    {
	        expression = e;
	        this.x.set(x);
	    }
	    
	    
	    
	    public void list()
	    {
	    	
	    }
	    
	     public void evaluate()
	    {
	        
	        int domainSize = domain.size();
	        
	        //domain has no elements, hence it is vacuously true
	        if (domainSize == 0)
	        {
	        	value = true;
	        }
	        else
	        {
	            for (domain.start(); domain.next(); )
	            {
	            	x.set(domain.getObject()); //Set the value of the variable to the value of an element in the set
	            	expression.evaluate(); //Evaluate the expression
	            	
	                if (!expression.value()) //One element is false; that's it- the result is false
	                {
	                    value = false;
	                    return; //We are done
	                }
	            }
	            
	            //All values are true!
	            value = true;
	        
	        }
	    }
	    
	     
		    TAForEvery( TASet D)
		    {
		    	super("TAFor");
		        domain = D;
		    }
		    
		    TAForEvery(String x, TASet D)
		    {
		    	super("TAFor");
		        name = x;
		        domain = D;
		    }
		    
		    TAForEvery(TASet D, TAFormula formula, TAObject x)
		    {
		    	super("TAFor");
		    	domain = D;
		    	expression = formula;
		    	this.x.set(x);
		    	
		    }
}
