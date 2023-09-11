import java.util.Scanner;

public class SumOfPrimeDigitsInNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int rem=0;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			num/=10;
			int count=0;
			for(int i=1;i<=rem;i++)
			{
				if(rem%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				sum+=rem;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
