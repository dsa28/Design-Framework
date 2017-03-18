
public class ListStrategy {
	/*
	 *The list function acts very similarly for most classes. 
	 *It also appears in many of them
	 *For this reason, making a class for this function (Strategy pattern) seems to be a good idea;
	 *
	 *List function has 3 possible cases:
	 *-Primitive types or function with name- prints the name
	 *-Unary operator
	 *-Binary operator
	 *
	 *Finally, because all these functions are similar, we can either make the class static or use the singleton method
	 *For now we will try making it static
	 */
	
	static void list(String name)
	{
		//If an object has a name, we simply print its name
		System.out.print(name);
	}
	
}
