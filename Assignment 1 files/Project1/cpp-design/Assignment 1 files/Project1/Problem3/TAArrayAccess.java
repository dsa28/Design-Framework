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

	
	void list() {
		elem.list();
		
	}

	
	void evaluate() {
		elem.evaluate();
		
	}
	
	TAArrayAccess elem;
	
}