// El juego del rebaño de ovejas

import java.util.Scanner;

public class JuegoOvejas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] ovejas = {'>', '>', '>', ' ', '<', '<', '<'};

        System.out.println("Bienvenido al juego de cruzar ovejas!");
        System.out.println("El objetivo del juego es mover las ovejas de la izquierda a la derecha");
        System.out.println("Solo puedes mover una oveja a la vez y solo si hay una casilla vacía delante de ella");
        System.out.println("Buena suerte!\n");

        while (!esVictoria(ovejas)) {
            mostrarOvejas(ovejas);
            System.out.print("Seleccione la oveja que desea mover (0-6): ");
            int oveja = input.nextInt();

            if (ovejas[oveja] == ' ' || oveja == 0 || oveja == 6) {
                System.out.println("La oveja seleccionada no se puede mover, por favor seleccione otra.");
                continue;
            }

            if (ovejas[oveja] == '>' && ovejas[oveja + 1] == ' ') {
                ovejas[oveja] = ' ';
                ovejas[oveja + 1] = '>';
            } else if (ovejas[oveja] == '<' && ovejas[oveja - 1] == ' ') {
                ovejas[oveja] = ' ';
                ovejas[oveja - 1] = '<';
            } else {
                System.out.println("No se puede mover la oveja seleccionada, por favor seleccione otra.");
            }
        }

        System.out.println("Felicidades, ¡has ganado el juego!");
    }

    public static boolean esVictoria(char[] ovejas) {
        return ovejas[0] == '<' && ovejas[1] == '<' && ovejas[2] == '<' &&
                ovejas[3] == ' ' && ovejas[4] == '>' && ovejas[5] == '>' && ovejas[6] == '>';
    }

    public static void mostrarOvejas(char[] ovejas) {
        System.out.println(ovejas);
    }
}