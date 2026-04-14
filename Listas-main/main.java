import java.util.LinkedList;
import java.util.Scanner;


public class main {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        boolean seguir=true;
        LinkedList<obj> lista= new LinkedList<>();
        metodos m = new metodos();

        while(seguir){
            System.out.println("bienvenido al garrotide");
            System.out.println("que desea realizar");
            System.out.println("1.ingresar estudiante");
            System.out.println("2. consultar estidiante");
            System.out.println("3.modificar estudiante");
            System.out.println("4.eliminar estudiante");
            System.out.println("5.mostrar estudiante");
            System.out.println("7.");
            System.out.println("8.");
            int opt=sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("pagina en mantenimiento");
                    break;
                case 2:
                    System.out.println("pagina en mantenimiento");
                    break;
                case 3:
                    System.out.println("pagina en mantenimiento");
                    break;
                case 4:
                    System.out.println("pagina en mantenimiento");
                    break;
                case 5:

                    break;
                case 6:
                    Exportar e = new Exportar();

                    break;
                case 7:

                    break;
                case 8:
                    System.out.println("hasta luego");
                    seguir=false;
                    break;
                
            
                default:
                    break;
            }

        
        }
    }
}
