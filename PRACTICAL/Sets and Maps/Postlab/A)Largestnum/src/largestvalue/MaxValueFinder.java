package largestvalue;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;

public class MaxValueFinder {
	  public static void main(String[] args) {
	        Set<Integer> integerSet = new HashSet<>();
	        integerSet.add(10);
	        integerSet.add(20);
	        integerSet.add(5);
	        integerSet.add(30);
	        integerSet.add(15);

	        Integer maxValue = Collections.max(integerSet);

	        System.out.println("The maximum value in the set is: " + maxValue);
	    }
}
