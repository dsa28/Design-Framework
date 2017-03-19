
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
	 *-Functions like (e1?e2:e3) or (for every a1 in a2: a3) (3 operands separated by strings)
	 *-Statements
	 *
	 *Finally, because all these functions are similar, we can either make the class static or use the singleton method
	 *For now we will try making it static
	 */
	
	
	//List name
	static void list(String name)
	{
		//If an object has a name, we simply print its name
		System.out.print(name);
	}
	
	//List binary operators
	static void list(String operator, TAValue op1, TAValue op2 )
	{
		//Operator with two operands
		System.out.print("(" + operator + " ");
		op1.list();
		System.out.print(" ");
		op2.list();
		System.out.print(")");
	}
	
	//list unary operators
	static void list(String operator, TAValue op)
	{
		//Unary operator
		System.out.print("(" + operator +  " " );
		op.list();
		System.out.print(")");
	}
	
	//Function to print for all, for every, if else
	static void list(String operator1, TAValue op1, String operator2, TAValue op2, String operator3, TAValue op3)
	{
		System.out.print("(" + operator1);
    	op1.list();
    	System.out.print(operator2);
    	op2.list();
    	System.out.print(operator3);
    	op3.list();
    	System.out.print(")");
	}
	
	//Function to print statements
	static void list(TAStatement op1, String operator, TAStatement op2)
	{
		System.out.print("(" );
    	op1.list();
    	System.out.print(operator);
    	op2.list();
   
    	System.out.print(")");
	}
}
