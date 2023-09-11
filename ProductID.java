import java.util.Scanner;

public class ProductID 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char[] crr=new char[sc.nextInt()];
		for(int i=0;i<crr.length;i++)
		{
			crr[i]=sc.next().charAt(0);
		}
		System.out.print(productId(crr));
		sc.close();
	}
	public static int productId(char[] crr)
	{
	int answer=0;
	for(int i=0;i<crr.length;i++)
	{
		if(crr[i]=='a' || crr[i]=='A' || crr[i]=='e' || crr[i]=='E' || crr[i]=='i' || crr[i]=='I' || crr[i]=='o' || crr[i]=='O' || crr[i]=='u' || crr[i]=='U')
		{
			answer++;
		}
	}
	return answer;
}
}
