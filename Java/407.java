import java.util.Scanner;

/**
 *
 * 407 - Rebotando en el Parchís - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casillas = sc.nextInt();
        int posicion = sc.nextInt();
        int tirada = sc.nextInt();
        while (casillas != 0 || posicion != 0 || tirada != 0) {
            System.out.println(tablero(casillas, posicion, tirada));
            casillas = sc.nextInt();
            posicion = sc.nextInt();
            tirada = sc.nextInt();
        }

    }

    public static int tablero(int casillas, int posicion, int tirada) {
        int sumatorio = posicion + tirada;
        int posicionActual = 0;
        if (sumatorio > casillas) {
            int resta = sumatorio % casillas;
            posicionActual = casillas - resta;
        } else {
            posicionActual = sumatorio;
        }
        return posicionActual;
    }
}
