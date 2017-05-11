
public class TAAssignDouble extends TAAssign{


	//Members
	String name;
	TADoubleValue e1; //Boolean or formula 
	TADouble t; //Needs to be a primitive so we can assign a value to it
	
	
	//Constructor
	//Boolean Constructor
	TAAssignDouble( String name, TADouble target,TADoubleValue expression )
	{
		this(target,expression);
		this.name = name;
		
	}
	
	TAAssignDouble (TADouble target, TADoubleValue expression)
	{
		t = target;
		e1 = expression;
	}
	
	
	//Methods
	public void list()
	{
		ListStrategy.list( t," = ", e1);
		
	}
	
	public void evaluate(TAStatement a)
	{
		e1.evaluate();
		double temp = e1.value();
		a.evaluate();
		t.set(temp);
		
	}
	
	

}
