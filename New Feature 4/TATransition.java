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
	
	private ArrayList<TAPort> ports; //To check if a port is ready we need to check if
	//at least one of its transitions are ready
	//can do so by using observer pattern
	
	TAState getStateTo()
	{
		return stateTo;
	}
	void update(boolean g)
	{
		
	}
	
	void setLabel(TATransitionLabel label)
	{
		this.label = label; //add a transition label to the transition
	}
	
	private TATransition()
	{
		ports = new ArrayList<TAPort>();
	}
	
	TATransition (TAState from, TAState to)
	{
		this();
		stateFrom = from;
		stateTo = to;
		
		from.addTransition(this);
	
	}
	
	
	
}
