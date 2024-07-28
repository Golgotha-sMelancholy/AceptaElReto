import java.util.Scanner;

/**
 *
 * 617 - Mensajes en Space Invaders - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 1; i <= casos; i++) {
            int filas = sc.nextInt();
            sc.nextLine();
            char[][] tablero = new char[filas][3];
            for (int fila = 0; fila < filas; fila++) {
                String cadena = sc.next();
                for (int columna = 0; columna < 3; columna++) {
                    tablero[fila][columna] = cadena.charAt(columna);
                }
            }
            for (int fila = 0; fila < tablero[0].length; fila++) {
                for (int columna = 0; columna < tablero.length; columna++) {
                    System.out.print(tablero[columna][fila]);
                }
            }
            System.out.print("\n");
        }
    }
}
