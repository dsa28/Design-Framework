
public class TABool extends TAObject implements TABoolValue{

	/*
	 *Class TABool represents boolean primitives
	 *A TABool is forced to have a name
	 *If no value is given it takes "false" by default
	 */
	
		
	
	boolean value;

	
	public boolean value()
	{
		return value;
	}
	
	public void list()
	{
		ListStrategy.list(name);
	}
	
	
	void set(boolean bool)
	{
		value=bool;
	}
	
	
	public void evaluate()
	{}
	
	void printState()
	{
		System.out.print(value);
	}
	
	
	TABool (String s)
	{
		value = false;
		name = s;
	}
	
	TABool(String s,boolean a)
	{
		this(s);
		value = a;
	}
	
	

	 

}
