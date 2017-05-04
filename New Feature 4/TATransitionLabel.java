import java.util.ArrayList;

public class TATransitionLabel {
	
	//A transition label has 3 elements 
	//port, guard and action
	
	TAPort port;
	TAFormula guard;
	TAStatement action;
	
	
	void listVariables()
	{
		//List variables used in guard formula
		for (int i=0; i<guard.variables.size()-1; i++)
		{
			guard.variables.get(i).list();
			System.out.print(",");
		}
		
		guard.variables.get(guard.variables.size()-1).list();
	}
	
	TATransitionLabel(TAPort port, TAFormula guard, TAStatement action)
	{
		this.port = port;
		this.guard = guard;
		this.action = action;
	}
}
