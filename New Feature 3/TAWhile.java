
public class TAWhile {

	//Members
	TAStatement t;
	TAFormula e;
	
	//Constructor
	TAWhile (TAStatement t, TAFormula e)
	{
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
		System.out.print("While" + e.name + "evaluate" + t.name + "else done.");
	}
	
	
}
