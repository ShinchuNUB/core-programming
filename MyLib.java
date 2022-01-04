class MyLib	
{
	public static int lm,i;
	public static int arr[] = new int[100];

	public static void PrintData()
	{
		int tmp=0;

		for(i=0; i<arr.length; i++)
		{
			if(tmp<arr[i])
			{
				tmp=arr[i];
			}
		}
		System.out.println("\n Largest Value Is : " + tmp);

	}
}