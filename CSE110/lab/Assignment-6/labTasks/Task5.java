import java.util.Scanner;

public class Task5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine() + " ";
		String output = "";
		String nWord = "";
		
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i)!=' ')
				nWord += str.charAt(i);
			else{
				output = nWord + " " + output;
				nWord = "";
			}
		}
		System.out.println(output);
	}
}
