import java.util.ArrayList;

public class TATransition {

	/*
	 * A transition defines the change from one label to another
	 *
	 */
	
	
	//Current State
	TAState stateFrom;
	//Next State
	TAState stateTo;
	
	ArrayList<TATransitionLabel> labels; //we are assuming transitions have many labels
	
	ArrayList<TAPort> ports; //To check if a port is ready we need to check if
	//at least one of its transitions are ready
	//can do so by using observer pattern
	
	void addLabel(TATransitionLabel label)
	{
		labels.add(label); //add a transition label to the transition
	}
	
	TATransition (TAState from, TAState to)
	{
		stateFrom = from;
		stateTo = to;
		
		labels = new ArrayList<TATransitionLabel>();
		ports = new ArrayList<TAPort>();
	}
	
	
	
}
