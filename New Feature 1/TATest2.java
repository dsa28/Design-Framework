
public class TATest2 {
	/*
	 * Class to test the use of quantifiers (ForEvery and Exists)
	 */
	
	
	public static void main (String[] args) {

		TABool b1 = new TABool("b1");
		TABool b2 = new TABool("b2");
		
		TABool x = new TABool("x"); //Variable
		
		TASetBool D = new TASetBool("D"); //Domain 
		
		b2.set(false);
		b1.set(true);
		
		D.addObjectToPool(b2);
		D.addObjectToPool(b1);
		
		//Test for booleans:
		//The domain contains boolean values
		
		TAAnd a1 = new TAAnd (x,b1);
		
		//Test 1: testing the list and evaluate property
		TAForEvery a = new TAForEvery(D,x,x);
		
		a.evaluate();//should return false
		a.printState();
		System.out.println();
		
		//Test 2
		b2.set(true);
		
		a.evaluate(); //Should return true
		a.printState();
		System.out.println();
		
		//Test 3
		TAForEvery q1 = new TAForEvery(D,a1,x); //Want to evaluate (x and b1) for x in D
		
		q1.list();//Should print (For every x in D: (& x b1))
		
		System.out.println();
		
		b2.set(false);
		q1.evaluate(); 
		q1.printState();//Should print false
		
		System.out.println();
		
		//Test 2: testing the evaluate property for other parameters
		b2.set(true);
		
		q1.evaluate();
		q1.printState(); //Should print true
		
		
		
	}

}
