import java.util.Scanner;

/**
 *
 * 369 - Contando en la Arena - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        while (numero != 0) {
            for (int i = 1; i <= numero; i++) {
                System.out.print("1");
            }
            System.out.println();
            numero = sc.nextInt();
        }

    }

}
