import java.util.*;

class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i = 2;
		int rem;

		System.out.print("\n\t\t\tEnter number : ");
			int n = sc.nextInt();

		System.out.println("\n\t\t\t=============================");

		while(i<=n)
		{
			if(n%i==0)
				break;
			i++;
		}
		
			if(n==i)
				System.out.println("\n\t\t\tNumber is Prime Number.");
			else
				System.out.println("\n\t\t\tNumber is not Prime Number.");
	}
}