package exceptions;

import java.util.Scanner;

public class FinallyRunner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] numbers = {12, 3, 4, 5};

            int number = numbers[2];

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Before Scanner Close");
            if(sc!=null){
                sc.close();
            }
        }
        System.out.println("Just before closing out main");
    }
}
