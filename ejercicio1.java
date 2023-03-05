/*Escriba una función que tome dos valores reales como argumentos y devuelva el mayor de los dos.
Escriba otra función que también tome dos valores reales como argumentos, pero que devuelva:
 0 si los dos valores son iguales; 1 si el primer valor es el mayor; el texto -1 en caso contrario.*/


import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer valor");
        double valor1 = sc.nextDouble();
        System.out.println("Ingrese el segundo valor");
        double valor2 = sc.nextDouble();
        System.out.println("El mayor de los dos valores es: " + mayor(valor1, valor2));
        System.out.println("El resultado de la segunda funcion es: " + mayor2(valor1, valor2));
    }

    public static double mayor(double valor1, double valor2) {
        if (valor1 > valor2) {
            return valor1;
        } else {
            return valor2;
        }
    }

    public static String mayor2(double valor1, double valor2) {
        if (valor1 == valor2) {
            return "0";
        } else if (valor1 > valor2) {
            return "1";
        } else {
            return "-1";
        }
    }
}