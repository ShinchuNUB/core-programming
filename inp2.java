/*
Author Name : Nathani Vivek 
Start Date : 4th-Jan-2022
End Date : 4th-Jan-2022
Modified By:-
Modified Date:-
Logical Comment: Finding Largest Value From Comma Seprated User Input Value
*/

import java.util.*;
class inp2 extends MyLib
{
	public static void main(String []args)
	{
		Scanner dis=new Scanner(System.in);
        String line;
        String[] lineVector;

        System.out.println("Enter Value In Comma Seprate Format : ");
        line = dis.nextLine();

        //separate all values by comma
        lineVector = line.split(",");

        System.out.println("\n Total length : " + lineVector.length);

        arr = new int[lineVector.length];
       
        for(i=0; i<arr.length; i++)
        {
        	arr[i] = Integer.parseInt(lineVector[i]);
        }
        PrintData();
    }
	
}