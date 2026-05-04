import java.util.LinkedList;
import java.util.Scanner;

public class validaciones {
    Scanner sc = new Scanner(System.in);
    public int ValidarEntero(Scanner sc) {
         {
           while(!sc.hasNextInt()) {
               System.out.println("Por favor, ingrese un número entero válido:");
               sc.next(); // Descartar la entrada no válida
           }
           return sc.nextInt();
    }
}
    public int Validarrango(int n1, int n2,int  opt){
        while(opt < n1 || opt > n2){
            System.out.println("Por favor, ingrese un número rango de " + n1 + " y " + n2 + ":");
            opt = ValidarEntero(sc);
        }
        return opt;
    }
    public boolean validarCedula(int cedula, LinkedList<obj>l) {
       for (obj o: l) {
           if (o.getCedula() == cedula) {
               return true; // La cédula ya existe en la lista
           }
       }
       return false; // La cédula no existe en la lista
    }
    public String ValidarDimensionNombre(String nombre){
        while(nombre.length() > 15){
            System.out.println("el nombre no puede tener mas de 15 caracteres, ingrese un nombre valido");
            nombre = sc.nextLine();
        }
        return nombre;
    }
}
