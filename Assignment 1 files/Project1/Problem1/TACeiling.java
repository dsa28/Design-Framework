
public class TACeiling extends TANumericFunction implements TAIntValue{
	
	//Ceiling is a unary operator
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
				ListStrategy.list("ceiling", iop);
			}
			else
			{
				ListStrategy.list("ceiling", dop);
			}
		}
		
		

		
		public void evaluate()
		{
			
				if (integer)
				{
					value = iop.value(); //if its an integer no problem we're done
				}
				else
				{

					//if its a double, we need to find its ceiling
					value = (int)Math.ceil(dop.value());
					
				}
				//Compare the operands depending on their type and return the reulting value
				
				updateAll();
			
			
		}
		
		
		
		
		
		TACeiling (TAIntValue a) 
		{
			
			integer = true;
			iop = a;
			
			a.addFunction(this);
		}
		
		TACeiling (TADoubleValue a)
		{
		
			integer = false;
			dop = a;
		
			a.addFunction(this);
			
		}
			
		
		TACeiling (TAIntValue a, String s)
		{
			this(a);
			name = s;
		}
		
		TACeiling (TADoubleValue a, String s)
		{
			this(a);
			name = s;
		}
		
		

	
}

