
public class TABool extends TAFormula implements TABoolValue{

	public boolean value()
	{
		return value;
	}
	
	
	public void list()
	{System.out.print(name);	}
	
	void set(boolean bool)
	{value=bool;}
	
	String type() {
		return "bool";
	}
	
	
	public void evaluate()
	{}
	
	void pritnState()
	{
		System.out.println(value);
	}
	
	
	TABool(String s,boolean a)
	{
		name = s;
		value = a;
	}
	
	TABool (String s)
	{
		value = false;
		name = s;
	}
	
	
	
	
	 boolean value;
	 

}
