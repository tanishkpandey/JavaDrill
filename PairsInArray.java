// Here we have to return only unique pairs from a array

public class PairsInArray {

    public static void getPairs(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(i<=j) System.out.print("(" + numbers[i] + ", "+ numbers[j] + ")" );
            }
             System.out.println(" ");
        }
    }

    public static void main(String args[]){
        int numbers[] = {2,3,4,5};
        getPairs(numbers);
    }
}
