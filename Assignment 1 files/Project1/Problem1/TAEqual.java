
public class TAEqual extends TAObject implements TABoolValue{
	
	private TAIntValue iop1,iop2;
	private TADoubleValue dop1,dop2;
	private TABoolValue bop1,bop2;
	
	private boolean bool; //true if operands are booleans
	private boolean integer; //true if operands are integers, false otherwise
	
	private boolean value;

	
	public boolean value()
	{
		return value;
	}
	
	public void evaluate()
	{
		if (bool)
		{
			value = bop1.value() == bop2.value();
		}
		else if (integer)
		{
			value = iop1.value() == iop2.value();
		}
		else 
		{
			value = dop1.value() == dop2.value();
		}
		//Compare the operands depending on their type and return the resulting value
	
		
		
	}
	
	public void list()
	{
		if (name != null)
		{
			ListStrategy.list(name);
		}
		else if (bool)
		{
			ListStrategy.list("==",bop1, bop2);
		}
		else if (integer)
		{
			ListStrategy.list("==", iop1, iop2);
		}
		else
		{
			ListStrategy.list("==", dop1, dop2);
		}
	}
	
	
	private TAEqual()
	{
		integer = false;
		bool = false;
	}
	
	
	TAEqual (TAIntValue a, TAIntValue b) 
	{
		this();
		integer = true;
		
		iop1 = a;
		iop2 = b;
	
	}
	
	

	TAEqual (TADoubleValue a, TADoubleValue b)
	{
		this();
		
		dop1 = a;
		dop2 = b;
		
	}
	
	TAEqual(TABoolValue a, TABoolValue b)
	{
		this();
		
		bool = true;
		bop1 = a;
		bop2 = b;
	
		
	}
	
	
	
	TAEqual (TAIntValue a, TAIntValue b, String s)
	{
		this(a,b);
		name = s;
		
	}
	
	TAEqual (TADoubleValue a, TADoubleValue b, String s)
	{
		this(a,b);
		name = s;
	}
	
	TAEqual (TABoolValue a, TABoolValue b, String s)
	{
		this(a,b);
		name = s;
	}
	
	
	
}
