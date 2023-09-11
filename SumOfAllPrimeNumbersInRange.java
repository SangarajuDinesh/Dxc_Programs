import java.util.Scanner;

public class SumOfAllPrimeNumbersInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int low=sc.nextInt();
		int high=sc.nextInt();
		int sum=0;
		for(int i=low;i<=high;i++)
		{
			int count=0;
			for(int j=-1;j>=low+1;j--)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				sum+=i;
			}
		}
		System.out.print(sum+" ");

	}
}
