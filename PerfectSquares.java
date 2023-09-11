import java.util.Scanner;

public class PerfectSquares 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int num=arr[i];
			for(int j=1;j*j<=num;j++)
			{
				if(num==j*j)
				{
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}
