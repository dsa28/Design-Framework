
public class TestClass {

	public static void main(String[] args) {
		
		//Testing for integers with numeric functions
		
		TAInt x = new TAInt("x");
		TAInt y = new TAInt("y");
		TAInt z = new TAInt("z");
		
		
		TAPlus p = new TAPlus(x,x);
		TAPlus p2 = new TAPlus(x,y);
		
		TAPlusInt p3 = new TAPlusInt(y,x);
		TAPlus p4 = new TAPlus(p3,y);
		
		TAMultiply m1 = new TAMultiply(x,x);
		TAMultiply m2 = new TAMultiply(y,x);
		
		TAMultiply m4 = new TAMultiply(z,y);
		
		TAMinus min = new TAMinus(z);
		TAMinus min2 = new TAMinus(z,y);
		
		x.set(3);
		y.set(2);
	
		p.evaluate();
		p.printState(); //6
		System.out.println();
		
		p4.evaluate();
		p4.printState(); //should be 7
		System.out.println();
		
		p3.evaluate();
		p3.printState(); //5
		System.out.println();
		
		p4.evaluate();
		p4.printState(); //should be 7
		
		System.out.println();
		
		z.set(3);
		m4.printState(); //6
		
		System.out.println();
		
		z.set(23);
		min.printState();
		
		System.out.println();
		System.out.println();
		
		p3.listFunctions();
		System.out.println();
		
		x.listFunctions();
		System.out.println();
		y.listFunctions();
		System.out.println();
		z.listFunctions();
		
		System.out.println();
		System.out.println();
		
		//Tests with booleans
		TABool b1 = new TABool("b1");
		TABool b2 = new TABool("b2");
		TABool b3 = new TABool("b3");
		
		TAAnd and = new TAAnd(b1,b2);
		TAOr or = new TAOr(and,b3);
		
		b3.listFunctions(); //should print (or (& b1 b2) b3)
		System.out.println();
		
		b1.set(false);
		b2.set(true);
		b3.set(false);
		
		System.out.println(or.value()); //false
		
		b3.set(true);
		
		System.out.println(or.value()); //true
		
		TAAnd and2 = new TAAnd(or,b2);
		
		and2.evaluate();
		System.out.println(and2.value()); //true
		
		TAAnd and3 = new TAAnd(or,b1);
		and3.evaluate();
		System.out.println(and3.value()); //false
		
		//New test
		TAAnd and4 = new TAAnd(b1,b2);
		TAAnd and5 = new TAAnd(b1,and4); 
		TAOr or2 = new TAOr(b3,and4); 
		
		System.out.println();
		
		System.out.println(or2.value()); //true
		System.out.println(and5.value()); //false
		
	}

}
