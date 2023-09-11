import java.util.Scanner;

public class EvenAndOdd 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int inputArr_size=sc.nextInt();
		int inputArr[]=new int[inputArr_size];
		for(int i=0;i<inputArr.length;i++)
		{
			inputArr[i]=sc.nextInt();
		}
		int[] result=funcArrange(inputArr,inputArr_size);
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]+" ");
		}
	}

	private static int[] funcArrange(int[] inputArr,int inputArr_size) 
	{
		int n=0;
		int m=inputArr_size-1;
		while (n < m) {
            while (inputArr[n] % 2 == 0) {
                n++;
            }
            while (inputArr[m] % 2 == 1) {
                m--;
            }

            if (n<m) {
                int temp =inputArr[n];
                inputArr[n] = inputArr[m];
                inputArr[m] = temp;
            }
        }

		return inputArr;
	}
}
