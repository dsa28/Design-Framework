
public class TAConcurrentList extends TAStatement {

	//This should be limited to statements (can be an empty statement)
	TAStatement l;
	//This should be limited to atomics statements
	TAStatement s1;
	
	TAConcurrentList(String seqName, TAStatement l, TAStatement s1)
	{
		name = seqName;
		this.l = l;
		this.s1 = s1;
		
	}
	
	public void evaluate()
	{
		//Create temp TAStatement to keep a copy of l, respecting the following statement:
		//"That is all right hand side expressions in the assignment statements in s1 and l must be evaluated before updating the corresponding target terms."
		TAStatement temp = l;
		s1.evaluate();
		temp.evaluate();
		l = temp;
		
		
	}
	
	public void list()
	{
		System.out.print( s1.name + " ; " + l.name);
	}
	
	
	
}
