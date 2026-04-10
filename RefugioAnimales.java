import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Arrays;

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
    public static Map<String, String> especieAnimal;
    public static Map<String, String> estadoAnimal;
    
    public static void main(String[] args) {

        int opcion;


        do {
            mostrarMenu();
            opcion = scanner.nextInt();

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

        especieAnimal.put("Rocky", "Perro");
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
        System.out.flush(); 

        System.out.println("Opción en desarrollo");
    }

    public static void registrarEspecie(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 

        System.out.println("Opción en desarrollo");
    }

    public static void marcarAnimal(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 

        System.out.println("Opción en desarrollo");
    }

    public static void animalesDisponibles(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 

        System.out.println("Opción en desarrollo");
    }

    public static void animalesAdoptados(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 

        System.out.println("Opción en desarrollo");
    }

    public static void mostrarReporte(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 

        System.out.println("Opción en desarrollo");
    }

    public static void salir() {
        System.out.print("\033[H\033[2J"); 
        System.out.flush();  
        System.out.println("\nGracias por venir");
        System.out.println("Saliendo...");
    }
}