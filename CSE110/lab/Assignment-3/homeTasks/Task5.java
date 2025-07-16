//Task 5

import java.util.Scanner;

public class Task5{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 0; i<10; i++){
			System.out.print("Enter number: ");
			int x = sc.nextInt();
			sum += x;
			System.out.println("Sum = " + sum);
		}
	}
}
