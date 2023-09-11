import java.util.Scanner;

public class ProductOfEvenAndOddDigitsOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();//2514795
		int rem=0;
		int sum1=0,sum2=0;
		while(num>0)//we dont know number of iterations
		{
			rem=num%10;
			num/=10;
			if(rem%2==0)
			{
				sum1+=rem;
			}
			else
			{
				sum2+=rem;
			}
		}
		System.out.println(sum1*sum2);//162
		sc.close();
	}
}
