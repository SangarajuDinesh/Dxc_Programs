import java.util.Scanner;

public class BucketID 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int itemID=sc.nextInt();
		int result=bucketID(itemID);
		System.out.println(result);
		sc.close();
	}

	public static int bucketID(int itemID) 
	{
		int answer=9;
		int rem=0;
		while(itemID>0)
		{
			rem=itemID%10;
			if(answer>rem)
			{
				answer=rem;
			}
			itemID/=10;
		}
		return answer;
	}
}
