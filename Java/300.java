import java.util.Scanner;

/**
 * 300 - Palabras Pentavocálicas - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int prueba = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= prueba; i++) {
            String frase = sc.nextLine();

            if (pentavolica(frase)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

    public static boolean pentavolica(String frase) {
        boolean a = false;
        boolean e = false;
        boolean i = false;
        boolean o = false;
        boolean u = false;
        int j = 0;
        while (j < frase.length() && (!a || !e || !i || !o || !u)) {
            if (frase.charAt(j) == 'a') {
                a = true;
            } else if (frase.charAt(j) == 'e') {
                e = true;
            } else if (frase.charAt(j) == 'i') {
                i = true;
            } else if (frase.charAt(j) == 'o') {
                o = true;
            } else if (frase.charAt(j) == 'u') {
                u = true;
            }
            j++;
        }
        return (a) && (e) && (i) && (o) && (u);
    }
}
