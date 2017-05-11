
public class TAExistsBool extends TAExists{

	  
	    
	    TABool x; //The variable to be changed; the variable should be a primitive and not an expression
	    TASetBool domain; //The domain where the formula will be evaluated
	    TABoolValue expression; //The formula itself
	    
	   
	    boolean value; //Result of the operation
	    
	  
	    
	  
	    
	    
	  	    
	    
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
	           domain.start();
	           
	           do
	           {
	        	 
	            	x.set(domain.getObject().value()); //Set the value of the variable to the value of an element in the set
	            	expression.evaluate(); //Evaluate the expression
	            	
	            
	            	if (expression.value()) //One element is true; that's it- the result is true
	                {
	            	
	                    value = true;
	                    return; //We are done
	                }
	            } while (domain.next());
	            
	            //All values are false!
	            value = false;
	        
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
	     
	     TAExistsBool( TASetBool D)
		    {
		        domain = D;
		    }
		
	     TAExistsBool(String x, TASetBool D)
		    {
		        name = x;
		        domain = D;
		    }
		    
	     TAExistsBool(TASetBool D, TABoolValue formula, TABool x)
		    {
		    
		    	domain = D;
		    	expression = formula;
		    	this.x = x;	
		    }
}
