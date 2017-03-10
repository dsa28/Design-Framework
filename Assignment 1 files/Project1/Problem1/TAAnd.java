
public class TAAnd<T extends TABoolValue> extends TAFormula implements TABoolValue {

 /*
	 * The AND operator is a binary operator 
	 * which takes as input two boolean values
	 * and outputs a boolean value
	 */
	public String type()
	{return "boolean";}
	
	public void evaluate()
	{
		op1.evaluate();
		op2.evaluate();
		value= op1.value() && op2.value();
	}
	
	public boolean value()
	{
		return value;
	}
	
	TAAnd(T a, T b) 
	{
			op1 = a;
			op2 = b;	
	}
	
	
	
	public void list()
	{
		if (name!= null)
			System.out.println(name);
		else
		{
			System.out.print("(& ");
			op1.list();
			System.out.print(" ");
			op2.list();
			System.out.print(")");
			}
				
	}
	
	
	T op1,op2;
	boolean value;


	


		

}
