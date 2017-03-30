
public class TAWhile extends TAAtomicStatement{

	//Members
	TAStatement t;
	TABoolValue e;
	String name;

	//Constructor
	TAWhile (String name, TABoolValue e, TAStatement t)
	{
		this (e,t);
		this.name = name;
		
	}
	
	TAWhile (TABoolValue e, TAStatement t)
	{
		
		this.t= t;
		this.e = e;
	}
	
	
	//Methods
	public void evaluate ()
	{
		e.evaluate();
		while (e.value())
		{
			//It evaluates our target statement t
			t.evaluate();
			
			e.evaluate(); //reevaluates e
		//System.out.println("loop");
		
			//keeps going until the value of e is false
		}
		
	}
	
	public void list()
	{
		ListStrategy.list("while ", e, t);
	}
	
	
}
