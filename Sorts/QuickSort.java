import java.util.Arrays;

public class QuickSort {

    public static String quickSort(int[] array) {

        sorting(array, 0, array.length - 1);
        return Arrays.toString(array);

    }

    public static void sorting(int[] array, int min, int max) {

            int left = min;
            int right = max;
            int key = array[(min + max) / 2];

            while (left <= right) {

                while (array[left] < key) {
                    left++;
                }

                while (array[right] > key) {
                    right--;
                }

                if (left <= right) {

                    int temporary = array[left];
                    array[left] = array[right];
                    array[right] = temporary;

                    right--;
                    left++;
                }
            }

            if (min < right) {
                sorting(array, min, right);
                sorting(array, right + 1, max);
            }

        }
}



