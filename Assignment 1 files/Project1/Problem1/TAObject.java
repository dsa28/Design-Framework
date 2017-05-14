import java.util.ArrayList;

public abstract class TAObject {
	
	
	
	abstract void list();
	abstract void evaluate();


	
	String name;
	


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
