import java.util.ArrayList;

public class TAVariableFormula extends TAObject {


	/*
	 * The class TAVariableFormula is used to solve the problem of variables in quantifiers;
	 * an expression will have a list of variables, which will be used in formulas
	 * Updating the value of a TAVariable in the variable list will result to it being updated in the formula
	 * 
	 * 
	 * 
	 */
	ArrayList<TAVariable> var; //List of variables used in the variable formula
	TAFormula value; //The actual formula to be evaluated

	
	String type() {
		
		return "var";
	}

	
	void list() {
		
		value.list();
	}


	void evaluate() {
		
		value.evaluate();
		
	}
	
	

}
