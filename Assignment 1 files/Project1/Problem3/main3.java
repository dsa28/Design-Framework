
public class main3 {

	public static void main (String[] args) throws TAException {

		TAConstant N = new TAConstant(16);
		TAConstant one = new TAConstant(1);
		
		TAInt x = new TAInt("x");
		TADouble d = new TADouble("d");
		TAPair p = new TAPair(x,d);
		
		
		TAArray a = new TAArray("a", x.value(), N);
		TAInt i = new TAInt("i");
		TAPlus exp = new TAPlus(i,one);
		TAPair p2= new TAPair(i,x);
		i.set(1);
		
		
	
	}

}
