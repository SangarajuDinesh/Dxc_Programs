import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int base1=in.nextInt();
		int height1=in.nextInt();
		int base2=in.nextInt();
		int height2=in.nextInt();
		float result= largestTriangle(base1,height1,base2,height2);
		System.out.println(result);
		in.close();
	}

	public static float largestTriangle(int base1, int height1, int base2, int height2) 
	{
		float answer=0;
		float answer1=(float)(base1*height1)/2;
		float answer2=(float)(base2*height2)/2;
		answer=answer1>answer2?answer1:answer2;
		return answer;
	}
}
