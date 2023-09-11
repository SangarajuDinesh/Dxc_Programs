import java.util.Scanner;

public class Marks 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int eRP=sc.nextInt();
		char result=calculateERG(eRP);
		System.out.println(result);
	}

	private static char calculateERG(int eRP) 
	{
		char answer='a';
		if(eRP>=30 && eRP<=50)
		{
			answer='D';
		}
		else if(eRP>=51 && eRP<=60)
		{
			answer='C';
		}
		else if(eRP>=61 && eRP<=80)
		{
			answer='B';
		}
		else if(eRP>=81 && eRP<=100)
		{
			answer='A';
		}
		return answer;
	}
}
