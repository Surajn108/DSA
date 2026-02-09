public class InsertionSort {
    public static void main(String[] args) {
        int temp;
        int[] a = {14 , 9 , 15 , 12 , 6 , 8 , 13 };
        for (int i = 1; i < a.length; i++){
            for (int j = i; j > 0 && a[j-1] > a[j]; j--){
                temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
            }
        }

        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i] + " ");
    }
}
