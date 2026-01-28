import java.util.Arrays;
import java.util.Scanner;
public class ArraysCC {

    public static void getSmallestAndLargest(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0 ; i < numbers.length ; i++){
            if(largest   < numbers[i]){
                largest = numbers[i];
                
            }
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        System.out.println("Smallest number is : " + smallest);
        System.out.println("Largest number is : " + largest);
    }
    public static void main(String[] args) {
        int arr[] =  new int[10];
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        getSmallestAndLargest(arr);

        

       

       
     
    }
}