import java.util.Scanner;

/**
 *
 * 635 - Cinquecento - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 1; i <= casos; i++) {
            int ano = sc.nextInt();

            System.out.println((ano + 99) / 100);

        }

    }
}
