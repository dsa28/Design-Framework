
public class TAAssign extends TAStatement{

	//Members
	TAFormula e1;
	TABool t;
	
	
	//Constructor
	//Boolean Constructor
	TAAssign( String name, TABool target, TAFormula expression ){
		
		this.name = name;
		t = target;
		e1 = expression;
		
	}
	
	//Methods
	public void list()
	{
		System.out.print( name + " ( ");
		e1.list();
		System.out.print( " = ");
		t.list();
		System.out.print( " ) ");
		
	};
	
	public void evaluate()
	{
		e1.evaluate();
		t.set(e1.value());
		
	};
	
	
	
}
