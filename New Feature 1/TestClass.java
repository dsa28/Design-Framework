
public class TestClass {

	public static void main(String[] args) {
		
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
		System.out.println();
		
		p3.listFunctions();
		System.out.println();
		
		x.listFunctions();
		System.out.println();
		y.listFunctions();
		System.out.println();
		z.listFunctions();
		
		
	}

}
