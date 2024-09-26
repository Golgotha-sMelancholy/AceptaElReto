import java.util.Scanner;

/**
 *
 * 114 - Último Dígito del Factorial - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 1; i <= casos; i++) {
            int numero = sc.nextInt();
            if (numero >= 5) {
                System.out.println("0");
            } else if (numero == 4) {
                System.out.println("4");
            } else if (numero == 3) {
                System.out.println("6");
            } else if (numero == 2) {
                System.out.println("2");
            } else if (numero == 1 || numero == 0) {
                System.out.println("1");
            }
        }
        System.exit(0);
    }

}
