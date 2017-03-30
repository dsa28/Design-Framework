
public class TASeqList extends TAStatement {

	//This should be limited to statements (can be an empty statement)
	TAStatement l;
	//This should be limited to atomics statements
	TAAtomicStatement s1;
	String name;
	
	TASeqList(String seqName, TAAtomicStatement s1, TAStatement l)
	{
		this(s1,l);
		name = seqName;
	
		
	}
	
	TASeqList(TAAtomicStatement s1, TAStatement l)
	{
	
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
