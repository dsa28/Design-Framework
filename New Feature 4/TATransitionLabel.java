import java.util.ArrayList;

public class TATransitionLabel {
	
	//A transition label has 3 elements 
	//port, guard and action
	
	TAPort port;
	TABoolValue guard;
	TAStatement action;
	
	ArrayList<TATransition> transition; //might need it to implement observer pattern
	//when the transition label guard changes, so do transitions
	
	
}
