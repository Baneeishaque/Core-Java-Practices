import java.io.*;
public class Sum_Array
{
	public static void main(String args[])
	{
		
		int sum=0;
		System.out.println("Enter the No. of elements : ");
		DataInputStream in=new DataInputStream(System.in);
		try
		{
			int limit=Integer.parseInt(in.readLine());
			int[] array=new int[limit];
			System.out.println("Enter the Elements : ");		
			for(int i=0;i<limit;i++)
			{
				//System.out.println("Index is : "+i);
				//System.out.println("Sum is : "+sum);
				array[i]=Integer.parseInt(in.readLine());
				//System.out.println("Element is : "+array[i]);
				sum=sum+array[i];
				
			}
			System.out.println("Sum of elements is : "+sum);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
