
public class TALessThan extends TAObject implements TABoolValue{
	
	//The less than operator returns a boolean
		//regardless of its operands
		//which can be either integer or double values
		
		private TAIntValue iop1,iop2;
		private TADoubleValue dop1,dop2;
		private boolean integer; //true if operands are integers, false otherwise
		

		private boolean value;
		
		
		
		public boolean value()
		{
			return value;
		}
		
		public void evaluate()
		{
			if (integer)
			{
				value = iop1.value() < iop2.value();
			}
			else
			{
				value = dop1.value() < dop2.value();
			}
			//Compare the operands depending on their type and return the resulting value
		
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
				ListStrategy.list("<", iop1, iop2);
			}
			else
			{
				ListStrategy.list("<", dop1, dop2);
			}
		}
		
	
		
		TALessThan (TAIntValue a,TAIntValue b) 
		{
		
			integer = true;
			iop1 = a;
			iop2 = b;
			addOperands(a,b);
		}
		
		TALessThan (TADoubleValue a, TADoubleValue b)
		{
			
			integer = false;
			dop1 = a;
			dop2 = b;
			addOperands(a,b);
			
		}
			
		
		
		
		TALessThan (TAIntValue a, TAIntValue b, String s)
		{
			this(a,b);
			name = s;
		}
		
		TALessThan (TADoubleValue a, TADoubleValue b, String s)
		{
			this(a,b);
			name = s;
		}
		
		
		
	

	
	
	
	
	
}
