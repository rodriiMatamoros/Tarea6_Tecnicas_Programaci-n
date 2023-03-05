/*Escriba una función que cree una tabla que tenga una dimensión de diez números 
enteros e inicialice aleatoriamente los valores de esta tabla, con valores entre 
un límite mínimo y un límite máximo, que se pasan como argumentos. Cree una función
 que devuelva el mayor valor de una tabla (esta tabla no tiene necesariamente diez 
 celdas, etc.). Escriba un algoritmo que llame a estas dos funciones.*/


import java.util.Random;
import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        int[] array = createAndInitializeArray();
        int max = findMaxValue(array);
        System.out.println("El mayor valor en la tabla es: " + max);
    }

    public static int[] createAndInitializeArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el límite mínimo: ");
        int min = scanner.nextInt();
        System.out.println("Ingrese el límite máximo: ");
        int max = scanner.nextInt();

        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }

        System.out.print("La tabla generada es: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        return array;
    }

    public static int findMaxValue(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}
