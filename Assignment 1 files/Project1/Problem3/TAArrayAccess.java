class TAArrayAccess extends TAObject
{

	<T extends TAIntValue> TAArrayAccess (TAArray a,T pos ) 
	{
		
	}
	
	void set()
	{}
	
	String type() {
		return elem.type();
	}

	
	public void list() {
		elem.list();
		
	}

	
	public void evaluate() {
		elem.evaluate();
		
	}
	
	TAArrayAccess elem;
	
}