
public class TAFloor extends TANumericFunction implements TAIntValue{
	
	//Floor is a unary operator
	//It takes in an operand which can be either integer or double
	
	private TAIntValue iop;
	private TADoubleValue dop;
	private boolean integer; //true if operands are integers, false otherwise
	
	private int value;

	
	
	public int value()
	{
		return value;
	}
	
	
	public void list()
	{
		if (name != null)
		{
			ListStrategy.list(name);
		}
		else if (integer)
		{
			ListStrategy.list("floor", iop);
		}
		else
		{
			ListStrategy.list("floor", dop);
		}
	}
	
	

	
	public void evaluate()
	{
		
			if (integer)
			{
				iop.evaluate();
				
				value = iop.value(); //if its an integer no problem we're done
			}
			else
			{
				dop.evaluate();
				
				//if its a double, we need to find its floor
				value = (int)Math.floor(dop.value());
				
			}
			//Compare the operands depending on their type and return the reulting value
			
		
		
		
	}
	
	
	
	
	
	TAFloor (TAIntValue a) 
	{
		
		integer = true;
		iop = a;
		
	
	}
	
	TAFloor (TADoubleValue a)
	{
	
		integer = false;
		dop = a;
	
	}
		
	
	TAFloor (TAIntValue a, String s)
	{
		this(a);
		name = s;
	}
	
	TAFloor (TADoubleValue a, String s)
	{
		this(a);
		name = s;
	}
	
	

	
}

