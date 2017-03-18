import java.util.Vector;

public class TAState {

	String name = "";
	//TODO: Shouldn't we just make in one port for every state? A port is somehow a doorway to this state.
	Vector <TAPort> port;
	
	TAState (String name, Vector<TAPort> p)
	{
		this.name = name;	
		port = p;
	}
	
	
}
