import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RefugioAnimales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String[] nombreAnimales = {
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
        };

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

        int opcion;

        System.out.println("Selecione una opcion: ");
        System.out.println("1. Ver especies registradas");
        System.out.println("2. Ingresar nueva especie");
        System.out.println();

        opcion = scanner.nextInt();
        scanner.nextLine(); //Limpiar buffer de scanner
        switch (opcion){

            case 1 -> System.out.println(especie);

            case 2 -> {
                System.out.println("Ingrese especie nueva: ");
                String nombreespecienueva = scanner.nextLine();
                especie.add(nombreespecienueva);
            }
        }

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