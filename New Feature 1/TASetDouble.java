import java.util.ArrayList;

public class TASetDouble implements TAValue {
	/*
	 * A set that only contains booleans or operations that return booleans
	 */
		 protected
	     ArrayList<TADoubleValue> objPool;
	     String domainSetName ; // This is the Set Name
	     
	     int fence; //Iterator
	     
	     
	     public
	  
	     void list()
	     {
	    	 System.out.print(domainSetName);
	     }
	     
	     //Adding objects to the domain
	     void addObjectToPool (TADoubleValue object)
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
	     
	     
	     TADoubleValue getObject()
	     {
	    	 return objPool.get(fence);
	     }
	     
	   
	     
	     
	     //Constructors
	     TASetDouble(String name)
	     {
	         domainSetName = name;
	         objPool = new ArrayList<TADoubleValue>();
	     }

	
		public void evaluate() {
			
		}

		@Override
		public void addFunction(TAObject function) {
			// TODO Auto-generated method stub
			
		}
	     
}
