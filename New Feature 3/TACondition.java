
public class TACondition {

	//Members
		TAFormula e1;
		TAStatement s1;
		TAStatement s2;
		
		
		//Constructor
		//Boolean Constructor
		TACondition( TAStatement s1, TAStatement s2, TAFormula expression ){
			
			this.s1 = s1;
			this.s2 = s2;
			e1 = expression;
			
		}
		
		//Methods
		public void list()
		{
			System.out.print("If" + e1.name + "then" + s1.name + "else" + s2.name);
		};
		
		public void evaluate()
		{
			e1.evaluate();
			if (e1.value() == true)
			{
				s1.evaluate();
			}
			else
			{
				s2.evaluate();
			}
			
		};
		
		
	
}
