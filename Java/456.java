import java.util.Scanner;

/**
 *
 * 456 - Tarta Sácher - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pruebas = sc.nextInt();
        for (int i = 1; i <= pruebas; i++) {
            int contador = 1;
            boolean booleano = false;
            int ancho = sc.nextInt();
            int alto = sc.nextInt();
            int limite = sc.nextInt();
            int anchoalto = ancho * alto;
            while (!booleano) {
                if (anchoalto >= limite) {
                    System.out.println(contador);
                    booleano = true;
                } else {
                    contador++;
                    anchoalto += ancho * alto;
                }
            }
        }

    }

}
