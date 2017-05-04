import java.util.ArrayList;

public abstract class TAObject {
	

	
	abstract String type();
	abstract void list();
	abstract void evaluate();
	
	
	//ArrayList<TAVariable> variables = new ArrayList<TAVariable>();
	//list of variables linked to this object
	//used for observer pattern in formulas
	
	String name;
	
	
}
