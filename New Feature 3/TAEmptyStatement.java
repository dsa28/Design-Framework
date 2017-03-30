
public class TAEmptyStatement extends TAStatement{

	String name;
	
	TAEmptyStatement ( String name)
	{
		this.name = name;
	}
	
	TAEmptyStatement()
	{
		
	}
	
	//Methods
	
	public void evaluate(TAStatement a)
	{
		//Does nothing
		if (a.getClass() != this.getClass()) //not an empty statement
		{
			a.evaluate();
		}
	}
	
	public void list()
	{
		//empty statements are represented by two quotations
		ListStrategy.list("\"\"");
	}
	
}
