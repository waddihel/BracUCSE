import java.util.Scanner;

public class Task3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		sc.close();


		if (a>b && a>b)
			System.out.println("Maximum number is: " + a);
		else if (b>a && b>c)
			System.out.println("Maximum number is: " + b);
		else
			System.out.println("Maximum number is: " + c);

		if (a<b && a<b)
			System.out.println("Minimum number is: " + a);
		else if (b<a && b<c)
			System.out.println("Minimum number is: " + b);
		else
			System.out.println("Minimum number is: " + c);

	}
}
