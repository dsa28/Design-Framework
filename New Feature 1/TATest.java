
public class TATest {

	public static void main (String[] args) {

		TABool b1 = new TABool("b1");
		TABool b2 = new TABool ("b2");
		
		
		TAIfElse ifelse = new TAIfElse(b1,b1,b2);
		
		ifelse.list(); //should print (b1?b1:b2)
		
		//Test 1: if b1 is false
		b1.set(false);
		ifelse.evaluate();
		ifelse.printstate(); //should print e2 
	
		System.out.println();
		
		//Test 2:  if b1 is true
		b1.set(true);
		ifelse.evaluate();
		ifelse.printstate(); //should print e1
		
		System.out.println();
		
		TAAnd a1 = new TAAnd (b1,b2);
		TAInt i1 = new TAInt ("i1");
		TAInt i2 = new TAInt ("i2");
		
		ifelse = new TAIfElse(a1,i1,i2);
		
		
		//Test 3: Testing the use of formulas instead of primitives
		//Testing the use of expressions instead of formulas of arguments
		b2.set(false);
		ifelse.evaluate();
		ifelse.printstate(); //should print i2
		
		
		//Testing for a1 true
		b2.set(true);
		ifelse.evaluate();
		ifelse.printstate(); //should print i1
	
	}

}
