
public class TANot extends TAObject implements TABoolValue {
	
	TABoolValue op;
	boolean value;

	
	
	public void evaluate() {
		//op.evaluate();
		value = !(op.value());
		updateAll();
		
	}
	
	public boolean value()
	{
		return value;
	}
	
	TANot(TABoolValue a)
	{
		op = a;
		a.addFunction(this);
	}
	
	public void list()
	{
		if (name!= null)
		{
			ListStrategy.list(name);
		}
		else
		{
			ListStrategy.list("not", op);
		}
				
	}
	
	
}
