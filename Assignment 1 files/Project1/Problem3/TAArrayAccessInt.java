class TAArrayAccessInt extends TAArrayAccess
{
	void set(TAIntValue a)
	{
		val = a;
	}
	
	String type() {
		return "int";
	}

	
	void list() {
		val.list();
	}

	
	void evaluate() {
		val.evaluate();
		
	}
	
	TAIntValue val;
}
