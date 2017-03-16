
public class TAWhile {

	//Members
	TAStatement t;
	TAFormula e;
	String name ="";
	
	//Constructor
	TAWhile (String name, TAStatement t, TAFormula e)
	{
		this.name = name;
		this.t= t;
		this.e = e;
	}
	
	//Methods
	public void evaluate ()
	{
		e.evaluate();
		if (e.value() == true)
		{
			//It evaluates our target statement t
			t.evaluate();
			//Then recalls evaluate() of TAWhile using recursion
			this.evaluate();
		}
		else
		{
			//End of function, goes upwards in case of recursion
		}
	}
	
	public void list()
	{
		System.out.print( name + ": While ( ");
		e.list();
		System.out.print( " ) evaluate ");
		t.list();
		System.out.print( " else do nothing. ");
	}
	
	
}
