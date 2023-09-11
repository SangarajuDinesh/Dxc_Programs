import java.util.Scanner;

public class ThirdMaxElementInanArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[sc.nextInt()];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();//10 5 7 88 19
		}
		int position=sc.nextInt();
		for(int i=1;i<arr.length;i++)
		{
			int current=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>current)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=current;
		}
		System.out.println(arr[position-1]);
		sc.close();
	}
}
