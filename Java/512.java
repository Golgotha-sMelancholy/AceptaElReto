import java.util.Scanner;

/**
 *
 * 512 - Döner Sospechoso - Iván - https://github.com/wildfireOfMine
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println((b * 100) / (b + c));
        }
    }
}
