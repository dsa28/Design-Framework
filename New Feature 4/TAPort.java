
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
	
	
	boolean isReady()
	{
		return ready; //check if a port is ready
	}

	//TODO make sure of what class should use this method
	void updateState(boolean g)
	{
		//Function that will be called from TATransition using observer pattern
		//When a g changes value it will let the port know
		if (g)
		{
			ready = true;
			transitions++;
		}
		else //A g that was once true is now false
		{
			transitions--;
			if (transitions <= 0)
			{
				transitions = 0;
				ready = false;
			}
		}
	}
	
}
