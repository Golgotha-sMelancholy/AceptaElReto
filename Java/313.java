import java.util.Scanner;

/**
 *
 * 313 - Fin de Mes - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bucle = sc.nextInt();
        for (int i = 1; i <= bucle; i++) {
            int saldo = sc.nextInt();
            int cambio = sc.nextInt();
            if (saldo + cambio >= 0) {
                System.out.println("SI");
            } else if (saldo + cambio < 0) {
                System.out.println("NO");
            }
        }
    }
}
