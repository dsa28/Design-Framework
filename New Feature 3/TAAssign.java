
public class TAAssign extends TAAtomicStatement{

	//Members
	String name;
	TABoolValue e1;
	TABool t;
	
	
	//Constructor
	//Boolean Constructor
	TAAssign( String name, TABool target,TABoolValue expression )
	{
		this(target,expression);
		this.name = name;
		
	}
	
	TAAssign (TABool target, TABoolValue expression)
	{
		t = target;
		e1 = expression;
	}
	
	
	//Methods
	public void list()
	{
		ListStrategy.list( "=",t, e1);
		
	}
	
	public void evaluate()
	{
		e1.evaluate();
		t.set(e1.value());
		
	}
	
	public TAAssign copy()
	{
		//When copying an assignment statement, we need to create a new variable 
		//in which we will store the result
		//This will be useful in concurrent list statements
		TABool clone = new TABool("temp");
		return new TAAssign(clone,t);
		
	}
	
	
	
}
