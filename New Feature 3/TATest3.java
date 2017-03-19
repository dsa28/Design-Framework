
public class TATest3 {

	public static void main(String[] args) {
		
		TABool b1 = new TABool("b1");
		TABool b2 = new TABool("b2");
		
		b1.set(true);
		
		
		TAAssign assign = new TAAssign(b1,new TAAnd(b1,b2));
		
		b2.set(false);
	
		//Test 1: testing if assignment statement works
		assign.list();//Should print (b1 = (& b1 b2))
		
		System.out.println();
		
		assign.evaluate();
		b1.printState(); //Should print false
		System.out.println();
		b2.printState(); //Should print false
		System.out.println();
		
		assign = new TAAssign(b2,new TAOr(b1,b2));
		b1.set(true);
		
		//Test 2: another basic test for TAAssign
		assign.list(); //Should print (b2 = (or b1 b2))

		System.out.println();
		
		assign.evaluate();
		b1.printState();// should print true
		System.out.println();
		b2.printState(); //Should print true
		System.out.println();
		
	}

}
