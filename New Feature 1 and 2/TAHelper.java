
public class TAHelper {

	//Helper function
	//That implements several functions that would be too big to implement in their classes
	//(Messy code)
	
	//TODO: take care of duplicate code!!!
	
	
	public static boolean forEvery(TASetInt domain, TABoolValue expression, TAInt x)
	{

        int domainSize = domain.size();
     
        //domain has no elements, hence it is vacuously true
        if (domainSize == 0)
        {
        	return true;
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
                    return false; //We are done
                }
            } while (domain.next());
            
            //All values are true!
            return true;
	}
        
	}
	
	public static boolean forEvery(TASetBool domain, TABoolValue expression, TABool x)
	{

        int domainSize = domain.size();
        
        
        //domain has no elements, hence it is vacuously true
        if (domainSize == 0)
        {
        	return true;
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
            	
                  
                    return false; //We are done
                }
            } while (domain.next());
            
            //All values are true!
            return true;
	}
        
	}
	

	public static boolean forEvery(TASetDouble domain, TABoolValue expression, TADouble x)
	{

        int domainSize = domain.size();
     
        //domain has no elements, hence it is vacuously true
        if (domainSize == 0)
        {
        	return true;
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
            	
                  
                    return false; //We are done
                }
            } while (domain.next());
            
            //All values are true!
            return true;
	}
        
	}
	
	
	
}
