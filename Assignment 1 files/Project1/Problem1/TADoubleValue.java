
public interface TADoubleValue extends TAValue{

	double value();
	
	default boolean greaterThan(TADoubleValue op2)
	{
		return value()<op2.value();
	}
	
}
