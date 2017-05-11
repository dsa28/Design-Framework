
public class TAExistsDouble extends TAExists {
	 String name;
	    
	    TADouble x; //The variable to be changed; the variable should be a primitive and not an expression
	    TASetDouble domain; //The domain where the formula will be evaluated
	    TABoolValue expression; //The formula itself
	    
	   
	    boolean value; //Result of the operation
	    
	  
	    
	  
	    void setExpression(TABoolValue e,TADouble x)
	    {
	       expression = e;
	       this.x= x;
	    }
	    
	    
	    
	    public void list()
	    {
	    	System.out.print("(exists ");
	    	x.list();
	    	System.out.print(" in ");
	    	domain.list();
	    	System.out.print(": ");
	    	expression.list();
	    	System.out.print(")");
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
	           domain.start();
	           
	           do
	           {
	        	 
	            	x.set(domain.getObject().value()); //Set the value of the variable to the value of an element in the set
	            	expression.evaluate(); //Evaluate the expression
	            	
	            
	            	if (!expression.value()) //One element is true; that's it- the result is true
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
	     
		    TAExistsDouble( TASetDouble D)
		    {
		        domain = D;
		    }
		    
		    TAExistsDouble(String x, TASetDouble D)
		    {
		        name = x;
		        domain = D;
		    }
		    
		     TAExistsDouble(TASetDouble D, TABoolValue formula, TADouble x)
		    {
		    
		    	domain = D;
		    	expression = formula;
		    	this.x = x;
		    	
		    }

}
