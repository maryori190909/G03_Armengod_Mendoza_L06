import java.util.*;
public class Mainlistag {
    public static void main(String[] args) {
        List<String> lista = Arrays.asList("perro ", " gato", "pericote");
        boolean encontrado = Gestordetareas.buscarelemento(lista, " gato");
        System.out.println("esta gato en la lista?"+ encontrado);

        List<String> listaInvertida = Gestordetareas.invertirlista(lista);
        System.out.println(" Lista invertidad: "+ listaInvertida);

        Node<Integer> head = new Node<>(1);
        head = Gestordetareas.insertaralfinal(head, 8);
        head = Gestordetareas.insertaralfinal(head,9);

        System.out.println(" lista enlazada: ");
        Node<Integer> actual = head;
        while (actual != null){
            System.out.println(actual.getData()+ " = ");
            actual = actual.getNext();
        }
        System.out.println("valor null");

        int cantidad = Gestordetareas.ContarNodos(head);
        System.out.println("cantidad de nodos: " + cantidad);

        Node<Integer> otralis = new Node<Integer>(1);
        otralis = Gestordetareas.insertaralfinal(otralis, 5);
        otralis = Gestordetareas.insertaralfinal(otralis, 4);
        boolean igual = Gestordetareas.soniguales(head, otralis);
        System.out.println("las listas son iguales? " + igual);

        Node<Integer> listab = new Node<>(4);
        listab = Gestordetareas.insertaralfinal(listab, 6);
        Node <Integer> concatenada = Gestordetareas.concatenarlistas(head, listab);
        System.out.println("lista concatenada: ");
        actual = concatenada;
        while (actual != null){
            System.out.println(actual.getData()+ "= ");
            actual = actual.getNext();
        }
        System.out.println("valor null");
    }


}
