
public class TAExists extends TAFormula implements TABoolValue {
	
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
	        
	        //domain has no elements, hence it is false
	        if (domainSize == 0)
	        {
	        	value = false;
	        }
	        else
	        {
	            for (domain.start(); domain.next(); )
	            {
	            	x.set(domain.getObject()); //Set the value of the variable to the value of an element in the set
	            	expression.evaluate(); //Evaluate the expression
	            	
	                if (!expression.value()) //One element is true; that's it- the result is true
	                {
	                    value = true;
	                    return; //We are done
	                }
	            }
	            
	            //All values are true!
	            value = false;
	        
	        }
	    }
	    
	     String type()
	     {
	    	 return "exists";
	     }
	     
	     
	     public boolean value()
	     {
	    	 return value;
	     }
		 
	     
	     TAExists( TASet D)
		    {
		        domain = D;
		    }
		    
	     TAExists(String x, TASet D)
		    {
		    	
		        name = x;
		        domain = D;
		    }
		    
	     TAExists(TASet D, TAFormula formula, TAObject x)
		    {
		    
		    	domain = D;
		    	expression = formula;
		    	this.x.set(x);
		    	
		    }



			
	    
	    
	    
	
}
