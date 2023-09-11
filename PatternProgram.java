import java.util.Scanner;

public class PatternProgram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=num+(num-1);j++)
			{
				if(j-i==(j-1) || i<=j)
				{
					System.out.print(i);
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			sc.close();
		}
	}
}
