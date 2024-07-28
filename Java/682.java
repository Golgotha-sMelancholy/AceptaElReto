import java.util.Scanner;

/**
 *
 * 682 - Metidos en un Cajón - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int casos = sc.nextInt();
        for (int i = 1; i <= casos; i++) {
            int cosa = sc.nextInt();
            System.out.println(cosa + " " + cosa * 2);
        }
    }

}
