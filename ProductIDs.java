import java.util.Scanner;

public class ProductIDs 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		char arr[]=new char[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.next().charAt(0);
		}
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]=='a')||(arr[i]=='A')||(arr[i]=='e')||(arr[i]=='E')||(arr[i]=='i')||(arr[i]=='I')||(arr[i]=='o')||(arr[i]=='O')||(arr[i]=='u')||(arr[i]=='U'))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
