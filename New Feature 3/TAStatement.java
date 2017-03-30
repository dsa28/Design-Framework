
public abstract class TAStatement implements TAValue {

	/*
	 * Class TAStatement from which all statements will derive
	 * This class will help us implement non atomic statements (TASeqList, TAConcurrentList, TAWhile..))
	 * Extends TAObject to simplify some functions
	 */
	
	public void list() {}
	
	public void evaluate() {
		//To evaluate a statement,
		//First we will evaluate the right part
		//Then, according to the returned result, we will evaluate left
		
		//TAObject temp = evaluateRight();
		//evaluateLeft(temp);
	}
	
	//Evaluate left and right part separately
	//This could help in concurrent lists
	//abstract TAObject evaluateRight();
	//abstract TAObject evaluateLeft(TAObject temp); 
	
	String type()
	{
		return "Statement";
	}
}
