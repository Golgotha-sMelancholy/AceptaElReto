import java.util.Scanner;

/**
 *
 * 364 - Espionaje en Navidad - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        while (!frase.equals("FIN")) {
            int i = 0;
            String abecedario = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            while (frase.length() != i) {
                int encriptacion = 1 + abecedario.indexOf(frase.charAt(i));
                if (abecedario.indexOf(frase.charAt(i)) != -1) {
                    System.out.print(encriptacion == abecedario.length() ? 'A' : abecedario.charAt(encriptacion));
                } else {
                    System.out.print(" ");
                }
                i++;
            }
            System.out.println();
            frase = sc.nextLine();
        }
    }
}
