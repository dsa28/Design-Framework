
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
	
	public void evaluate()
	{
		//Does nothing
	}
	
	public void list()
	{
		//empty statements are represented by two quotations
		ListStrategy.list("\"\"");
	}
	
}
