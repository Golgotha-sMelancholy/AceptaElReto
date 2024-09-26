import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

/**
 *
 * 579 - Felipe y Sus Tareas - Iván - https://github.com/wildfireOfMine
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        Tarea tarea;
        while (casos > 0) {
            PriorityQueue<Tarea> colaTareasPendientes = new PriorityQueue(100, new Comparador());
            for (int i = 0; i < casos; i++) {
                int prioridad = sc.nextInt();
                int duracion = sc.nextInt();
                tarea = new Tarea(prioridad, duracion);
                colaTareasPendientes.add(tarea);
            }
            while (!colaTareasPendientes.isEmpty()) {
                Tarea tarea2 = colaTareasPendientes.poll();
                System.out.println(tarea2.getPrioridad() + " " + tarea2.getDuracion());
            }
            System.out.println("---");
            casos = sc.nextInt();

        }
    }

}
class Tarea {
    
    private int prioridad;
    private int duracion;

    public Tarea(int prioridad, int duracion) {
        this.prioridad = prioridad;
        this.duracion = duracion;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public int getDuracion() {
        return this.duracion;
    }
}
class Comparador implements Comparator<Tarea> {

    @Override
    public int compare(Tarea o1, Tarea o2) {
        Integer d1 = o1.getDuracion();
        Integer p1 = o1.getPrioridad();
        Integer d2 = o2.getDuracion();
        Integer p2 = o2.getPrioridad();

        int numero = p1.compareTo(p2);
        if (numero == 1) {
            numero = -1;
        } else if (numero == -1) {
            numero = 1;
        } else if (numero == 0) {
            numero = d1.compareTo(d2);
        }
        return numero;
    }
}
