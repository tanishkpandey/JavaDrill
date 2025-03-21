import java.util.*;

public class ArraysCC{

    public static int binarySearch(int numbers[], int key){
        int start = 0, end = number.length -1;

        while (start <= end){

            int mid = (start + end) / 2;

            //comparision
            if(number[mid] == key) {
                return mid;
            }
            if(number[mid] > key){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }

        return -1;

    }

    public static void main(String args[]){
        int numbers[] = {2,4,5,6,7,8,9,10,12,14,15,18,19,20};
        int key = 10;

        System.out.println("index of the key is: ", binarySearch(numbers, key));
    }
}