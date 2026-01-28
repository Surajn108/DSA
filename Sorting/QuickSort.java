public class QuickSort {
    public static int partition(int[]arr , int low , int high){
        int pivot = arr[low];
        int i = low , j = high ;

        while ( i < j ){
            while( arr[i] <= pivot && i <=high){
                i++;
            }
            while(arr[j] > pivot && j >= low){
                j--;
            }
            if( i < j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int t2 = arr[j];
        arr[j] = arr[low];
        arr[low] = t2 ;
        return j ;
    }


    public static void qs(int[]arr , int low , int high) {
       
        if( low < high){
        int partIndex = partition(arr , low , high );
        qs(arr, low, partIndex-1);
        qs(arr, partIndex+1, high);
    }
    }
    public static void main(String[] args) {
        
        int[] arr = { 4 ,6 , 2 , 5 , 7 , 9 , 1 ,3};
        qs(arr, 0, arr.length-1);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
