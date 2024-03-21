package exceptions;

import java.util.Scanner;

public class TryWhitResourcesRunner {

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            int[] numbers = {12, 3, 4, 5};
            int number = numbers[21];
        }
    }
}

