import java.io.*;
public class Bubble_Sort
{
	public static void main(String args[])
	{
		
		
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
				
				
			}
			bubble_sort(array);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

	public static void bubble_sort(int[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(array[i]<array[j])
				{
					array[i]=array[i]+array[j];
					array[j]=array[i]-array[j];
					array[i]=array[i]-array[j];
				}
			}
		}
		
		System.out.println("The Sorted Array is : ");		
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
	}
}
