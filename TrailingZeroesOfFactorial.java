import java.util.Scanner;

public class TrailingZeroesOfFactorial 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		int result=winGame(num);
		System.out.println(result);
		in.close();
	}

	public static int winGame(int num) 
	{
		int answer=0;
		int fact=1;
		int i=1;
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		int rem=0;
		for(int j=0;j<=fact;j++)
		{
			rem=fact%10;
			fact/=10;
			if(rem==0)
			{
				answer++;
			}
		}
		return answer;
	}
}
