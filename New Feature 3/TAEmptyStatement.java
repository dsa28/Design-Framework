
public class TAEmptyStatement extends TAStatement{

	TAEmptyStatement ( String name)
	{
		this.name = name;
	}
	
	//Methods
	
	public void evaluate()
	{
		//Does nothing
	}
	
	public void list()
	{
		System.out.print("Phi " + name);
	}
	
}
