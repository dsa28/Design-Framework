
public class TAForEveryBool extends TAForEvery {


    String name;
    
    TABool x; //The variable to be changed; the variable should be a primitive and not an expression
    TASetBool domain; //The domain where the formula will be evaluated
    TABoolValue expression; //The formula itself
    
   
    boolean value; //Result of the operation
    
  
    
  
    void setExpression(TABoolValue e,TABool x)
    {
       expression = e;
       this.x= x;
    }
    
    
    
    public void list()
    {
    	ListStrategy.list("for every ", x, " in ", domain, ": ", expression);
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
           domain.start();
           
           do
           {
        	 
            	x.set(domain.getObject().value()); //Set the value of the variable to the value of an element in the set
            	expression.evaluate(); //Evaluate the expression
            	
            
            	if (!expression.value()) //One element is false; that's it- the result is false
                {
            	
                    value = false;
                    return; //We are done
                }
            } while (domain.next());
            
            //All values are true!
            value = true;
        
        }
    }
     
     public boolean value()
     {
    	 return value;
     }
    
     void printState()
     {
    	System.out.print(value);
     }
     
	    TAForEveryBool( TASetBool D)
	    {
	        domain = D;
	    }
	    
	    TAForEveryBool(String x, TASetBool D)
	    {
	        name = x;
	        domain = D;
	    }
	    
	     TAForEveryBool(TASetBool D, TABoolValue formula, TABool x)
	    {
	    
	    	domain = D;
	    	expression = formula;
	    	this.x = x;
	    	
	    }
}
