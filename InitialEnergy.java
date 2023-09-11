import java.util.Scanner;

public class InitialEnergy 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		b=a*b;
		c=b*c;
		System.out.print(a+" "+b+" "+c);
		sc.close();
	}
}
