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
	
	TAComponent(String s,TAState q0)
	{
		name = s;
		
		initial = q0; //designated initial state
		current = initial; //at t0, the state is the initial state
		
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
	
}
