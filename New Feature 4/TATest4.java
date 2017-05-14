
public class TATest4 {
	
	public static void main(String[] args)
	{
		TAState q0 = new TAState("q0");
		TAState q1 = new TAState("q1");
	
		TAPort p1 = new TAPort("p1");
		
		TABool b1 = new TABool("b1");
		b1.set(true);
		
		TABool b2 = new TABool("b2");
		b2.set(true);
		
		TATransitionLabel label = new TATransitionLabel(p1,b1,new TAEmptyStatement());
		TATransitionLabel l2 = new TATransitionLabel (p1,b2,new TAEmptyStatement());
		
		TAComponent c1 = new TAComponent("component", q0); //Create a compoenent
		//It has an initial state and a name
		
		c1.addState(q1); //add state
		
		TATransition t1 = new TATransition(q0,q1);//transition
		t1.setLabel(label);
		
		TATransition t2 = new TATransition(q1,q0);//transition
		t2.setLabel(label);
		
		TATransition t3 = new TATransition(q0,q0);//transition
		t3.setLabel(l2);
		
		c1.addTransition(t1);
		c1.addTransition(t2);
		c1.addTransition(t3);
		
		c1.printState(); //state is q0
		
		System.out.println();
		System.out.println();
		
		
		c1.findEligible();
		
		c1.printEligible();
		
		b2.set(false);
		
		c1.findEligible();
		System.out.println();
		
		c1.printEligible();
		
	}
	
	

}
