import java.util.Scanner;

public class FizzBuzz 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%3==0 && arr[i]%5==0)
			{
				System.out.println("FizzBuzz");
			}
			else if(arr[i]%3==0)
			{
				System.out.println("Fizz");
			}
			else if(arr[i]%5==0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.print("Not FizzBuzz");
			}
			sc.close();
		}
	}
}
