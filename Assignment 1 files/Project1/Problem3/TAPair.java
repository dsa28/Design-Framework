class TAPair extends TAObject implements TAValue
{


	String type() {
		return "pair";
	}

	public void list() {
		
		System.out.print("(");
		first.list();
		System.out.print(",");
		next.list();
		System.out.print(")");
	}

	
	public void evaluate() {
		
	}
	
	TAPair(TAObject o1,TAObject o2)
	{
		first = o1;
		next = o2;
	}
	
	TAPair(TAObject o1, TAObject o2,String s)
	{
		this(o1,o2);
		name = s;
	}
	
	TAObject first;
	TAObject next;
}