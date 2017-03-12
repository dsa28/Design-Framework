
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
		System.out.print(t.name + "=" + e1.name);
	};
	
	public void evaluate()
	{
		e1.evaluate();
		t.set(e1.value());
		
	};
	
	
	
}
