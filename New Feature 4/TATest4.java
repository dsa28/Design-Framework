
public class TATest4 {
	
	public static void main(String[] args)
	{
		TAState q0 = new TAState("q0");
		TAState q1 = new TAState("q1");
	
		TAComponent c1 = new TAComponent("component", q0); //Create a compoenent
		//It has an initial state and a name
		
		c1.addState(q1); //add state
		
		TATransition t1 = new TATransition(q0,q1);//transition
		
		c1.addTransition(t1);
		c1.printState(); //state is q0
	}
	
	

}
