import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter The Number ");
		
		int rev=0,rem,num,n = s.nextInt();
		
		num=n;
		
		while(num!=0)
		{
			rem = num % 10;
			rev = (rev*10) + rem;
			num = num / 10;
		}
		
		if(rev==n)
		{
			System.out.println("It is a palindorme");
		}
		else
		{
			System.out.println("It is not a palindorme");
		}
		
		
		
	}

}
