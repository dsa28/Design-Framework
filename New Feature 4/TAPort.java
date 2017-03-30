
public class TAPort {

	String name;
	boolean ready; //check if the port is ready
	int transitions; //number of transitions ready
	//if 0- the port is not ready otherwise it's ready
	
	TAPort (String name)
	{
		this.name = name;
		transitions = 0;
		ready = false; //new port- there are no ready transitions
	}
	
	
	
}
