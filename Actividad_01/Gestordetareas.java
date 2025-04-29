public class Gestordetareas <T> {
    private Node <T> cabeza;

    public Gestordetareas(){
        this.cabeza = null;
    }

    public void agregarTarea(T tarea){
        Node<T> nuevo = new Node<>(tarea);
        if(cabeza == null){
            cabeza = nuevo;
        }
    }

}
