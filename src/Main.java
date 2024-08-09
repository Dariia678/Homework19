import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Створення та заповнення масиву випадковими числами
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // випадкові числа від 0 до 99
        }

        // Виведення несортованого масиву
        System.out.println("Unsorted array: " + Arrays.toString(array));

        // Сортування масиву злиттям
        ArrayUtils.mergeSort(array);

        // Виведення відсортованого масиву
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Бінарний пошук елемента в масиві
        int target = array[random.nextInt(array.length)];
        int index = ArrayUtils.binarySearch(array, target);

        // Виведення результату пошуку
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }
}
