/*
Author Name : Nathani Vivek 
Start Date : 4th-Jan-2022
End Date : 4th-Jan-2022
Modified By:-
Modified Date:-
Logical Comment: Finding Largest Value From User Input
*/

import java.util.*;
class inp extends MyLib
{
	public static void main(String []args)
	{
		System.out.print("\n Enter How Much Value You Want To Input : ");
		Scanner sc = new Scanner(System.in);
		lm = sc.nextInt();

		for (i=0; i<lm; i++) {
			System.out.print("\n Enter Value Of " + (i+1) + " : " );
			arr[i] = sc.nextInt();
			
		}
		System.out.println("\n Your Values : ");
		for(i=0; i<lm; i++)
		{
			System.out.print(arr[i] + ",");
		}
		
		PrintData();
	}
}