/*
Author Name : Nathani Vivek 
Start Date : 4th-Jan-2022
End Date : 4th-Jan-2022
Modified By:-
Modified Date:-
Logical Comment: Reverse Alternative Character Of String Array
*/
import java.util.*;
class Short
{
	public static void main(String []args)
	{
		int i,j,no;
		String val;
		

		Scanner sc = new Scanner(System.in);

		System.out.print("\n Enter Any String : ");
		val = sc.next();

		System.out.print("\n Input Number Of Case  : ");
		no = sc.nextInt();

		if(no>val.length())
		{
			System.out.println("\n Length Of String Is Less..!! Enter Big String...!!");
		}
		else
		{
		System.out.print("\n");
		for(i=0; i<val.length(); i++)
		{
			if(i%no==no-1)
			{
					for(j=i; j>i-no; j--)
					{
					System.out.print(val.charAt(j));
					}	
			}
			else if(i == val.length() - (val.length()%no))
			{
				for(j=i; j<val.length(); j++)
				{
				System.out.print(val.charAt(j));
				}
			}
		}
	}

	}
}