import java.util.Scanner;

public class Task1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(;n>0;n--){
			int x = sc.nextInt();
			int y = sc.nextInt();
			int sum = 0;
			if(x%2==0)
				x++;
			for(int i = 0; i < y; i++){
				sum += x;
				x+=2;
			}
			System.out.println("Output: "+sum);
		}
	}
}
