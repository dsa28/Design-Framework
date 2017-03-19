
public class TAAssign extends TAAtomicStatement {

	/*
	 * Because assignments can be done on all types of variables
	 * (TABool, TAInt, TADouble), we need to make a different version for each class
	 * 
	 */
	//Members
	String name;
	TAAssign operation;
	
	protected TAAssign()
	{
		
	}
	
	//Constructor
	//Boolean Constructor
	TAAssign( String name, TABool target,TABoolValue expression )
	{
		operation = new TAAssignBool(name,target,expression);
		this.name = name;
		
	}
	
	TAAssign (TABool target, TABoolValue expression)
	{
		operation = new TAAssignBool(target,expression);
	}
	
	
	//Integer Constructor
	TAAssign( String name, TAInt target,TAIntValue expression )
	{
		operation = new TAAssignInt(name,target,expression);
		this.name = name;

	}

	TAAssign (TAInt target, TAIntValue expression)
	{
		operation = new TAAssignInt(target,expression);
	}

	//Double Constructor
	TAAssign( String name, TADouble target,TADoubleValue expression )
	{
		operation = new TAAssignDouble(name,target,expression);
		this.name = name;

	}

	TAAssign (TADouble target, TADoubleValue expression)
	{
		operation = new TAAssignDouble(target,expression);
	}
		

	//Methods
	public void list()
	{
		operation.list();
		
	}
	
	public void evaluate()
	{
		operation.evaluate();
		
	}
	
	
	

}
