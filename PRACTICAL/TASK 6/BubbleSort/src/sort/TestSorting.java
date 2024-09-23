package sort;
import java.util.Arrays;

public class TestSorting {
	public static void main(String[] args) {
   
        Integer[] intArray = {5, 2, 9, 1, 3};
        System.out.println("Before sorting (Integers): " + Arrays.toString(intArray));
        GenericBubbleSort.bubbleSort(intArray);
        System.out.println("After sorting (Integers): " + Arrays.toString(intArray));

       
        Double[] doubleArray = {4.2, 1.5, 3.9, 7.3, 0.6};
        System.out.println("\nBefore sorting (Doubles): " + Arrays.toString(doubleArray));
        GenericBubbleSort.bubbleSort(doubleArray);
        System.out.println("After sorting (Doubles): " + Arrays.toString(doubleArray));

 
        String[] stringArray = {"apple", "orange", "banana", "kiwi", "grape"};
        System.out.println("\nBefore sorting (Strings): " + Arrays.toString(stringArray));
        GenericBubbleSort.bubbleSort(stringArray);
        System.out.println("After sorting (Strings): " + Arrays.toString(stringArray));
    }
}
