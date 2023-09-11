import java.util.Scanner;

public class PerfectSquaresFromArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] arr=new int[sc.nextInt()];
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
				if(arr[i]==j*j)
				{
					count++;
				}
			}
		}
		System.out.print(count+" ");
		sc.close();

	}
}
