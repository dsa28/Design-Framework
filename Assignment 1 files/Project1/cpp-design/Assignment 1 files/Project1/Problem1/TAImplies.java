
public class TAImplies<T extends TABoolValue> extends TAFormula implements TABoolValue{
	
	public boolean value()
	{
		return value;
	}
	
	String type()
	{
		return "bool";
	}
	
	public void list()
	{
		System.out.print("(");
		op1.list();
		System.out.print(" ");
		op2.list();
		System.out.print(")");
	}
	
	
	public void evaluate()
	{
		if (op1.value() && !op2.value())
			value = false;
		else
			value = true;
	}
	
	
	TAImplies(T a, T b) 
	{
		
			op1 = a;
			op2 = b;
		
		//value = new TABool();
		
	}
	
	
	T op1, op2;
	boolean value;
	
	
}
