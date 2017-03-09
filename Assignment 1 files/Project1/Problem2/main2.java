
public class main2 {

	public static void main (String[] args) throws TAException {

		TAInt x = new TAInt("x");
		TADouble d = new TADouble("d");
		TACeiling y = new TACeiling(d);
		TABool b = new TABool("b");
		TALessThan t1 = new TALessThan(x,y);
		TAAnd t2 = new TAAnd(b,t1);
		t2.list();
		
		TAPair p = new TAPair(x,d);
		
		x.set(5);
		d.set(2.3);
		b.set(true);
		
		t1.evaluate();
		System.out.println();
		t1.printState();
		d.set(5.3);
		t1.evaluate();
		t1.printState();
		
		TAMinus t3 = new TAMinus(x,x);
		TAMinus t4 = new TAMinus(d,d);
		TAPlus t5 = new TAPlus(x,x);

	   // t3.evaluate();
	    //t3.printState();
		//t1 = new TALessThan(x,d);
	}

}
