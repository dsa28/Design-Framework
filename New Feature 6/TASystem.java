import java.util.ArrayList;

public class TASystem {

	private ArrayList<TAComponent> components;
	private ArrayList<TAInteraction> interactions;
	
	private ArrayList<TAInteraction> ready;
	
	public void findReady()
	{
		//find ready interactions and add them to ready
		ready = new ArrayList<TAInteraction>();
		
		for (int i=0; i<interactions.size();i++)
		{
			if (interactions.get(i).isReady())
			{
				ready.add(interactions.get(i));
			}
		}
	}
	
	public boolean isDeadlocked()
	{
		return ready.size()==0; //system is deadlocked if and only if 0 interactions are ready
	}
	
	public void addComponent(TAComponent component)
	{
		components.add(component);
	}
	
	public void addInteraction(TAInteraction interaction)
	{
		interactions.add(interaction);
	}
	
	TASystem()
	{
		components = new ArrayList<TAComponent>();
		interactions = new ArrayList<TAInteraction>();
		
		ready = new ArrayList<TAInteraction>();
		
	}
}
