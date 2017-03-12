
public class TATest2 {
	/*
	 * Class to test the use of quantifiers (ForEvery and Exists)
	 */
	
	
	public static void main (String[] args) {

		TABool b1 = new TABool("b1");
		TABool b2 = new TABool("b2");
		
		TABool x = new TABool("x"); //Variable
		
		TASet D = new TASet("D"); //Domain 
		
		b2.set(false);
		b1.set(true);
		
		D.addObjectToPool(b2);
		D.addObjectToPool(b1);
		
		//Test for booleans:
		//The domain contains boolean values
		
		TAAnd a1 = new TAAnd (x,b1);
		
		//Test 1: testing the list and evaluate property
		TAForEvery q1 = new TAForEvery(D,a1,x); //Want to evaluate (x and b1) for x in D
		
		q1.list();//Should print (For every x in D: (& x b1))
		q1.evaluate(); 
		q1.pritnState();//Should print false
		
		System.out.println();
		
		//Test 2: testing the evaluate property for other parameters
		b2.set(true);
		
		q1.evaluate();
		q1.pritnState(); //Should print true
		
		
		
	}

}
