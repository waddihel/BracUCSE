import java.util.Scanner;

public class Task2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("N = ");
		int N = sc.nextInt();
		int sum = 0;
		System.out.println("Enter " + N + " numbers");
		for(int i = 1; i<=N; i++){
			int x = sc.nextInt();
			sum += x;
		}
		System.out.println("The sum of " + N + " no is: " + sum);
		System.out.println("The average is: " + (float)sum/N);
	}
}
