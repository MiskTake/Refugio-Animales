import java.util.Scanner;

public class RefugioAnimales {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int opcion;


        do {
            mostrarMenu();
            opcion = scanner.nextInt();

            switch (opcion) {

                //Registrar animal
                case 1 -> {
                    System.out.println("Opción en desarrollo");
                }
                    

                //Registrar especie
                case 2 -> {
                    System.out.println("Opción en desarrollo");
                }
                    

                //Marcar animal como adoptado
                case 3 -> {
                    System.out.println("Opción en desarrollo");
                }
                    

                //Mostrar animales disponibles  
                case 4 -> {
                    System.out.println("Opción en desarrollo");
                }
                    

                //Mostrar animales adoptados
                case 5 -> {
                    System.out.println("Opción en desarrollo");
                }
                    

                //Mostrar reporte general
                case 6 -> {
                    System.out.println("Opción en desarrollo");
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
    }

    public static void registrarEspecie(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 
    }

    public static void marcarAnimal(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 
    }

    public static void animalesDisponibles(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 
    }

    public static void animalesAdoptados(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 
    }

    public static void mostrarrReporte(){
        System.out.print("\033[H\033[2J"); 
        System.out.flush(); 
    }

    public static void salir() {
        System.out.print("\033[H\033[2J"); 
        System.out.flush();  
        System.out.println("\nGracias por venir");
        System.out.println("Saliendo...");
    }
}