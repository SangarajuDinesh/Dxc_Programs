import java.util.Scanner;

public class PrintArrayElementsInRange 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int []arr=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		int low=sc.nextInt();
		int high=sc.nextInt();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>low && arr[i]<high)
			{
				System.out.print(arr[i]+" ");
			}
		}
		sc.close();
	}
}
