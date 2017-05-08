import java.util.ArrayList;

public class TAState {

	/*
	 * A state has a name, as well as a list of transitions possible from that state
	 */
	
	String name;
	private ArrayList<TATransition> transitions;
	//possible transitions you can have starting from this state
	//if youre in a certain state Q, it is impossible to do a transition that doesnt start at Q
	//hence, when selecting possible transitions, we need to select one from the state transitions
	//not from the total transitions of the system
	
	
	void list()
	{
		System.out.print(name);
	}
	
	void addTransition(TATransition t)
	{
		transitions.add(t);
	}
	
	
	TAState (String name)
	{
		this.name = name;	
		transitions = new ArrayList<TATransition>();
	}
	
}
