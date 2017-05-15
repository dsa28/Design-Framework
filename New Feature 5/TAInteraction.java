import java.util.ArrayList;
import java.util.HashMap;

public class TAInteraction {

	private ArrayList<TAPort> ports; //ports in the interaction
	private TABoolValue guard; //guard
	private TAStatement action; //action
	
	private HashMap<TAComponent,TAComponent> components;   //list of components.. used to simplify conflicts
	//Use hashmap because its easier to find a certain value having a key (O(1) instead of O(n))
	//and it removes duplicates- here we dont need duplicate components
	
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
	
	public boolean hasConflict(TAInteraction t) //Check if two interactions have conflicts
	{
		
		//only have conflict if both interactions have one or more components in common
		for (TAComponent c: components.values()) //for all components in this interaction, check if other interaction has them
		{
			if (t.contains(c)){
				
					return true; //the interactions are in conflict
				
			}
		}
		
		return false; //the interactions are not in conflict
	}
	
	public boolean contains(TAComponent c)
	{
		return components.containsKey(c);
	}
	
	public void evaluate()
	{
		action.evaluate(); //execute action
		
		for (int i=0;i<ports.size();i++)
		{
			ports.get(i).evaluate();
		}
		
	}
	
	public void addGuard(TABoolValue guard)
	{
		this.guard = guard;
	}
	
	public void addAction(TAStatement action)
	{
		this.action = action;
	}
	
	public void addPort(TAPort port)
	{
		ports.add(port);
		components.put(port.getComponent(),port.getComponent());
	}
	
	
	public void list()
	{
		for (int i=0; i < ports.size(); i++)
		{
			ports.get(i).list();
			System.out.print(",");
		}
		System.out.println();
		guard.list();
		System.out.println();
		action.list();
	}
	
	
	TAInteraction()
	{
		guard = new TABool("b1");
		action = new TAEmptyStatement();
		
		components = new HashMap<TAComponent,TAComponent>();
		ports = new ArrayList<TAPort>();
		
	}
	
	
}
