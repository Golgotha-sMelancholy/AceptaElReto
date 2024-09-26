import java.util.Scanner;

/**
 *
 * 427 - Yo Soy Tu... - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 1; i <= casos; i++) {
            String nombre = sc.next();
            String parentesco = sc.next();
            if (nombre.equals("Luke") && parentesco.equals("padre")) {
                System.out.println("TOP SECRET");
            } else {
                System.out.println(nombre + ", yo soy tu " + parentesco);
            }
        }
    }
}
