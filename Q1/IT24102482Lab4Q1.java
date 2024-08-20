import java.util.Scanner;
public class IT24102482Lab4Q1
{
	public static void main(String[] args)
	{
	float num;
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the number: ");
	num = sc.nextFloat();
	
	if(num > 0)
	{
	System.out.println("The number is positive");
	}
	else if(num < 0)
	{
	System.out.println("The number is negative");
	}
	else
	{
	System.out.println("The number is zero");
	}
}
}
	

	

	