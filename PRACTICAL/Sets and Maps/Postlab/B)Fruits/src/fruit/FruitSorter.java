package fruit;
import java.util.Set;
import java.util.TreeSet;

public class FruitSorter {
	 public static void main(String[] args) {
	        Set<String> fruits = new TreeSet<>();

	        fruits.add("Banana");
	        fruits.add("Apple");
	        fruits.add("Cherry");
	        fruits.add("Mango");
	        fruits.add("Pineapple");

	        System.out.println("Fruits in alphabetical order:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	    }
}
