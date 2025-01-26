// Enter a number and print it from last to frist digit

import java.util.*;

public class Solution3 {
    public static void main(String args[]) {
        System.out.println("Enter a 5 digit number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        
        for(int i=0; input>0; i++){
            System.out.print(input % 10);
            input /= 10;
        }
    }
}