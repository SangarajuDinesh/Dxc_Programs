import java.util.Scanner;

public class DiscountOnShopping 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int rem=0;
		int evenSum=0,oddSum=0;
		for(int i=num;num>0;)
		{
			rem=num%10;
			num/=10;
			if(rem%2==0)
			{
				evenSum+=rem;
			}
			else
			{
				oddSum+=rem;
			}
		}
		System.out.print(evenSum*oddSum);
	}
}
