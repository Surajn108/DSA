
//import java.util.Arrays;   
public class TwoSumArr {
    

    public int[] PrintTwoSum(int[] sums, int target){
        int arr [] = new int[2];

        for(int i = 0 ; i < sums.length ; i++ ){
            for( int j = i+1 ; j < sums.length ; j++){
                if(sums[i]+sums[j]==target){
                    arr[0]=i;
                    arr[1]=j;

                    return arr;
                }
            }
        }
        return new int[] {};


    }

    public static void main(String[] args) {
        int A [] = {2,7,11,15};
        int target = 26 ;
        TwoSumArr obj = new TwoSumArr();
        int [] result =obj.PrintTwoSum(A, target);
        System.out.print(result[0] +" And "+ result[1]);
        



        int[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = new String[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            stringArray[i] = String.valueOf(intArray[i]);
            System.out.println(stringArray[i]);
        }   

        

        



    }



}
