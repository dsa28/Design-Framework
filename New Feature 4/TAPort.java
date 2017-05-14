
public class TAPort {

	String name;
	boolean ready; //check if the port is ready

	
	TAPort (String name)
	{
		this.name = name;
		ready = false; //new port- there are no ready transitions
	}
	
	
	boolean isReady()
	{
		return ready; //check if a port is ready
	}

	
}
