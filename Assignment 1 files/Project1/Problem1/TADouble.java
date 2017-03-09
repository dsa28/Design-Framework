
public class TADouble extends TAObject implements TADoubleValue {
	
	
	
	
	public double value() {
		
		return value;
	}
	
	
	public void list()
	{System.out.print(name);}
	
	public void evaluate()
	{}
	
	
	void set(double d)
	{value = d;}
	
	

	String type() {
		
		return "double";
	}

	
	
	
	TADouble(String s,double a)
	{
		name = s;
		value = a;
	}
	
	TADouble(String s)
	{
		value = 0.0;
		name = s;
	}
	
	
	
	double value;



	
	
}
