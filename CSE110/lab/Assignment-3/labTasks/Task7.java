import java.util.Scanner;

public class Task6{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for(;n>0;){
			n/=10;
			count++;
		}
		System.out.println("Total digits = " + count);
	}
}
