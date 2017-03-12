import java.util.ArrayList;

public class TASetBool<T extends TABoolValue>  {

/*
 * A set that only contains booleans or operations that return booleans
 */
	 protected
     ArrayList<T> objPool;
     String domainSetName ; // This is the Set Name
     
     int fence; //Iterator
     
     
     public
  
     void list()
     {
    	 System.out.print(domainSetName);
     }
     
     //Adding objects to the domain
     void addObjectToPool (T object)
     {
         objPool.add(object);
     }
     
     
     //To be able to iterate through a set, we need to be able to
     //Return to the start
     //Find the last element 
     //Return the ith element
     //Find the next element
    
     void start()
     {
    	 fence = 0;
     }
     
     int size()
     {
    	 return objPool.size();
     }
     
     boolean next()
     {
    	 //Returns true while there are still objects in the set
    	 
    	 if (fence < size()-1)
    	 {
    		 fence++;
    		 return true;
    	 }
    	 
    	 return false;
     }
     
     
     T getObject()
     {
    	 return objPool.get(fence);
     }
     
   
     
     
     //Constructors
     TASetBool(String name)
     {
         domainSetName = name;
         objPool = new ArrayList<T>();
     }
     
   
      
}
