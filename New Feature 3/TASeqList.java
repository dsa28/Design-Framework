
public class TASeqList extends TAStatement {

	//This should be limited to statements (can be an empty statement)
	TAStatement l;
	//This should be limited to atomics statements
	TAStatement s1;
	String name;
	
	TASeqList(String seqName, TAStatement l, TAStatement s1)
	{
		name = seqName;
		this.l = l;
		this.s1 = s1;
		
	}
	
	public void evaluate()
	{
		s1.evaluate();
		l.evaluate();
		
		
	}
	
	public void list()
	{
		ListStrategy.list(s1,";",l);
		
	}
	
	
	
}
