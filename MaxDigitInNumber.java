import java.util.Scanner;

public class MaxDigitInNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int rem=0;
		for(int i=0;i<=num+1;i++)
		{
			rem=num%10;
			num/=10;
			if(rem>=7)
			{
				System.out.print(rem);
			}
		}
		sc.close();
	}
}
