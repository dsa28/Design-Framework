import java.util.ArrayList;

public class TAComponent {

	/*
	 * A component has a set of states Q
	 * A set of ports P
	 * A designated initial state q0
	 */
	String name;
	
	ArrayList<TAState> states;
	ArrayList<TAPort> ports;
	ArrayList<TATransition> transitions;
	ArrayList<TATransitionLabel> labels;
	
	TAState initial;
	TAState current;
	

	//Print the state of the component
	void printState()
	{
		current.list();
	}
	
	
	//Cloning
	public TAComponent clone()
	{
		//TODO fix this
		
		TAComponent clone = new TAComponent(name,initial); //note, need to clone initial- not same one
		//or is it?
		
		
		return clone;
	}
	//Construction
	
	void addPort (TAPort port)
	{
		ports.add(port);
	}
	
	void addState (TAState state)
	{
		states.add(state);
	}
	
	void addTransition(TATransition transition)
	{
		transitions.add(transition);
	}
	
	void addLabel(TATransitionLabel label)
	{
		labels.add(label);
	}
	
	

	TAComponent(String s,TAState q0)
	{
		name = s;
		
		
		states = new ArrayList<TAState>();
		ports = new ArrayList<TAPort>();
		transitions = new ArrayList<TATransition>();
		labels = new ArrayList<TATransitionLabel>();
		
		addState(q0);
		initial = q0; //designated initial state
		current = initial; //at t0, the state is the initial state
		
	}
	
}
