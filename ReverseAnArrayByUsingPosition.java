import java.util.Scanner;

public class ReverseAnArrayByUsingPosition 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[sc.nextInt()];
		int pos=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int j=pos;
		int i=0;
		while(i<=j)
		{
			arr[i]=arr[j-1];
			j--;
			i++;
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.print(arr[k]+" ");
		}
		
	}
}
