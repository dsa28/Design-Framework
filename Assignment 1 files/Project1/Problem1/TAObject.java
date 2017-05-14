import java.util.ArrayList;

public abstract class TAObject {
	

	
<<<<<<< HEAD
	//abstract String type(); not used
	
	public abstract void list();
	public abstract void evaluate();
=======
	abstract String type();
	abstract void list();
	abstract void evaluate();
>>>>>>> parent of f8f95b3... Refactoring
	
	
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
	
<<<<<<< HEAD
	public void addFunction(TAObject function)
	{
		
		evaluate(); //in case there was already a value before adding the function
		//need to update it
		
		functions.add(function);
		updateAll();
		
	}
	
	public void removeFunction(TAObject function)
	{
		functions.remove(function);
	}
	
	public void updateAll()
	{
		for (int i=0;i<functions.size();i++)
		{
			functions.get(i).evaluate();
		}
	}
	
	public void listFunctions()
	{
		
		for (int i=0;i<functions.size();i++)
		{
			functions.get(i).list();
			System.out.println();
		}
	}
=======
>>>>>>> parent of f8f95b3... Refactoring
}
