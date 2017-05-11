
public interface TAIntValue extends TAValue{

  /* default String type()
	{
		return "int";
	}*/
	
	default boolean greaterThan(TAIntValue op2)
	{
		return value()> op2.value();
	}
	
	
	int value();

	
}
