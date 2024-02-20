import java.util.ArrayList;
import java.util.Scanner;

public class Pantalla {

	static ArrayList<String[]> listaTareas = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar una tarea");
            System.out.println("2. Editar una tarea");
            System.out.println("3. Editar un estado");
            System.out.println("4. Mostrar lista de tareas");
            System.out.println("5. Salir");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    agregarTarea();
                    break;
                case 2:
                    editarTarea();
                    break;
                case 3:
                    editarEstado();
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

}
