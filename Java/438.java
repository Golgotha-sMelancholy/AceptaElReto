import java.util.Scanner;

/**
 *
 * 438 - Esgritura - Golgotha's Melancholy - https://github.com/Golgotha-sMelancholy
 */
public class Esgrito {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String cadena = sc.nextLine();
            int letra = 0;
            int noLetra = 0;
            for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == '!') {
                    noLetra++;
                } else if (Character.isLetter(cadena.charAt(i))) {
                    letra++;
                }
            }
            if (letra >= noLetra) {
                System.out.println("escrito");
            } else {
                System.out.println("ESGRITO");
            }
        }
    }

}
