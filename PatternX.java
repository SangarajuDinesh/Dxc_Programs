import java.util.Scanner;

public class PatternX 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num*2-1;j++)
			{
				if(i==j || i+j==10)
				{
					System.out.print(i);
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=2;i<=num;i++)
		{
			for(int j=1;j<=num*2-1;j++)
			{
				if(j+i==6 || j-i==4)
				{
					System.out.print(j-i);
				}else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
