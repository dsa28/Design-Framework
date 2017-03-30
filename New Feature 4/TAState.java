import java.util.ArrayList;

public class TAState {

	/*
	 * For now, a state seems to only have a name
	 */
	
	String name;
	
	
	TAState (String name)
	{
		this.name = name;	
	}
	
	void list()
	{
		System.out.print(name);
	}
	
}
