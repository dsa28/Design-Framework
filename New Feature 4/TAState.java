import java.util.ArrayList;

public class TAState {

	/*
	 * A state has a name
	 */
	
	String name;

	boolean equals(TAState s)
	{
		return this.name == s.name;
	}
	
	
	void list()
	{
		System.out.print(name);
	}
	
	
	TAState (String name)
	{
		this.name = name;	
		
	}
	
}
