import java.util.ArrayList;
import java.util.Scanner;

public class Pantalla {

	static ArrayList<Tarea> listaTareas = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar una tarea");
            System.out.println("2. Marcar tarea");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Mostrar lista de tareas");
            System.out.println("5. Salir");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    agregarTarea();
                    break;
                case 2:
                    TareasCompletadas();
                    break;
                case 3:
                    EliminarTarea();
                    break;
                case 4:
                    mostrarLista();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 5);
        
        scanner.close();
    }


    public static void agregarTarea(){
        System.out.println("Ingresar nombre de la tarea: ");
        String NombreTarea = scanner.nextLine();
        listaTareas.add(new Tarea(NombreTarea));
        System.out.println("Tarea agregada");
    }
    
    public static void TareasCompletadas(){
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas para marcar como completadas.");
            return;
        }

        System.out.println("Lista de tareas:");
        for (int i = 0; i < listaTareas.size(); i++) {
            System.out.println((i + 1) + ". " + listaTareas.get(i).getNombre() + " - Completada4: " + listaTareas.get(i).isTerminado());
        }

        System.out.print("Ingrese el número de la tarea que desea marcar como completada: ");
        int NumeroTarea = scanner.nextInt();
        if (NumeroTarea < 1 || NumeroTarea > listaTareas.size()) {
            System.out.println("Número de tarea inválido.");
            return;
        }

        Tarea tarea = listaTareas.get(NumeroTarea - 1);
        tarea.setTerminado(true);
        System.out.println("Tarea marcada como completada.");
    }
    public static void EliminarTarea(){
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas para eliminar.");
            return;
        }

        System.out.println("Lista de tareas:");
        for (int i = 0; i < listaTareas.size(); i++) {
            System.out.println((i + 1) + ". " + listaTareas.get(i).getNombre() + " - Completada: " + listaTareas.get(i).isTerminado());
        }

        System.out.print("Ingrese el número de la tarea que desea eliminar: ");
        int NumeroTarea = scanner.nextInt();
        if (NumeroTarea < 1 || NumeroTarea > listaTareas.size()) {
            System.out.println("Número de tarea inválido.");
            return;
        }

        listaTareas.remove(NumeroTarea - 1);
        System.out.println("Tarea eliminada correctamente.");
    }
    public static void mostrarLista(){
        System.out.println("--- Reporte de Tareas ---");
        if (listaTareas.isEmpty()) {
            System.out.println("No hay tareas registradas.");
            return;
        }

        System.out.println("Tareas en curso:");
        int progreso = 0;
        for (Tarea tarea : listaTareas) {
            if (!tarea.isTerminado()) {
                System.out.println("- " + tarea.getNombre());
                progreso++;
            }
        }
        if (progreso == 0) {
            System.out.println("(Ninguna)");
        }

        System.out.println("\nTareas completadas:");
        int terminado = 0;
        for (Tarea tarea : listaTareas) {
            if (tarea.isTerminado()) {
                System.out.println("- " + tarea.getNombre());
                terminado++;
            }
        }
        if (terminado == 0) {
            System.out.println("(Ninguna)");
        }
    }

}


