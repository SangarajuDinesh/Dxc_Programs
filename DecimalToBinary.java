import java.util.Scanner;

public class DecimalToBinary 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int rem1=0;
		while(num>0)//for(int i=num;num>0;)
		{
			rem1=num%2;
			num/=2;
			System.out.print(rem1);
		}
		sc.close();
	}
}
