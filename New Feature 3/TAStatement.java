
public abstract class TAStatement implements TAValue {

	/*
	 * Class TAStatement from which all statements will derive
	 * This class will help us implement non atomic statements (TASeqList, TAConcurrentList, TAWhile..))
	 * Extends TAObject to simplify some functions
	 */
	
	public void list() {}
	
	public void evaluate() {
		evaluate(new TAEmptyStatement()); //evaluate with an empty statement in between
		//When there is no concurrent statement
	}
	
	//Neat trick: 
	//When evaluating a statement,
	//we can place a statement "inside" it
	//And evaluate it concurrently
	//To get a concurrent list
	abstract public void evaluate(TAStatement s);
	
	 public void addFunction(TAObject a)
	 {
		 
	 }
	 
	String type()
	{
		return "Statement";
	}
}
