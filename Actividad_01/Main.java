public class Main {
    public static void main(String[] args) {
        Gestordetareas <Tarea> gestor = new Gestordetareas<>();

        Tarea t1 = new Tarea(" envio de informe", 4);
        Tarea t2 = new Tarea(" presentar reporte", 3);
        Tarea t3 = new Tarea("revisar codigo ", 2);

        gestor.agregarTarea(t1);
        gestor.agregarTarea(t2);
        gestor.agregarTarea(t3);

        gestor.eliminarTarea(t3)
    }

}
