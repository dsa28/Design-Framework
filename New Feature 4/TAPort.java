
public class TAPort {

	private String name;
	private boolean ready; //check if the port is ready
	private TATransition transition; //ready transition
	
	private TAComponent component; //component to which the port belongs to
	
	
	public void evaluate()
	{
		component.evaluate(transition);
	}
	
	//get the transition associated to a port
	public TATransition getTransition()
	{
		return transition;
	}
	
	
	//associate a transition to a port
	public void setTransition(TATransition transition)
	{
		ready = true;
		this.transition = transition;
		
	}
	
	public void printTransition()
	{
		if (transition != null)
		{
			transition.list();
		}
		else
		{
			System.out.print("port not ready");
		}
	}
	
	public void setComponent(TAComponent component)
	{
		this.component = component;
	}
	
	public TAComponent getComponent()
	{
		return component;
	}
	
	public void reset()
	{
		ready = false;
		transition = null;
	}
	
	boolean isReady()
	{
		return ready; //check if a port is ready
	}
	
	public void list()
	{
		ListStrategy.list(name);
	}
	
	TAPort (String name, TAComponent component)
	{
		//A port cannot exist without a component
		//Which is why we construct a port specifically for a component
		
		this.name = name;
		ready = false; //new port- there are no ready transitions
		
		component.addPort(this);
	}
}
