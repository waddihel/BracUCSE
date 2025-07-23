//Task 3

import java.util.Scanner;

public class Task3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();

        for(int i = start; i<=end; i++){
            boolean isPrime = true;
            if (i < 2)
                isPrime = false;
            else if (i == 2 || i == 3)
                isPrime = true;
            else if (i % 2 == 0 || i % 3 == 0)
                isPrime = false;
            else {
                for (int j = 5; i * i <= i; i += 6) {
                    if (i % j == 0 || i % (j + 2) == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime)
                System.out.println(i);
        }
    }
}
