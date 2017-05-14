
public class TestClass {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		TAInt i = new TAInt("i");
		
		TAMinusInt minus = new TAMinusInt (i,i);
		TAPlus plus = new TAPlus(i,minus);

=======
		TAInt x = new TAInt("x");
		TAInt y = new TAInt("y");
		TAInt z = new TAInt("z");
		
		
		TAPlus p = new TAPlus(x,x);
		TAPlus p2 = new TAPlus(x,y);
		TAMultiply m1 = new TAMultiply(x,x);
		TAMultiply m2 = new TAMultiply(y,x);
		
		TAMultiply m4 = new TAMultiply(z,y);
		
		x.set(3);
		
		p.evaluate();
		p.printState();
		x.listFunctions();
>>>>>>> parent of af8e566... Refactoring old classes so they support observer pattern
	}

}
