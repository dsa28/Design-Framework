import java.util.ArrayList;

public class TASet {
	/*
	 * Class TASet is used to describe domains.
	 * Users can create and fill their own sets
	 * This class will be used with the existential and universal quantifiers
	 * 
	 * A TASet contains elements and needs to be iterated through 
	 * (for now, all we need is to be able to explore all the elements of the set
	 * 
	 */
	     protected
	     ArrayList<TAObject> objPool;
	     String domainSetName ; // This is the Set Name
	     
	     int fence; //Iterator
	     
	     
	     public
	  
	     
	     //Adding objects to the domain
	     /*void addObjectToPool (TAObject object)
	     {
	         objPool.add(object);
	     }*/
	     
	     
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
	     
	     
	     TAObject getObject()
	     {
	    	 return objPool.get(fence);
	     }
	     
	    /* ArrayList getDomainSet()
	     {
	        return objPool;
	     }*/
	     
	     
	     //Constructors
	     TASet(String name)
	     {
	         domainSetName = name;
	         objPool = new ArrayList();
	     }
	     
	     protected TASet()
	     {
	    	 
	     }
	   
	      
	 
}
