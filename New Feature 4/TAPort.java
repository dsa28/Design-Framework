
public class TAPort {

	private String name;
	private boolean ready; //check if the port is ready
	//private TATransition transition; //ready transition
	
	
	//get the transition associated to a port
	/*TATransition getTransition()
	{
		return transition;
	}
	
	
	//associate a transition to a port
	void setTransition(TATransition transition)
	{
		ready = true;
		this.transition = transition;
		
	}*/
	
	public void setReady(boolean ready)
	{
		this.ready = ready;
	}
	
	boolean isReady()
	{
		return ready; //check if a port is ready
	}
	
	public void list()
	{
		ListStrategy.list(name);
	}
	
	TAPort (String name)
	{
		this.name = name;
		ready = false; //new port- there are no ready transitions
	}
}
