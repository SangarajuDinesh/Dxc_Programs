import java.util.Scanner;

public class PerfectSquaresInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int range=sc.nextInt();
		int count=0;
		for(int i=1;i*i<=range;i++)
		{
			count++;
		}
		System.out.println(count);
		sc.close();
	}
}
