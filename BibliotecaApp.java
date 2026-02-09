import java.util.ArrayList;
import java.util.Scanner;

public class BibliotecaApp {

    // prestamo = [idPrestamo, nombreUsuario, tituloLibro, diasPrestamo, multaPorDia]
    static Object[][] prestamos = new Object[10][5];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1 -> registrarPrestamo();
                case 2 -> mostrarPrestamos();
                case 3 -> buscarPrestamoPorId();
                case 4 -> actualizarPrestamo();
                case 5 -> eliminarPrestamo();
                case 6 -> calcularTotalMultas();
                case 7 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
            System.out.println();
        } while (opcion != 7);

        sc.close();
    }

    static void mostrarMenu() {
        System.out.println("=== Biblioteca: Gestión de Préstamos ===");
        System.out.println("1. Registrar nuevo préstamo");
        System.out.println("2. Mostrar todos los préstamos");
        System.out.println("3. Buscar préstamo por ID");
        System.out.println("4. Actualizar un préstamo");
        System.out.println("5. Eliminar un préstamo");
        System.out.println("6. Calcular total de multas");
        System.out.println("7. Salir");
    }

    // ====== CRUD (por implementar) ======
    static void registrarPrestamo() { /* TODO */ }
    static void mostrarPrestamos() { /* TODO */ }
    static void buscarPrestamoPorId() { /* TODO */ }
    int id = leerEntero("Ingrese el ID a buscar: ");
        for (int i = 0; i < filas; i++) {
            if ((int) prestamos[i][0] == id) {
                System.out.println(
                    "ID: " + prestamos[i][0] +
                    ", Usuario: " + prestamos[i][1] +
                    ", Libro: " + prestamos[i][2] +
                    ", Días: " + prestamos[i][3] +
                    ", Multa/día: " + prestamos[i][4]
                );
                return;
            }
        }
        System.out.println("Préstamo no encontrado.");
    int id = leerEntero("Ingrese el ID a actualizar: ");
        for (int i = 0; i < filas; i++) {
            if ((int) prestamos[i][0] == id) {
                prestamos[i][1] = leerTexto("Nuevo nombre de usuario: ");
                prestamos[i][2] = leerTexto("Nuevo título del libro: ");
                prestamos[i][3] = leerEntero("Nuevos días de préstamo: ");
                prestamos[i][4] = leerEntero("Nueva multa por día: ");
                System.out.println("Préstamo actualizado.");
                return;
            }
        }
        System.out.println("Préstamo no encontrado.");
    static void eliminarPrestamo() { 

    }
    // ====== Cálculo (por implementar) ======
    static void calcularTotalMultas() {
        }
    // ====== Utilidades mínimas ======
    static int leerEntero(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("Ingrese un entero válido.");
            }
        }
    }

    static String leerTexto(String msg) {
        System.out.print(msg);
        return sc.nextLine().trim();
    }
}

