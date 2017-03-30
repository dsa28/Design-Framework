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
	
	TAState initial;
	TAState current;
	
	TAComponent(String s,TAState q0)
	{
		name = s;
		
		initial = q0; //designated initial state
		current = initial; //at t0, the state is the initial state
		
	}
	
	
	
}
