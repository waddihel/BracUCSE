import java.util.Scanner;

public class Task1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if(num%5==0 && num%7==0)
			System.out.println("Invalid: Divisible by both");
		else if(num%5==0)
			System.out.println("Divisible by 5 only");
		else if(num%7==0)
			System.out.println("Divisible by 7 only");
		else
			System.out.println("No");

		sc.close();
	}
}
