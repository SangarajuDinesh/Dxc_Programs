
public class Remainder {
public static void main(String[] args) 
{
	int num=25;
	int quotient=0;
	int rem=0;
	while(num>0)
	{
		rem=num%2;
		quotient=num/2;
		num=quotient;
		System.out.print(rem);
	}
}
}
