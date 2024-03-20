package exceptions;

import java.util.Scanner;

public class FinallyRunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {12,3,4,5};

        int number = numbers[5];

        System.out.println("Before Scanner Close");

        sc.close();
    }
}
