//Task 1
import java.util.Scanner;

public class Task1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toLowerCase();

		int vowelCount = 0, consonantCount = 0;

		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i)>=97 && str.charAt(i)<=122)
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' ||str.charAt(i)=='i' ||str.charAt(i)=='o' ||str.charAt(i)=='u' )
				vowelCount++;
			else
				consonantCount++;
		}
		if(vowelCount > 0 && consonantCount > 0 && vowelCount % 3 == 0 && consonantCount % 5 == 0)
			System.out.println("Aaarr! Me Plunder!!");
		else
			System.out.println("Blimey! No Plunder!!");
	}
}
