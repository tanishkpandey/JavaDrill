// Make the same number reverse
//-----------------------------

import java.util.*;

public class Solution4 {
    public static void main(String args[]) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int rev = 0;
        for (int i = 0; input > 0; i++) {
            int ld = input % 10;
            rev = rev * 10 + ld;
            input /= 10;
        }
        System.out.print(rev);
    }
}