import java.util.ArrayList;

public class TAInteraction {

	private ArrayList<TAPort> ports; //ports in the interaction
	private TABoolValue guard; //guard
	private TAStatement action; //action
	
	public boolean isReady()
	{
		for (int i=0; i<ports.size(); i++)
		{
			if (!ports.get(i).isReady()) //a port is not ready
			{
				return false;
			}
		}
		
		guard.evaluate();
		
		return guard.value(); //if all ports are ready, the interaction is ready if and only if guard is ready
		
	}
	
	public void evaluate()
	{
		action.evaluate(); //execute action
		
	}
	
	public void addGuard(TABoolValue guard)
	{
		this.guard = guard;
	}
	
	public void addAction(TAStatement action)
	{
		this.action = action;
	}
	
	
	TAInteraction()
	{
		
	}
	
	
}
