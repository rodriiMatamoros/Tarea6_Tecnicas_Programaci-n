/*Requisito previo: Ejercicio 8 del capítulo Las tablas. Retomar el algoritmo de
 la guerra de barcos, dividiéndolo en procedimientos y funciones */


import java.util.Scanner;

public class ejercicio2 {
    static char[][] tablero = new char[4][4];
    static int barcoFila = (int) (Math.random() * 4);
    static int barcoColumna = (int) (Math.random() * 4);
    static boolean barcoHundido = false;
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        inicializarTablero();
        while (!barcoHundido) {
            mostrarTablero();
            int columna = introducirEnteroEntreLimites(1, 4, "¿Qué columna?");
            int fila = introducirEnteroEntreLimites(1, 4, "¿Qué fila?");
            if (disparar(fila - 1, columna - 1)) {
                barcoHundido = true;
            }
        }
        mostrarTablero();
        System.out.println("¡Ha ganado!");
    }

    public static void inicializarTablero() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    public static void mostrarTablero() {
        System.out.println("Tablero actual:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(tablero[i][j] + "|");
            }
            System.out.println();
        }
    }

    public static int introducirEnteroEntreLimites(int min, int max, String mensaje) {
        int valor;
        do {
            System.out.print(mensaje + " (" + min + "-" + max + "): ");
            valor = entrada.nextInt();
        } while (valor < min || valor > max);
        return valor;
    }

    public static boolean disparar(int fila, int columna) {
        if (fila == barcoFila && columna == barcoColumna) {
            System.out.println("Tocado y hundido");
            tablero[fila][columna] = 'X';
            return true;
        } else {
            System.out.println("Agua");
            tablero[fila][columna] = '~';
            return false;
        }
    }
}