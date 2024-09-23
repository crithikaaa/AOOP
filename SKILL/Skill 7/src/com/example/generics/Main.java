package com.example.generics;

public class Main {

    public static void main(String[] args) {
        MaxMinImpl<Integer> intMaxMin = new MaxMinImpl();
        Integer[] intArray = {1, 5, 3, 9, 2};
        System.out.println("Integer Array: Max = " + intMaxMin.findMax(intArray) + ", Min = " + intMaxMin.findMin(intArray));

        MaxMinImpl<String> stringMaxMin = new MaxMinImpl<>();
        String[] stringArray = {"apple", "banana", "peach", "cherry", "kiwi"};
        System.out.println("String Array: Max = " + stringMaxMin.findMax(stringArray) + ", Min = " + stringMaxMin.findMin(stringArray));

        MaxMinImpl<Character> charMaxMin = new MaxMinImpl<>();
        Character[] charArray = {'a', 'z', 'c', 'm', 'b'};
        System.out.println("Character Array: Max = " + charMaxMin.findMax(charArray) + ", Min = " + charMaxMin.findMin(charArray));

        MaxMinImpl<Float> floatMaxMin = new MaxMinImpl<>();
        Float[] floatArray = {1.5f, 2.7f, 3.9f, 0.2f, 4.6f};
        System.out.println("Float Array: Max = " + floatMaxMin.findMax(floatArray) + ", Min = " + floatMaxMin.findMin(floatArray));
    }
}
