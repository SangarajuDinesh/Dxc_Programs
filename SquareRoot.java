import java.util.Scanner;

public class SquareRoot 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();;
		double sr=num/2,t=0;
		do
		{
			t=sr;
			sr=(t+num/t)/2;
		}
		while(t-sr!=0);
		System.out.println(sr);
		sc.close();
	}
}
