import java.util.ArrayList;

public class TASet {
	/*
	 * Class TASet is used to describe domains.
	 * Users can create and fill their own sets
	 * This class will be used with the existential and universal quantifiers
	 * 
	 * 
	 * 
	 */
	     
	     ArrayList objPool;
	     String domainSetName ; // This is the Set Name
	     
	     
	     
	     TASet(String name)
	     {
	         domainSetName = name;
	     };
	     
	     
	     
	     <T>void addObjectToPool (T object)
	     {
	         objPool.add(object);
	     }
	     
	     ArrayList getDomainSet()
	     {
	        return objPool;
	     }
	    
	 
}
