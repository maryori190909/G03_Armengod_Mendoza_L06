import java.util.*;
public class Gestordetareas <T> {
    private Node <T> cabeza;
    private List<T> tareascompletas;

    public Gestordetareas(){
        this.cabeza = null;
        this.tareascompletas = new ArrayList<>();
    }

    public void agregarTarea(T tarea){
        Node<T> nuevo = new Node<>(tarea);
        if(cabeza == null){
            cabeza = nuevo;
        }
        else{
            Node<T> actual = cabeza;
            while (actual.getNext() != null){
                actual = actual.getNext();
            }
            actual.setNext(nuevo);
        }
    }

    public boolean eliminarTarea(T tarea){
        if (cabeza == null) {
            return false;}
        if(cabeza.getData().equals(tarea)){
            cabeza = cabeza.getNext();
            return true;
        }
        Node<T> actual = cabeza;
        while(actual.getNext()!= null && !actual.getNext().getData().equals(tarea) ){
            actual = actual.getNext();
        }
            if(actual.getNext()== null){
                return false;
            }
            actual.setNext(actual.getNext().getNext());
            return true;
    }
    public boolean contieneTarea(T tarea){
        Node<T> actual = cabeza;
        while(actual != null){
            if(actual.getData().equals(tarea)){
                return true;
            }
            actual = actual.getNext();
        }
        return false;
    }

    public void imprimirTarea(){
        Node<T> actual = cabeza;
        while(actual != null){
            System.out.println(actual.getData());
            actual = actual.getNext();
        }
    }
    public void invertirTarea(){
        Node<T> anterior = null;
        Node<T> actual = cabeza;
        Node<T> siguiente;
        while (actual != null){
            siguiente = actual.getNext();
            actual.setNext(anterior);
            anterior = actual;
            actual = siguiente;
        }
        cabeza = anterior;
    }
    public boolean transferiratareascompletas( T tarea){
        if(eliminarTarea(tarea)){
            tareascompletas.add(tarea);
            return true;
        }
        return false;
    }
    public void impimirTareasCompletas(){
        System.out.println(" Tareas completas: ");
        for(T tarea : tareascompletas){
            System.out.println(tarea);
        }
    }

    public static <T> boolean buscarelemento(List<T> lista, T valor){
        return lista.contains(valor);
    }

    public static <T> List<T> invertirlista(List<T> lista){
        List <T> invertida = new ArrayList<>(lista);
        Collections.reverse(invertida);
        return invertida;
    }
    public static <T> Node<T> insertaralfinal(Node<T> head, T valor){
        Node<T> nuevo = new Node<>(valor);
        if (head == null){
            return nuevo;
        }
        Node<T> actual = head;
        while (actual.getNext()!= null){
            actual = actual.getNext();
        }
        actual.setNext(nuevo);
        return head;
    }
    public static <T> int ContarNodos (Node<T> head){
        int cont = 0;
        Node<T> actual = head;
        while(actual!= null){
            cont++;
            actual = actual.getNext();
        }
        return cont;
    }

    public static<T> boolean soniguales (Node<T> a, Node<T> b){
        while(a!= null && b!= null){
            if (!a.getData().equals(b.getData())){
                return false;
            }
            a = a.getNext();
            b = b.getNext();
        }
        return a == null && b == null;
    }

    public static <T> Node<T> concatenarlistas(Node<T> a, Node<T> b){
        if(a== null){
            return b;
        }
        Node<T> actual = a;
        while (actual.getNext()!= null){
            actual = actual.getNext();
        }
        actual.setNext(b);
        return a;
    }

}
