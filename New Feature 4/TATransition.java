
public class TATransition {

	/*
	 * A transition defines the change from one label to another
	 *
	 */
	
	
	//Current State
	TAState stateFrom;
	//Next State
	TAState stateTo;
	
	
	
	TATransition (TAState from, TAState to)
	{
		stateFrom = from;
		stateTo = to;
	}
	
	
}
