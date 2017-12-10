import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] bubble = {2,1,20,1,13,109,-2,-3};
        System.out.println("Сортировка пузырьком: " + Arrays.toString(bubble));
        System.out.println("Результат сортировки: " + StableSorts.bubbleSort(bubble) + "\n");

        int[] insert = {2,1,20,1,13,109,-2,-3};
        System.out.println("Сортировка вставками: " + Arrays.toString(insert));
        System.out.println("Результат сортировки: " + StableSorts.insertionSort(insert) + "\n");

        int[] merge = {2,1,20,1,13,109,-2,-3};
        System.out.println("Сортировка слиянием: " + Arrays.toString(merge));
        System.out.println("Результат сортировки: " + StableSorts.mergeSorts(merge) + "\n");

        int[] count = {2,1,20,1,13,109,-2,-3};
        System.out.println("Сортировка подсчетом: " + Arrays.toString(count));
        System.out.println("Результат сортировки: " + StableSorts.countingSort(count) + "\n");

        int[] heap = {2,1,20,1,13,109,-2,-3};
        System.out.println("Пирамидальная сортировка: " + Arrays.toString(heap));
        System.out.println("Результат сортировки: " + HeapSort.heapSort(heap) + "\n");

        int[] quick = {2,1,20,1,13,109,-2,-3};
        System.out.println("Быстрая сортировка: " + Arrays.toString(quick));
        System.out.println("Результат сортировки: " + QuickSort.quickSort(quick) + "\n");
    }
}
