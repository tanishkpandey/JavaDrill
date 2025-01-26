// Display all the numbers entered by the user except multiples of 10

import java.util.*;
public class Solution6 {
    public static void main(String args[]){
        do{
        System.out.print("Enter your number: ");
        Scanner sc = new Scanner(System.in);
        int input  = sc.nextInt();
        if(input % 10 == 0){
            continue;
        }
        System.out.println(input);
        } while(true);
    }
}
