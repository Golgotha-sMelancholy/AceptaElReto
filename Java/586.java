import java.util.Scanner;

/**
 *
 * 586 - Colección de Calendarios de Bolsillo - Iván - https://github.com/wildfireOfMine
 */
public class Main {

   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        int elMenor = 0;
        int elMayor = 0;
        for (int i = 1; i <= casos; i++) {
            int anosFuera = 0;
            int bucle = sc.nextInt();
            int[] inventario = new int[bucle];
            for (int j = 0; j < bucle; j++) {
                int ano = sc.nextInt();
                inventario[j] = ano;
                if (j == 0) {
                    elMenor = ano;
                    elMayor = ano;
                } else if (ano < elMenor) {
                    elMenor = ano;
                } else if (ano > elMayor) {
                    elMayor = ano;
                }
            }
            for (int k = elMenor + 1; k < elMayor; k++) {
                boolean calendarioReutilizado = true;
                int recorredor = 0;
                while (calendarioReutilizado && recorredor < inventario.length) {
                    if (k == inventario[recorredor]) {
                        calendarioReutilizado = false;
                    }
                    recorredor++;
                }
                if (calendarioReutilizado) {
                    anosFuera++;
                }
            }
            System.out.println(anosFuera);
        }
    }
}
