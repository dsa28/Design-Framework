
public class TATransitionLabel {
	
	//A transition label has 3 elements 
	//port, guard and action
	
	private TAPort port;
	TABoolValue guard;
	private TAStatement action;
	private TAComponent component;
	
	public TAPort getPort()
	{
		return port;
	}
	
	public void evaluate()
	{
		action.evaluate();
	}
	
	public void list()
	{
		
		port.list();
		System.out.print(",");
		guard.list();
		System.out.print(",");
		action.list();
		
	}
	
	
	TATransitionLabel(TAPort port, TABoolValue guard, TAStatement action)
	{
		this.port = port;
		this.guard = guard;
		this.action = action;
		
		this.component = port.getComponent();
	}
}
