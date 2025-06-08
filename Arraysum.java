/*example of using the Parallel Streams API to calculate the sum of an array of integers: */

import java.util.Arrays;
//import java.util.Scanner;

public class Arraysum {
    public static void main(String[] args) 
    {
        int[] array = {1, 2, 10, 4, 15, 6, 27, 8};
        /*
        How to use Scanner to input an array of a defined length????
        Scanner keyboard = new Scanner(System.in); 
        System.out.println("Enter the elements of the array :");
        int[] array = Integer.parseInt(keyboard.next());
        */

        int sum = Arrays.stream(array) //works like a loop
                        .parallel() //returns an equivalent stream that is ||, may return itself
                        .sum();
        System.out.println("Sum: " + sum);
    }
}