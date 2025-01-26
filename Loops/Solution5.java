// Display all the numbers that the user print and once the multiple of 10 is encountered stop the process.

import java.util.*;

public class Solution5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number: ");
            int input = sc.nextInt();
            if (input % 10 == 0){
                System.out.println("Your found it! :P ");
                break;
            }
            System.out.println(input);
        } while(true);
    }
}
