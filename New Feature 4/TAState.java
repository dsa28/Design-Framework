import java.util.ArrayList;

public class TAState {

	String name;
	//TODO: Shouldn't we just make in one port for every state? A port is somehow a doorway to this state.
	ArrayList<TAPort> port;
	
	TAState (String name, ArrayList<TAPort> p)
	{
		this.name = name;	
		port = p;
	}
	
	
}
