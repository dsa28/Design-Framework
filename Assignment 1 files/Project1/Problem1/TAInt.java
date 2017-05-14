
public class TAInt extends TAObject implements TAIntValue {

	int value;
	
	
	void printstate()
	{
		System.out.print(value);
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
	{
		
	}
	
	

	//Default constructor
	TAInt(String s)
	{
			value = 0;
			name = s;
	}
		
		
	TAInt(String s,int a)
	{
		this(s);
		value = a;
	}
	
	
	


	
	

}
