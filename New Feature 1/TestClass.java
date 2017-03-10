
public class TestClass {

	public static void main(String[] args) {
		
		TAInt i = new TAInt("i");
		
		TAMinusInt minus = new TAMinusInt (i,i);
		TAPlus plus = new TAPlus(i,minus);

	}

}
