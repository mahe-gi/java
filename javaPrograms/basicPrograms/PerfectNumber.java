package basicPrograms;
import java.util.Scanner;
class PerfectNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1;i<n;i++ )
		{
			if (n%i==0)
			{
				sum = sum + i;
			}
		}
		
		if (sum==n)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("not Perfect number");
		}
	}
}

