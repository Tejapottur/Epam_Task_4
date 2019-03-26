import java.util.Scanner;
public class RodCuttingProblem {
	private static Scanner in;
	public static int Countcal(int n)
	{
		int c=0;
		while(n>1)
		{
			c+=1;
			n/=2;
		}
		return c-1;
	}
	
	public static void main(String [] args)
	{
		in = new Scanner(System.in);
		int t,n,c=0;
		t=in.nextInt();
		while(t-->0)
		{
			n=in.nextInt();
			System.out.println(Countcal(n+1));
		}
	}
}
