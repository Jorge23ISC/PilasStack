package Pilas;
import java.util.Scanner;
//Andres Manuel Flores Bonilla
//Jimena Hernandez Luna
//Jorge Juarez Marcelo
//Sebastian Gadiel Perez Solano
public class Main {
    public static void main(String[] args) {
        buscadorStack();
    }
    public static void buscadorStack() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la capacidad de busqueda: ");
        int capacidad = scanner.nextInt();
        scanner.nextLine();
        BuscadorPila buscador = new BuscadorPila(capacidad);
        int opcion;

        do {
            System.out.println("\nOperaciones:");
            System.out.println("1. Ingresar Busqueda");
            System.out.println("2. Eliminar Busqueda");
            System.out.println("3. Ver cima (peek)");
            System.out.println("4. Mostrar Historial");
            System.out.println("5. Salir");
            System.out.println("Seleccione una opcion");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese Su Busqueda: ");
                    String elemento = scanner.nextLine();
                    buscador.agregar(elemento);
                    break;
                case 2:
                    buscador.quitar();
                    break;
                case 3:
                    buscador.limite();
                    break;
                case 4:
                    buscador.mostrarPila();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("No valido");
            }
        } while (opcion != 5);
        scanner.close();
    }
}

