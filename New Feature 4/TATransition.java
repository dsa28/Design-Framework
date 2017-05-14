import java.util.ArrayList;

public class TATransition {

	/*
	 * A transition defines the change from one label to another
	 *
	 */
	
	
	//Current State
	private TAState stateFrom;
	//Next State
	private TAState stateTo;
	
	private TATransitionLabel label; //we are assuming transitions has only one label
	

	public void list()
	{
		stateFrom.list();
		System.out.print(",");
		stateTo.list();
		
		if (label != null)
		{
			System.out.println();
			label.list();
		}
	}
	
	
	TAState getStateTo()
	{
		return stateTo;
	}
	
	TAState getStateFrom()
	{
		return stateFrom;
	}
	
	TATransitionLabel getLabel()
	{
		return this.label;
	}
	
	void setLabel(TATransitionLabel label)
	{
		this.label = label; //add a transition label to the transition
	}
	
	private TATransition()
	{
		
	}
	
	TATransition (TAState from, TAState to)
	{
		this();
		stateFrom = from;
		stateTo = to;
		
	
	}
	
	
	
}
