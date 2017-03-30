
public class TACondition extends TAAtomicStatement {

	//Members
	TABoolValue e1;
	TAStatement s1;
	TAStatement s2;
	String name = "";


	//Constructor
	//Boolean Constructor
	TACondition( String name, TAStatement s1, TAStatement s2, TABoolValue expression )
	{
		this (expression,s1,s2);
		this.name = name;
		
	}
	
	TACondition (TABoolValue expression,TAStatement s1, TAStatement s2)
	{
		this.s1 = s1;
		this.s2 = s2;
		e1 = expression;
	}
	
	
	//Methods
	public void list()
	{
		ListStrategy.list("if ",e1," then ",s1," else ",s2);
	}

	
	public void evaluate(TAStatement a)
	{
		
		e1.evaluate();
		
		//When concurrently evaluating the if statement,
		//decide which statement to apply
		//and evaluate it concurrently with a
		
		if (e1.value())
		{
			s1.evaluate(a);
		}
		else
		{
			s2.evaluate(a);
		}

	}



}
