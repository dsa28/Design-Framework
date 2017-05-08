
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
	
	public void evaluate(TAStatement a)
	{
	
		//To concurrently evaluate two statements,
		//We will "sandwish" one statement in between the 
		//evaluation of the right and left side of the other statement
		s1.evaluate(l);
		
		
	}
	
	public void list()
	{
		ListStrategy.list(s1, "|", l);
	}
	
	
	
}
