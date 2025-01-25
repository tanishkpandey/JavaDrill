// Question 3: Enter cost of 3 items from the user (using oat data type) - a pencil, a pen and
// an eraser. You have to output the total cost of the items back to the user as their bill.

import java.util.*;

public class Solution2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int pen = sc.nextInt();
        int pencil = sc.nextInt();
        int eraser = sc.nextInt();

        int totalCost = (pen + pencil + eraser);
        System.out.print("Your Cost: ");
        System.out.println(totalCost);

        float withGST = totalCost + (totalCost * 0.18f);
        System.out.print("Your Cost after GST : ");
        System.out.println(withGST);

    }
}