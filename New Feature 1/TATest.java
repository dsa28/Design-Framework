
public class TATest {

	public static void main (String[] args) {

		TABool b1 = new TABool("b1");
		TABool b2 = new TABool ("b2");
		
		
		TAIfElse ifelse = new TAIfElse(b1,b1,b2);
		
		ifelse.list(); //should print (b1?b1:b2)
		System.out.println();
		
		//Test 1: if b1 is false
		b1.set(false);
		b2.set(true);
		ifelse.evaluate();
		ifelse.printstate(); //should print true 
	
		System.out.println();
		
		//Test 2:  if b1 is true
		b1.set(true);
		b2.set(false);
		ifelse.evaluate();
		ifelse.printstate(); //should print true
		
		System.out.println();
		
		TAAnd a1 = new TAAnd (b1,b2);
		TAInt i1 = new TAInt ("i1");
		TAInt i2 = new TAInt ("i2");
		
		ifelse = new TAIfElse(a1,b1,b2);
		
		
		//Test 3: Testing the use of formulas instead of primitives
		b2.set(false);
		ifelse.evaluate();
		ifelse.printstate(); //should print false
		
		System.out.println();
		
		//Test 4: Testing for a1 true
		b2.set(true);
		ifelse.evaluate();
		ifelse.printstate(); //should print true
	
		
		System.out.println();
		
		//Test 5: Testing for expressions instead of formulas
		ifelse = new TAIfElse(b1,i1,i2);
		
		b1.set(false);
		ifelse.evaluate();
		ifelse.printstate(); //should print i2
		
		
		//Test 6: Mixing formulas and expressions
		TANot not = new TANot(b1);
		ifelse = new TAIfElse(not,i1,i2);
		
		ifelse.evaluate();
		ifelse.printstate(); //should print i1
		
	}

}
