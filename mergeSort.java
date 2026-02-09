import java.util.ArrayList;

public class mergeSort {

    public static void MSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int mid = (low + high) / 2;

        MSort(arr, low, mid);
        MSort(arr, mid + 1, high);

        // Merge Logic
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        // Copy remaining elements
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // Copy back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 1, 5, 6, 2, 4};
        MSort(arr, 0, arr.length - 1);

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}