//Task 2

public class Task2{
	public static void main(String [] args){
		int sum = 0;
		for(int i = 0; i<=600; i++){
			if(i%7==0 && i%9==0){}
			else if(i%7==0){
				sum += i;
			}
			else if(i%9==0){
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
