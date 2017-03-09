class TAArrayInt extends TAArray
{
	
	int size()
	{
		return size;
	}
	
	public void list()
	{
		System.out.print("[");
		for (int i =0; i < size-1; i++)
			System.out.print(values[i] + " ");
		System.out.print(values[size-1] +"]");
	}
	
	TAArrayInt(int size)
	{
		values = new TAInt[size];
		this.size = size;
	}
	
	
	TAInt[] values;
	int size;
}