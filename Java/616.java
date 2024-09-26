import java.util.Scanner;

/**
 *
 * 616 - Pic, Poc, Pic... Pong! - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeroCasos = sc.nextInt();
        while (numeroCasos > 0) {
            int numeroGolpeoPalas = 0;
            int puntosDerecha = 0;
            int puntosIzquierda = 0;
            for (int i = 1; i <= numeroCasos; i++) {
                String registro = sc.next();
                if (registro.equals("PIC")) {
                    numeroGolpeoPalas++;
                } else if (registro.equals("PONG!")) {
                    if (numeroGolpeoPalas % 2 == 1) {
                        puntosDerecha++;
                    } else {
                        puntosIzquierda++;
                    }
                }
            }
            System.out.println(puntosIzquierda + " " + puntosDerecha);
            numeroCasos = sc.nextInt();
        }
    }
}
