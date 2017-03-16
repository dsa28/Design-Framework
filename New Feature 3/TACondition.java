
public class TACondition {

	//Members
		TAFormula e1;
		TAStatement s1;
		TAStatement s2;
		String name = "";
		
		
		//Constructor
		//Boolean Constructor
		TACondition( String name, TAStatement s1, TAStatement s2, TAFormula expression ){
			
			this.name = name;
			this.s1 = s1;
			this.s2 = s2;
			e1 = expression;
			
		}
		
		//Methods
		public void list()
		{
			System.out.print( name + ": if ( ");
			e1.list();
			System.out.print( " ) then { ");
			s1.list();
			System.out.print( " } else { ");
			s2.list();
			System.out.print( " }");
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
