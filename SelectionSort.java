public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {13 , 46 , 24 , 52 , 20 , 9};

        for(int i = 0 ; i<= arr.length-2; i++){
            int min = i ;
            for( int j = i ; j<= arr.length-1 ; j++){
                if(arr[j]<arr[min]){
                    int temp = arr[j] ;
                    arr[j] = arr[min];
                    arr[min] = temp ;
                }
            }
        }

        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
