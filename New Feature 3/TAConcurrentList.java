
public class TAConcurrentList extends TAStatement {

	//This should be limited to statements (can be an empty statement)
	TAStatement l;
	//s1 should be an atomic statement
	TAAtomicStatement s1;
	
	String name;
	
	TAConcurrentList (TAAtomicStatement s1, TAStatement l)
	{
		this.l = l;
		this.s1 = s1;
	}
	TAConcurrentList(String seqName, TAAtomicStatement s1, TAStatement l)
	{
		this(s1,l);
		name = seqName;	
	}
	
	public void evaluate()
	{
	
		//"That is all right hand side expressions in the assignment statements in s1 and l must be evaluated before updating the corresponding target terms."
		//ie. evaluate the right hand expression of either s or l, say s
		//Store the result in a temporary variable
		//Evaluate the right hand expression of the other statement, say l
		//Assign the results
		
		//(The order in which s and l are executed does not matter unless a variable value is changed;
		//-- when there is an assignment)
		
		//TODO: THIS SHOULD BE DIFFERENT!
		TAStatement temp = l;
		s1.evaluate();
		temp.evaluate();
		l = temp;
		
		
	}
	
	public void list()
	{
		ListStrategy.list(s1, "|", l);
	}
	
	
	
}
