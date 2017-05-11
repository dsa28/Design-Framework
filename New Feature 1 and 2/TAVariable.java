
public class TAVariable extends TAObject{
/*
 * A TAVariable represents a variable value
 * It's used in expressions to represent the value to be replaced.
 * (In particular when using quantifiers for a domain)
 * 
 */
	
	TAObject value;
	
	public void evaluate()
	{
		value.evaluate();
	}
	
	public void list()
	{
		
	}
	
	String type()
	{
		return "var";
	}
	
	void set(TAObject target)
	{
		value = target;
	}
	
	
	//Constructors
	TAVariable (String name)
	{
		this.name = name;
	}
	
	TAVariable (String name, TAObject target)
	{
		this.name = name;
		value = target;
	}
	
}
