import java.util.Scanner;

/**
 *
 * 715 - ¿Hay Suficientes? - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pruebas = sc.nextInt();
        for (int i = 1; i<=pruebas; i++) {
            int uvas = sc.nextInt();
            int personas = sc.nextInt();
            if (uvas / personas >= 12) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

}
