import java.util.Scanner;

/**
 *
 * 557 - Cucharadas de Sopa - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 1; i <= casos; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println((Math.min(c - a + 1, b + 1)));
        }
    }

}
