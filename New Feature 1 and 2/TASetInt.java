import java.util.ArrayList;

public class TASetInt implements TAValue {
	/*
	 * A set that only contains integers or operations that return integers
	 */
		 protected
	     ArrayList<TAIntValue> objPool;
	     String domainSetName ; // This is the Set Name
	     
	     int fence; //Iterator
	     
	     
	     public
	  
	     void list()
	     {
	    	 System.out.print(domainSetName);
	     }
	     
	     //Adding objects to the domain
	     void addObjectToPool (TAIntValue object)
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
	     
	     
	     TAIntValue getObject()
	     {
	    	 return objPool.get(fence);
	     }
	     
	   
	     
	     
	     //Constructors
	     TASetInt(String name)
	     {
	         domainSetName = name;
	         objPool = new ArrayList<TAIntValue>();
	     }

		
		public void evaluate() {
			
			
		}
	     
	   
	      
	
}
