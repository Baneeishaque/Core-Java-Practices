import java.io.*;
public class Check_Odd_Even
{
	public static void main(String args[])
	{
		
		
		System.out.println("Enter the Number : ");
		DataInputStream in=new DataInputStream(System.in);
		try
		{
			int number=Integer.parseInt(in.readLine());
			if(number==0)
			{
				System.out.println("The Number "+number+" is Not Odd or Even");
			}
			else if((number%2)==1)
			{
				System.out.println("The Number "+number+" is Odd");
			}
			else
			{
				System.out.println("The Number "+number+" is Even");
			}

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
