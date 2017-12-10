import java.util.Arrays;

public class StableSorts {

    // Bubble Sort
    public static String bubbleSort (int [] array){

        boolean noChanges;
        int lastNumber = array.length;

        do{
            noChanges = true;
            for (int i = 0; i < lastNumber - 1; i++) {

                if (array[i] > array[i + 1]) {

                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    noChanges = false;
                }
            }
            lastNumber--;

        }while (noChanges == false);

    return Arrays.toString(array);
    }

    // Insertion Sort
    public static String insertionSort(int [] array){

        int i, key, j;
        for (i = 1; i < array.length; i++)
        {
            key = array[i];
            j = i-1;

            while (j >= 0 && array[j] > key)
            {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
        return Arrays.toString(array);
    }

    // Merge Sort
    public static String mergeSorts(int[] a) {

        int[] helper = new int[a.length];
        mergeSort(a, 0, a.length - 1, helper);

        return Arrays.toString(a);
    }

    private static void mergeSort(int[] a, int left, int right, int[] helper) {

            if (left < right) {

            int middle = left + (right - left) / 2;

            mergeSort(a, left, middle, helper);
            mergeSort(a, middle + 1, right, helper);
            merge(a, left, middle, right, helper);
        }
    }

    private static void merge(int[] a, int left, int middle, int right, int[] helper) {

            for (int i = left; i <= right; i++) helper[i] = a[i];

            int i = left;
            int j = middle + 1;

            for (int k = left; k <= right; k++) {

                if (i > middle)
                    a[k] = helper[j++];

                else if (j > right)
                    a[k] = helper[i++];

                else if (helper[i] <= helper[j])
                    a[k] = helper[i++];

                else
                    a[k] = helper[j++];
            }
    }

    // Counting Sort
    public static String countingSort(int [] array){

            int[] sortedArr = new int[array.length];
            int min = array[0];
            int max = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
                if (array[i] > max) {
                    max = array[i];
                }
            }

            int[] count = new int[(max - min) + 1];

            for (int i = 0;  i < array.length; i++) {
                count[array[i] - min]++;
            }

            count[0]--;
            for (int i = 1; i < count.length; i++) {
                count[i] = count[i] + count[i-1];
            }

            for (int i = array.length - 1; i >= 0; i--) {
                sortedArr[count[array[i] - min]--] = array[i];
            }

            return Arrays.toString(sortedArr);
    }
}

