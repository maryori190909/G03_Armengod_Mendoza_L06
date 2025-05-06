import java.util.*;
public class Main {
    public static void main(String[] args) {
        Gestordetareas <Tarea> gestor = new Gestordetareas<>();

        Tarea t1 = new Tarea(" envio de informe", 4);
        Tarea t2 = new Tarea(" presentar reporte", 3);
        Tarea t3 = new Tarea("revisar codigo ", 2);

        gestor.agregarTarea(t1);
        gestor.agregarTarea(t2);
        gestor.agregarTarea(t3);

        gestor.eliminarTarea(t3);

        System.out.println(" tareas actuales: ");
        gestor.imprimirTarea();

        System.out.println(" esta el envio de informe? "+ gestor.contieneTarea(t1));

        gestor.invertirTarea();
        System.out.println(" tareas invertidas: ");
        gestor.imprimirTarea();

        gestor.transferiratareascompletas(t2);

        System.out.println(" Tareas actuales: ");
        gestor.imprimirTarea();
        gestor.impimirTareasCompletas();

        List<String> lista = Arrays.asList("perro ", " gato", "pericote");
        boolean encontrado = Gestordetareas.buscarelemento(lista, " gato");
        System.out.println("esta gato en la lista?"+ encontrado);

        List<String> listaInvertida = Gestordetareas.invertirlista(lista);
        System.out.println(" Lista invertidad: "+ listaInvertida);

        Node<Integer> head = new Node<>(1);
        head = Gestordetareas.insertaralfinal(head, 8);
        head = Gestordetareas.insertaralfinal(head,9);


    }

}
