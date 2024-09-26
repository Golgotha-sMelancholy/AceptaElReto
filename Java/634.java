import java.util.Scanner;

/**
 *
 * 634 - Bandurria Hero - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 1; i<=casos; i++) {
            String notas = sc.next();
            int combo = 10;
            int resultado = 0;
            for (int j = 0; j<notas.length(); j++) {
                if (notas.charAt(j) == 'O') {
                    resultado += combo;
                    combo += 10;
                } else {
                    combo = 10;
                }
            }
            System.out.println(resultado);
            
        }

    }
}
