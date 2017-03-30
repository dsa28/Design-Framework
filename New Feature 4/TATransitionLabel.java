import java.util.ArrayList;

public class TATransitionLabel {
	
	//A transition label has 3 elements 
	//port, guard and action
	
	TAPort port;
	TABoolValue guard;
	TAStatement action;
	
	TATransitionLabel(TAPort port, TABoolValue guard, TAStatement action)
	{
		this.port = port;
		this.guard = guard;
		this.action = action;
	}
	
}
