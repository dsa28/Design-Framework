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
	
	
	ArrayList <TAPort> readyPorts; //ready ports
	ArrayList<TATransition> eligible; //eligible transitions

	//Print the state of the component
	public void printState()
	{
		current.list();
	}
	
	public void printEligible()
	{
		for (int i=0; i < eligible.size(); i++)
		{
			eligible.get(i).list();
			System.out.println();
		}
		
	}
	
	
	//Select transition
	public void findEligible()
	{
		eligible = new ArrayList<TATransition>();
		
		for (int i=0; i<transitions.size(); i++)
		{
			TATransition t = transitions.get(i);
			if (t.getStateFrom().equals(current)) //transitions from the current state
			{
				if (t.getLabel() != null) //has a label
				{
					t.getLabel().guard.evaluate();
					
					if(t.getLabel().guard.value()) //and guard evaluates to true
					{
						eligible.add(t);
					}
				}
			}
		}
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
