
public class TAGreaterThan extends TAObject implements TABoolValue{
	
	
	//The greater than operator returns a boolean
	//regardless of its operands
	//which can be either integer or double values
	private TAIntValue iop1,iop2;
	private TADoubleValue dop1,dop2;
	private boolean integer; //true if operands are integers, false otherwise
	

	private boolean value;
	
	String type()
	{
		return "bool";
	}
	
	public boolean value()
	{
		return value;
	}
	
	public void evaluate()
	{
		if (integer)
		{
			value = iop1.greaterThan(iop2);
		}
		else
		{
			value = dop1.greaterThan(dop2);
		}
		//Compare the operands depending on their type and return the reulting value
		//operation.evaluate();
		updateAll();
	}
	
	public void list()
	{
		if (name != null)
		{
			ListStrategy.list(name);
		}
		else if (integer)
		{
			ListStrategy.list(">", iop1, iop2);
		}
		else
		{
			ListStrategy.list(">", dop1, dop2);
		}
	}
	
	
	protected TAGreaterThan()
	{
		
	}
	
	
	TAGreaterThan (TAIntValue a,TAIntValue b) 
	{
		//operation = new TAGreaterThanInt(a,b);
		integer = true;
		iop1 = a;
		iop2 = b;
		addOperands(a,b);
	}
	
	TAGreaterThan (TADoubleValue a, TADoubleValue b)
	{
		//operation = new TAGreaterThanDouble(a,b);
		integer = false;
		dop1 = a;
		dop2 = b;
		addOperands(a,b);
		
	}
		
	
	
	
	TAGreaterThan (TAIntValue a, TAIntValue b, String s)
	{
		this(a,b);
		name = s;
	}
	
	TAGreaterThan (TADoubleValue a, TADoubleValue b, String s)
	{
		this(a,b);
		name = s;
	}
	
	
	
	

	

	
}
