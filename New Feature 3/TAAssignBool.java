
public class TAAssignBool extends TAAssign{

	//Members
	String name;
	TABoolValue e1; //Boolean or formula 
	TABool t; //Needs to be a primitive so we can assign a value to it
	
	
	//Constructor
	//Boolean Constructor
	TAAssignBool( String name, TABool target,TABoolValue expression )
	{
		this(target,expression);
		this.name = name;
		
	}
	
	TAAssignBool (TABool target, TABoolValue expression)
	{
		t = target;
		e1 = expression;
	}
	
	
	//Methods
	public void list()
	{
		ListStrategy.list(t, " = ", e1);
		
	}
	
	public void evaluate(TAStatement a)
	{
		e1.evaluate(); //right side
		boolean temp = e1.value();
		a.evaluate(); //other equation
		t.set(temp); //assign 
		
	}
	

	
	
}
