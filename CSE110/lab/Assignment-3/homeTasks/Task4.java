//Task 4

import java.util.Scanner;

public class Task4{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input number of terms: ");
		int n = sc.nextInt();
		int count = 0;
		System.out.println("The odd numbers are");
		for(int i = 0; count<n; i++){
			if(i%2!=0){
				System.out.println(i);
				count++;
			}
		}
	}
}
