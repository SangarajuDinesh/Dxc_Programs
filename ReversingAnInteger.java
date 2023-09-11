import java.util.Scanner;

public class ReversingAnInteger 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		System.out.print(reverseNumber(num));
		sc.close();
	}

	private static int reverseNumber(int num) 
	{
		int answer=0,rem=0;
		for(int i=0;i<=num+1;i++)
		{
			rem=num%10;
			answer=answer*10+rem;
			num/=10;
		}
		return answer;
	}
}
