package clases;

import java.util.ArrayList;
import java.util.List;

public class Ejercicios {

        public int[] reversedArray(int[] array) {
        int start = 0;
        int end = 0;
        int[] reversedArray = new int[array.length];

        if(array.length == 0){
            return array;
        } else if (array.length == 1) {
            return array;
        }

        for(int i = array.length; i > 0; i--){
                start = array[i-1];
//            System.out.println(start);

                reversedArray[end] = start;
                end++;
            }
            return reversedArray;
        }

         public List<Integer> determineAllFactors(int number) {
             List<Integer> lista = new ArrayList<>();
             int x = 1;

             if(number <= 0){
                 return lista;
             }

             do{
                 if(number % x == 0){
                     lista.add(x);
                 }
                 x++;
             } while(x <= number);
             return lista;
        }

        public List<Integer> determineMultiples(int number, int limit) {

            return null;
        }
    }


