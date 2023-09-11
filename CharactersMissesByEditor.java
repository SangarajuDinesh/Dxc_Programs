import java.util.Scanner;

public class CharactersMissesByEditor 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String input=in.nextLine();
		int result=missedCharacters(input);
		System.out.println(result);
		in.close();
	}
	public static int missedCharacters(String input) 
	{
		int answer=0;
		char crr[]=input.toCharArray();
		for(int i=0;i<crr.length;i++)
		{
			if((crr[i]>=33 && crr[i]<=47)||(crr[i]>=58 && crr[i]<=64)||crr[i]>=93 && crr[i]<97) {
				answer++;
			}
		}
		return answer;
	}
}
