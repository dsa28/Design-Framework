
public class TAInt extends TAObject implements TAIntValue {

	int value;
	
	
	void printstate()
	{
		System.out.println(value);
	}
	
	
	public int value()
	{
		return value;
	}
	
	
	void set (int i)
	{
		value = i;
	}
	
	public void list()
	{
		ListStrategy.list(name);
	}
	
	public void evaluate()
	{}
	
	
	
	String type() {
		return "int";
	}

	
	TAInt(String s,int a)
	{
		name = s;
		value = a;
	}
	
	
	//Default constructor
	TAInt(String s)
	{
		value = 0;
		name = s;
	}
	


	
	

}
