
public class TADouble extends TAObject implements TADoubleValue {
	
	
	double value;  
	
	public double value() {
		
		return value;
	}
	
	
	public void list()
	{
		ListStrategy.list(name);
	}
	
	public void evaluate()
	{
		
	}
	
	
	void set(double d)
	{
		value = d;
	}
	
	
	TADouble(String s)
	{
		value = 0.0;
		name = s;
	}
	
	
	TADouble(String s,double a)
	{
		this(s);
		value = a;
	}
	
	
	

}
