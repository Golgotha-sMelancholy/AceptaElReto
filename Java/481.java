import java.util.Scanner;

/**
 *
 * 481 - Ajedrez Asistido por Computador - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int fila = sc.nextInt();
        int columna = 0;
        while (fila != 0 || columna != 0) {
            char filaAjedrez = ' ';
            if (fila == 1) {
                filaAjedrez = 'h';
            } else if (fila == 2) {
                filaAjedrez = 'g';
            } else if (fila == 3) {
                filaAjedrez = 'f';
            } else if (fila == 4) {
                filaAjedrez = 'e';
            } else if (fila == 5) {
                filaAjedrez = 'd';
            } else if (fila == 6) {
                filaAjedrez = 'c';
            } else if (fila == 7) {
                filaAjedrez = 'b';
            } else if (fila == 8) {
                filaAjedrez = 'a';
            }
            columna = sc.nextInt();
            System.out.println(filaAjedrez + "" + columna);
            columna = 0;
            fila = sc.nextInt();
        }
    }
}
