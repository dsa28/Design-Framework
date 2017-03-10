
public class TAExists extends TABool {
	
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
	    String name ="TAExists";
	    TASet domain;
	    TAFormula expression;
	    
	    
	    
	    TAExists( TASet D)
	    {
	    	super("");
	        domain =  D;
	    }
	    
	    TAExists(String x, TASet D)
	    {
	    	super(x);
	        name = x;
	        domain = D;
	    }
	    
	    void setExpression(TAFormula e)
	    {
	        expression = e;
	    }
	    
	    
	    boolean evaluate()
	    {
	        ArrayList domain = domain.getDomainSet();
	        int domainSize = domain.size();
	        //domain has no elements hence the ForEvery function should normally return false because no x in D makes e(x) true.
	        if (domainSize == 0)
	        return false;
	        else
	        {
	            for (int i = 0; i < domainSize; i++)
	            {
	                if ( expression.set(domain[i]) == true)
	                {
	                    return true;
	                }
	            }
	            
	            return false;
	        }
	    }
	    
	    
	    
	    
	    
	    
	
}
