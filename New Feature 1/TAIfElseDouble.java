
public class TAIfElseDouble<T extends TADoubleValue> extends TAIfElse implements TADoubleValue
{
	//Three arguments, first one is the condition to be evaluated
	//The two other are the possible choices
	
		TAFormula e1;
		T e2;
		T e3;
		
		double value; //The value to which the if condition evaluates to

		
		//List functionality
		public void list()
		{
			System.out.print("(");
			e1.list();
			System.out.print("?");
			e2.list();
			System.out.print(":");
			e3.list();
			System.out.print(")");
		}
		
		
		public void evaluate()
		{
			e1.evaluate();
			if (e1.value())
			{
				value = e2.value();
			}
			else
			{
				value = e3.value();
			}
			
		}
		
		
		public double value()
		{
			return value;
		}
		
		void printstate()
		{
			System.out.print(value);
		}
		
		
		TAIfElseDouble(TAFormula e1, T e2, T e3) {
			
			this.e1 = e1;
			this.e2 = e2;
			this.e3 = e3;
		}
}
