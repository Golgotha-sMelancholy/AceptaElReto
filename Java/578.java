import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * 578 - Haciendo Inventario - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();
        while (casos > 0) {
            HashSet<String> inventario = new HashSet<String>();
            for (int i = 0; i < casos; i++) {
                inventario.add(sc.nextLine().toLowerCase());
            }
            System.out.println(inventario.size());
            casos = sc.nextInt();
            sc.nextLine();
        }
    }
}
