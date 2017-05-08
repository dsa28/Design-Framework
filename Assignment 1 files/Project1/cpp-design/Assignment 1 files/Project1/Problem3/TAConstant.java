class TAConstant extends TAObject implements TAIntValue
{

	public int value() {
		return value;
	}

	String type() {
		return "int";
	}

	
	public void list() {
		System.out.print(value);
	}

	
	public void evaluate() {
	}
	
	
	TAConstant(int a)
	{value =a;}
	
	TAConstant (int a, String s)
	{value = a; 
	name = s;}
	
	
	private int value;
	
}