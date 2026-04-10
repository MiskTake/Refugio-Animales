import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class RefugioAnimales {
    public static Scanner scanner = new Scanner(System.in);
    //Se declaran variables globales para que se pueda acceder a ellas desde todas las funciones
    public static List <String> nombreAnimales = new ArrayList<>(Arrays.asList(
    // Perros
    "Rocky", "Luna", "Max",
    // Gatos
    "Mishi", "Pelusa", "Tom",
    // Piedras
    "Rocoso", "Piedrín", "Rocky",
    // Aves
    "Piolín", "Azulito", "Kiwi",
    // Roedores
    "Chispi", "Bolita", "Manchita"
    ));

    // Set de especies, no permite duplicados, no hay orden (en teoria?)
    public static Set<String> especies = new HashSet<>();
    public static String[] estados = {"Disponible","Adoptado"};
    public static Map<String, String> especieAnimal= new HashMap<>();
    public static Map<String, String> estadoAnimal = new HashMap<>();
    
    public static void main(String[] args) {

        int opcion;
        llenarDatos();


        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); //Limpiar buffer de scanner para evitar el salto de línea invisible luego de un nextInt()

            switch (opcion) {

                //Registrar animal
                case 1 -> {
                    registrarAnimal();
                }
                    

                //Registrar especie
                case 2 -> {
                    registrarEspecie();
                }
                    

                //Marcar animal como adoptado
                case 3 -> {
                    marcarAnimal();
                }
                    

                //Mostrar animales disponibles  
                case 4 -> {
                    animalesDisponibles();
                }
                    

                //Mostrar animales adoptados
                case 5 -> {
                    animalesAdoptados();
                }
                    

                //Mostrar reporte general
                case 6 -> {
                    mostrarReporte();
                }
                    
                
                //salir   
                case 7 -> {
                    salir();
                }


            }
        } while (opcion != 7);

        scanner.close();
    }

    public static void llenarDatos(){

        especies.add("Perro");
        especies.add("Gato");
        especies.add("Piedra");
        especies.add("Ave");
        especies.add("Roedor");

        especieAnimal.put("Firulais", "Perro");
        especieAnimal.put("Luna", "Perro");
        especieAnimal.put("Max", "Perro");
        especieAnimal.put("Mishi", "Gato");
        especieAnimal.put("Pelusa", "Gato");
        especieAnimal.put("Tom", "Gato");
        especieAnimal.put("Rocoso", "Piedra");
        especieAnimal.put("Piedrín", "Piedra");
        especieAnimal.put("Rocky", "Piedra");
        especieAnimal.put("Piolín", "Ave");
        especieAnimal.put("Azulito", "Ave");
        especieAnimal.put("Kiwi", "Ave");
        especieAnimal.put("Chispi", "Roedor");
        especieAnimal.put("Bolita", "Roedor");
        especieAnimal.put("Manchita", "Roedor");

        estadoAnimal.put("Rocky", "Disponible");
        estadoAnimal.put("Luna", "Disponible");
        estadoAnimal.put("Max", "Disponible");
        estadoAnimal.put("Mishi", "Disponible");
        estadoAnimal.put("Pelusa", "Disponible");
        estadoAnimal.put("Tom", "Disponible");
        estadoAnimal.put("Rocoso", "Disponible");
        estadoAnimal.put("Piedrín", "Disponible");
        estadoAnimal.put("Rocky", "Disponible");
        estadoAnimal.put("Piolín", "Disponible");
        estadoAnimal.put("Azulito", "Disponible");
        estadoAnimal.put("Kiwi", "Disponible");
        estadoAnimal.put("Chispi", "Disponible");
        estadoAnimal.put("Bolita", "Disponible");
        estadoAnimal.put("Manchita", "Disponible");

    }

    public static void mostrarMenu(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush();

        System.out.println("╔═════════════════════════════════════╗");
        System.out.println("║     === REFUGIO DE ANIMALES ===     ║");
        System.out.println("╠═════════════════════════════════════╣");
        System.out.println("║   1. Registrar animal               ║");
        System.out.println("║   2. Registrar especie              ║");
        System.out.println("║   3. Marcar animal como adoptado    ║");
        System.out.println("║   4. Mostrar animales disponibles   ║");
        System.out.println("║   5. Mostrar animales adoptados     ║");
        System.out.println("║   6. Mostrar reporte general        ║");
        System.out.println("║   7. Salir                          ║");
        System.out.println("╠═════════════════════════════════════╣");
        System.out.println("║           Elige una opción          ║");
        System.out.println("╚═════════════════════════════════════╝");
            
    }

    public static void registrarAnimal(){
        System.out.print("\033[H\033[2J");
        System.out.flush(); // Limpia pantalla

        System.out.println("--- REGISTRAR NUEVO ANIMAL ---");

        //Validación: ¿Existen especies para asignar?
        if (especies.isEmpty()) {
                System.out.println("ERROR: No puedes registrar animales si no hay especies creadas.");
            return;
        }

        // Pedir y validar el nombre
        System.out.print("Nombre del animal: ");
        String nombre = scanner.nextLine().trim();

        if (nombre.isEmpty()) {
            System.out.println("ERROR: El nombre no puede estar vacío.");
            return;
        }

        // Validar duplicados usando las llaves del mapa
        if (especieAnimal.containsKey(nombre)) {
            System.out.println("ERROR: Ya existe un animal llamado " + nombre);
            return;
        }

        // Pedir y validar la especie
        System.out.println("Especies disponibles: " + especies);
        System.out.print("Especie: ");
        String especie = scanner.nextLine().trim();

        if (!especies.contains(especie)) {
            System.out.print("ERROR: La especie '" + especie + "' no está registrada.");
            return;
        }

        // GUARDAR EN LAS ESTRUCTURAS
        // Relación nombre con su especie
        especieAnimal.put(nombre, especie);

        // Relación nombre con el estado inicial "Disponible"
        estadoAnimal.put(nombre, estados[0]);
        System.out.print("¡LISTO! " + nombre + " (" + especie + ") registrado correctamente");
    }

    public static void registrarEspecie(){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int opcion;

        System.out.println("Selecione una opción: ");
        System.out.println("1. Ver especies registradas");
        System.out.println("2. Ingresar nueva especie");
        System.out.println();

        opcion = scanner.nextInt();
        scanner.nextLine(); //Limpiar buffer de scanner
        switch (opcion){

            case 1 -> System.out.println(especies);

            case 2 -> {
                System.out.println("Ingrese especie nueva: ");
                String nombreespecienueva = scanner.nextLine();
                especies.add(nombreespecienueva);
            }
        }
    }


    public static void marcarAnimal(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 

        System.out.println("Opción en desarrollo");
    }

    public static void animalesDisponibles() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        boolean hayDisponible = false

        for (int i = 0 < nombreAnimales.size(); i++) {
            String nombre = nombreAnimales.get(i);
            String estado = estadoAnimal.get(nombreAnimales);

            if (estado.equals / ("disponible"))
                System.out.println("ID" + i + " Nombre" + nombreAnimales);
        }
    }
            if (!hayDisponible)
                System.out.println("No hay animales disponibles");
    }

    public static void animalesAdoptados(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 


    }

    public static void mostrarReporte(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 

        // === CONTADORES ===
        int totalAnimales = nombreAnimales.size();

        // Contar disponibles y adoptados iterando sobre los valores del mapa estadoAnimal
        // No es necesario saber la key (es decir, los nombres de los animales), solo es importante saber los values
        int totalDisponibles = 0;
        int totalAdoptados = 0;

        for (String estado : estadoAnimal.values()) {
            if (estado.equals("Disponible")) {
                totalDisponibles++;
            } else if (estado.equals("Adoptado")) {
                totalAdoptados++;
            }
        }

        // === REPORTE ===
        System.out.println("╔════════════════════════════════════════════════╗");
        System.out.println("║           === REPORTE GENERAL ===              ║");
        System.out.println("╠════════════════════════════════════════════════╣");
        // printf permite formatear el texto con ancho fijo para alinear las columnas (sintaxis: %-25d para numero y %-25s para string)
        System.out.printf( "║  Total de animales  : %-25d║%n", totalAnimales);
        System.out.printf( "║  Total disponibles  : %-25d║%n", totalDisponibles);
        System.out.printf( "║  Total adoptados    : %-25d║%n", totalAdoptados);

        // === TABLA DE ANIMALES ===
        System.out.println("╠═══════════════╪═══════════════╪════════════════╣");
        System.out.printf( "║  %-13s │ %-13s │ %-14s║%n", "Nombre", "Especie", "Estado");
        System.out.println("╠═══════════════╪═══════════════╪════════════════╣");

        for (String nombre : nombreAnimales) {
            String especie = especieAnimal.getOrDefault(nombre, "Sin especie");
            String estado  = estadoAnimal.getOrDefault(nombre, "Sin estado");
            System.out.printf("║  %-13s │ %-13s │ %-14s║%n", nombre, especie, estado);
        }

        System.out.println("╚═══════════════╧═══════════════╧════════════════╝");

        // === PAUSA ANTES DE VOLVER AL MENÚ ===
        System.out.println();
        System.out.println("Presione Enter para volver al menú principal...");
        scanner.nextLine(); // Espera cualquier input del usuario antes de continuar para evitar mostrar el menú de una vez
    }

    public static void salir() {
        System.out.print("\033[H\033[2J"); 
        System.out.flush();  
        System.out.println("\nGracias por venir");
        System.out.println("Saliendo...");
    }
}