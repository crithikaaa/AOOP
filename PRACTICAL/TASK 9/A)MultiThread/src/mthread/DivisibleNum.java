package mthread;

public class DivisibleNum {
	public static final int MAX_NUMBER = 15;
    public static int currentNumber = 1;

    public static synchronized void printTwo() {
        if (currentNumber % 2 == 0) {
            System.out.println("Divisible by 2: " + currentNumber);
        }
    }

    public static synchronized void printThree() {
        if (currentNumber % 3 == 0) {
            System.out.println("Divisible by 3: " + currentNumber);
        }
    }

    public static synchronized void printFour() {
        if (currentNumber % 4 == 0) {
            System.out.println("Divisible by 4: " + currentNumber);
        }
    }

    public static synchronized void printFive() {
        if (currentNumber % 5 == 0) {
            System.out.println("Divisible by 5: " + currentNumber);
        }
    }

    public static synchronized void printNumber() {
        if (currentNumber % 2 != 0 && currentNumber % 3 != 0 && currentNumber % 4 != 0 && currentNumber % 5 != 0) {
            System.out.println("Number: " + currentNumber);
        }
    }

    public static boolean isFinished() {
        return currentNumber > MAX_NUMBER;
    }
}
