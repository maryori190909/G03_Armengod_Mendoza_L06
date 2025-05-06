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

    }

}
