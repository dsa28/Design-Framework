import java.util.ArrayList;

public class TAFormula extends TAObject implements TABoolValue {

	/*
	 * A TAFormula is basically a TABoolValue with assigned variables
	 */
	
	TABoolValue equation;
	ArrayList<TAVariable> variables;
	
	@Override
	public void list() {
		equation.list();
		
	}

	@Override
	public void evaluate() {
		
		for (int i=0; i<variables.size();i++)
		{
			variables.get(i).evaluate();
		}
		
		equation.evaluate();
	}

	@Override
	public boolean value() {
		return equation.value();
	}
	
	public void addVariable(TAVariable var)
	{
		variables.add(var);
	}
	
	public void setEquation(TABoolValue bool)
	{
		equation = bool;
	}

	
	
}
