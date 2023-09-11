
public class SumOfPrimeDigits 
{
	public static void main(String[] args) 
	{
		int num=632;
		int rem=0,sum=0;
		for(int i=0;i<=num;i++)
		{
			rem=num%10;
			num/=10;
			int count=0;
			for(int j=1;j<=rem;j++)
			{
				if(rem%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				sum+=rem;
			}
		}
		System.out.print(sum);
	}
}
