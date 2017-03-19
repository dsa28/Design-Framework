
public class TATest3 {

	public static void main(String[] args) {
		
		TABool b1 = new TABool("b1");
		TABool b2 = new TABool("b2");
		TABool b3 = new TABool("b3");
		
		TAInt x = new TAInt("x");
		TAInt one = new TAInt("1");
		TAInt two = new TAInt("2");
		
		one.set(1);
		two.set(2);
		
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
		
		assign = new TAAssign(b2,new TAOr(b1,b3));
		b1.set(true);
		b3.set(false);
		
		//Test 2: another basic test for TAAssign
		assign.list(); //Should print (b2 = (or b1 b3))

		System.out.println();
		
		assign.evaluate();
		b1.printState();// should print true
		System.out.println();
		b2.printState(); //Should print true
		System.out.println();
		
		b1.set(false);
		b3.set(false);
		
		//Test 3: Condition statement and empty statement 
		TAEmptyStatement s = new TAEmptyStatement();
		
		TACondition condition = new TACondition(b2,assign,s);
		condition.list();//Should print (if (b2) then (b2 = (or b1 b3) else "")
		
		System.out.println();
		condition.evaluate();
		b2.printState(); //Should print false
		System.out.println();
		
		//Test 4 and 5: Condition statement and assignment for integers
		TAAssign a1 = new TAAssign(x,new TAPlusInt(x,one));
		TAAssign a2 = new TAAssign(x,new TAPlusInt(x,two));
		x.set(0);
		
		condition = new TACondition(b2,a1,a2);
		
		//Test 4
		condition.list(); //Should print (if (b2) then (x = (+ x 1)) else (x = (+ x 2)))
		
		System.out.println();
		condition.evaluate();
		x.printstate(); //Should print 2
		System.out.println();
		
		//Test 5
		b2.set(true);
		condition.evaluate();
		x.printstate(); //Should print 3
		System.out.println();
		
		
	}

}
