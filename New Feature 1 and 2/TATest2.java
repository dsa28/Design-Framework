
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
		TAExists e = new TAExists (D,x,x);
		
		a.evaluate();//should return false
		a.printState();
		System.out.println();
		
		//Test 2; evaluate for there exists
		e.evaluate();
		e.printState();
		System.out.println(); //should print true
		
		//Test 3
		b2.set(true);
		
		a.evaluate(); //Should return true
		a.printState();
		System.out.println();
		
		//Test 4
		
		e.evaluate();
		e.printState();
		System.out.println(); //should print true
		
		
		System.out.println();
		
		//Test 5
		TAForEvery q1 = new TAForEvery(D,a1,x); //Want to evaluate (x and b1) for x in D
		
		q1.list();//Should print (For every x in D: (& x b1))
		
		System.out.println();
		
		b2.set(false);
		q1.evaluate(); 
		q1.printState();//Should print false
		
		System.out.println();
		
		//Test 6: testing the evaluate property for other parameters
		b2.set(true);
		
		q1.evaluate();
		q1.printState(); //Should print true
		System.out.println();
		
		b2.set(false);
		b1.set(false);
		
		//Test 7: Testing a false existential statement
		e.evaluate();
		e.printState();
		System.out.println(); //should print false
		
		
		System.out.println();
		
		
		TAInt i1 = new TAInt("i1");
		TAInt i2 = new TAInt("i2");
		TAInt i3 = new TAInt("i3");
		
		i1.set(1);
		i2.set(2);
		i3.set(3);
		
		TAInt temp = new TAInt("temp");
		
		TASetInt D2 = new TASetInt("D2");
		D2.addObjectToPool(i1);
		D2.addObjectToPool(i2);
		D2.addObjectToPool(i3);
		
		TAInt y= new TAInt("y");
		TAGreaterThan exp = new TAGreaterThan(y,temp);
		
		a = new TAForEvery(D2, exp, y);
		e = new TAExists(D2,exp, y);
		
		temp.set(0);
		//Test 7: Testing quantifiers for integers
		a.evaluate();
		a.printState();
		System.out.println();//should print true
		
		//Test 8
		e.evaluate();
		e.printState();
		System.out.println(); //should print true
		
		temp.set(2);
		
		System.out.println();
		
		//Test 9
		a.evaluate();
		a.printState();
		System.out.println();//should print false

		TAOr o = new TAOr(a,e);
		
		//Test 10
		e.evaluate();
		e.printState();
		System.out.println(); //should print true
		
		//Test 11
		o.evaluate();
		System.out.println(o.value()); //should print true

		temp.set(4);
		
		//Test 12
		e.evaluate();
		e.printState();
		System.out.println(); //should print false
		
		//Test 13
		o.evaluate();
		System.out.println(o.value()); //should print false 
       
		System.out.println();
		
		
		
		
		
		
		//Test 14: Finally, we need to test nested quantifiers
	
		a = new TAForEvery(D2,e,temp);
		a.list(); //Should print(for every temp in D2: (exists y in D2: (> y temp))
		a.evaluate();
		System.out.println();
		a.printState();
		System.out.println(); //Should print false
		
		TAEqual g2 = new TAEqual(y,new TAInt("1",1));
		
		TAOr or = new TAOr (exp, g2);
		
		//Test 15
		a = new TAForEvery(D2,or,y);
		e = new TAExists (D2,a,temp);
		
		
		
		e.list(); //Should print (exists temp in D2: (or (every y in D2: (> y temp) (= y 1))
		System.out.println();
		e.evaluate();
		e.printState(); //should print true
		System.out.println();
		
		
		
		
	}

}
