
public class TAAssignInt extends TAAssign{


	//Members
	String name;
	TAIntValue e1; //Boolean or formula 
	TAInt t; //Needs to be a primitive so we can assign a value to it
	
	
	//Constructor
	//Boolean Constructor
	 TAAssignInt( String name, TAInt target,TAIntValue expression )
	{
		this(target,expression);
		this.name = name;
		
	}
	
	TAAssignInt (TAInt target, TAIntValue expression)
	{
		t = target;
		e1 = expression;
	}
	
	
	//Methods
	public void list()
	{
		ListStrategy.list( t, " = ", e1);
		
	}
	
	public void evaluate(TAStatement a)
	{
		
		e1.evaluate();
		int temp = e1.value();
		a.evaluate();
		t.set(temp);
		
	}

	
}
