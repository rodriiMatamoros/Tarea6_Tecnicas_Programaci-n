/*Escribir un algoritmo para hacer dibujos en arte ASCII. El diseño está modelizado por una 
tabla de caracteres de diez líneas y cuarenta columnas. Inicialmente, esta tabla contiene 
solo caracteres de espacio. Un procedimiento debe llevar a cabo la visualización de la obra. 
Cuando se inicia el programa, se muestra el dibujo y, a continuación, un menú ofrece realizar
 una de las siguientes funciones: Dibujar un carácter. Dibujar un rectángulo con un conjunto
  de caracteres. Cambiar "el color" (es decir, el carácter), usando un bote de pintura 
  (puede inspirarse en lo que se presentó en la sección que trata sobre la recursividad). 
  Cada una de las funciones mencionadas se debe realizar utilizando uno o más procedimientos.*/


  
import java.util.Scanner;

public class ejercicio5 {

    // Definir la matriz que representa el dibujo
    private static char[][] dibujo = new char[10][40];

    public static void main(String[] args) {

        // Inicializar el dibujo con caracteres de espacio
        for (int i = 0; i < dibujo.length; i++) {
            for (int j = 0; j < dibujo[0].length; j++) {
                dibujo[i][j] = ' ';
            }
        }

        // Mostrar el dibujo inicial
        mostrarDibujo();

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar el menú y procesar la entrada del usuario hasta que elija la opción "Salir"
        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Dibujar un carácter");
            System.out.println("2. Dibujar un rectángulo");
            System.out.println("3. Cambiar el color del carácter");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    dibujarCaracter();
                    break;
                case 2:
                    dibujarRectangulo();
                    break;
                case 3:
                    cambiarColor();
                    break;
                case 4:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }

            mostrarDibujo();
        }
    }

    // Procedimiento para mostrar el dibujo en la pantalla
    private static void mostrarDibujo() {
        for (int i = 0; i < dibujo.length; i++) {
            for (int j = 0; j < dibujo[0].length; j++) {
                System.out.print(dibujo[i][j]);
            }
            System.out.println();
        }
    }

    // Procedimiento para dibujar un carácter en una posición específica
    private static void dibujarCaracter() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Fila (entre 1 y 10): ");
        int fila = scanner.nextInt() - 1;
        System.out.print("Columna (entre 1 y 40): ");
        int columna = scanner.nextInt() - 1;
        System.out.print("Ingrese el carácter: ");
        char caracter = scanner.next().charAt(0);
        dibujo[fila][columna] = caracter;
    }

    // Procedimiento para dibujar un rectángulo
    private static void dibujarRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la fila superior izquierda (entre 1 y 10): ");
        int filaInicial = scanner.nextInt() - 1;
        System.out.print("Ingrese la columna superior izquierda (entre 1 y 40): ");
        int columnaInicial = scanner.nextInt() - 1;
        System.out.print("Ingrese la anchura (entre 1 y " + (40 - columnaInicial) + "): ");
        int anchura = scanner.nextInt();
        System.out.print("Ingrese la altura (entre 1 y " + (10 - filaInicial) + "): ");
        int altura = scanner.nextInt();
        System.out.print("Ingrese el carácter: ");
        char caracter = scanner.next().charAt(0);

        for (int i = filaInicial; i < filaInicial + altura; i++) {
            for (int j = columnaInicial; j < columnaInicial + anchura; j++) {
                dibujo[i][j] = caracter;
            }
        }
    }
    private static void cambiarColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el carácter que había puesto: ");
        char caracter = scanner.next().charAt(0);
        System.out.print("Ingrese el nuevo carácter que quiera poner: ");
        char nuevoCaracter = scanner.next().charAt(0);
        for (int i = 0; i < dibujo.length; i++) {
            for (int j = 0; j < dibujo[0].length; j++) {
                if (dibujo[i][j] == caracter) {
                    dibujo[i][j] = nuevoCaracter;
                }
            }
        }
    }
}


