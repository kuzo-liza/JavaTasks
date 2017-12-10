import java.util.Arrays;

public class HeapSort {

    private static int[] arr;
    private static int n, left, right, largest;

    public static void buildheap(int [] a){

        n = a.length - 1;

        for(int i = n / 2; i >= 0; i--){
            maxheap(a, i);
        }
    }

    public static void maxheap(int[] a, int i){
        left = 2 * i;
        right = 2 * i + 1;

        if(left <= n && a[left] > a[i]){
            largest = left;
        }
        else{
            largest = i;
        }

        if(right <= n && a[right] > a[largest]){
            largest = right;
        }

        if(largest != i){
            exchange(i, largest);
            maxheap(a, largest);
        }
    }

    public static void exchange(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static String heapSort(int[] array) {
        arr = array;
        buildheap(arr);

        for(int i = n; i > 0; i--){
            exchange(0, i);
            n--;
            maxheap(arr, 0);
        }
        return Arrays.toString(arr);
    }
}

