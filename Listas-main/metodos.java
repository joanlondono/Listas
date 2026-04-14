import java.util.LinkedList;
import java.util.Scanner;
public class metodos {
    public LinkedList<obj> Llenarlista(LinkedList<obj> l, Scanner sc){
        boolean pedir=true;
        while(pedir){
            obj o= new obj();
            System.out.println("ingrese el nombre del estudiante");
            o.setNombre(sc.nextLine());
            System.out.println("ingrese el carnet");
            o.setCarnet(sc.next());
            System.out.println("ingrese la cedula");
            o.setCedula(sc.nextInt());
            l.add(o);
            System.out.println("desea seguir ingresando 1.si, 2. no");
            int opt= sc.nextInt();
            if(opt == 2){
                pedir = false;
            }

    }
    return l;
    }    

    public void MostrarLista(LinkedList<obj>l){
        for ( obj o : l) {
            System.out.println("Nombre"+o.getNombre());
            System.out.println("Carnet"+o.getCarnet());
            System.out.println("cedula"+o.getCedula());
            System.out.println("...........");
            System.out.println();
            
        }
    }
}
