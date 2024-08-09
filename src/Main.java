import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // ��������� �� ���������� ������ ����������� �������
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100); // �������� ����� �� 0 �� 99
        }

        // ��������� ������������� ������
        System.out.println("Unsorted array: " + Arrays.toString(array));

        // ���������� ������ �������
        ArrayUtils.mergeSort(array);

        // ��������� ������������� ������
        System.out.println("Sorted array: " + Arrays.toString(array));

        // �������� ����� �������� � �����
        int target = array[random.nextInt(array.length)];
        int index = ArrayUtils.binarySearch(array, target);

        // ��������� ���������� ������
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found.");
        }
    }
}
