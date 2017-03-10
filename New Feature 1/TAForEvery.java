
public class TAForEvery<T> extends TABool {
	
	/*
	 * Class TaForEvery takes in as input a domain (represented by a TASet element)
	 * and a boolean expression.
	 * If the expression is true for all elements in the domain, then TAForEvery returns true, otherwise it returns flase
	 * 
	 * This function also implements:
	 * Construction
	 * List()
	 * Evaluate()
	 */
	
	
	    String name ="TAFor";
	    TASet domain;
	    TAFormula expression;
	    
	  
	    
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
	                if ( expression.set(domain[i]) != true)
	                {
	                    return false;
	                }
	            }
	            
	            return true;
	        }
	    }
	    
	    
}
