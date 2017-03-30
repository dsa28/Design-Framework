
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
		
		TAInt i = new TAInt("i");
		TALessThan less = new TALessThan(i,new TAInt("5",5));
		TAPlusInt plus = new TAPlusInt(i,new TAInt("1",1)); 
		assign = new TAAssign(i,plus);
		
		TAWhile loop = new TAWhile(less,assign);
		
		//Test 6: testing while loops
		loop.list(); //Should print (while (< i 5) (+ i 1))
		loop.evaluate();
		System.out.println();
		i.printstate(); //should print 5
		System.out.println();
		
		TAEqual equal = new TAEqual(i,new TAInt("3", 3));
		TAAssign assign2 = new TAAssign(b1,new TABool("false",false));
		
		TAOr or = new TAOr (less, b1); //(or (< i 5) b1)
		TAAnd and = new TAAnd(less,b1);
		
		condition = new TACondition(equal, assign2, s) ;
		
		TASeqList list = new TASeqList(assign,condition);
		
		//Test 7 and 8: testing sequential statements
		i.set(0);
		b1.set(true);
		list.list(); //((i = (+ i 1));(if (== i 3) them (b1 = false) else ""))
		System.out.println();
		list.evaluate();
		b1.printState(); //should print true
		System.out.println();
		i.printstate();
		System.out.println(); //should print 1
		
		i.set(2);
		b1.set(true);
		list.evaluate();
		b1.printState(); //should print false
		System.out.println();
		i.printstate();
		System.out.println(); //should print 3
		
		
		//Test 9 and 10: using conditions in while loops
		//Plus testing sequence list 
		
		b1.set(true);
		i.set(0);
		//Test 9
		loop = new TAWhile(or,list);
		loop.list(); //Should print (while (or (< i 5) b1) ((+ i 1);(if (= i 3) (b1 = false))
		loop.evaluate();
		System.out.println();
		i.printstate(); //should print 5
		System.out.println();
		b1.printState(); //should print false
		System.out.println();
		
		
		b1.set(true);
		i.set(0);
		//Test 10
		loop = new TAWhile(and,list);
		loop.list(); //Should print (while (& (< i 5) b1) ((+ i 1);(if (= i 3) (b1 = false))
		loop.evaluate();
		System.out.println();
		i.printstate(); //should print 3
		System.out.println();
		b1.printState(); //should print false
		System.out.println();
		
		//Test 11:
		//Testing concurrent statements
		i.set(2);
		b1.set(true);
		
		TAConcurrentList concurrent = new TAConcurrentList(assign,condition);
		concurrent.list();
		concurrent.evaluate();
		System.out.println();
		b1.printState(); //Should print true 
		System.out.println();
		i.printstate(); //should print 3
		System.out.println();
		
		//Test 12: Comparing to sequential list
		i.set(2);
		b1.set(true);
		
		list.list();
		list.evaluate();
		System.out.println();
		b1.printState(); //should print false
		System.out.println();
		i.printstate(); //should print 3
		System.out.println();

		//Test 13: inverting the order of the statements
		i.set(2);
		b1.set(true);
		concurrent = new TAConcurrentList(condition,assign);
		concurrent.list();
		concurrent.evaluate();
		System.out.println();
		b1.printState(); //Should print true 
		System.out.println();
		i.printstate(); //should print 3
		System.out.println();
	}

}
