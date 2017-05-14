import java.util.ArrayList;

public abstract class TAObject {
	
	
	
	abstract String type();
	abstract void list();
	abstract void evaluate();

	
	
	//ArrayList<TAVariable> variables = new ArrayList<TAVariable>();
	//list of variables linked to this object
	//used for observer pattern in formulas
	
	String name;
	
	public void addOperands(TAValue a, TAValue b)
	{
		//Function to add the function to the operands 
		//for observer pattern
		
		a.addFunction(this);
		b.addFunction(this);
	}
	

	public void addFunction(TAObject function)
	{
		
		evaluate(); //in case there was already a value before adding the function
		//need to update it
		
		
		updateAll();
		
	}
	
	public void removeFunction(TAObject function)
	{
	}
	
	public void updateAll(){
		
	}

}
