import java.util.Scanner;

public class Tarea3
{
    public static void main (String args[])
    {
        Scanner add = new Scanner(System.in);
        
        String nombre = "Ingresa un Nombre";
        System.out.println(nombre);
        String palabra2 = add.next();
    
        String apellido = "Ingresa un Apellido";
        System.out.println(apellido);
        String palabra1 = add.next();
        
        String minombre = "Hola mi nombre es: ";
        System.out.print(minombre);
        System.out.println(palabra2);
        
        String miapellido = "Mi apellido es: ";
        System.out.print(miapellido);
        System.out.println(palabra1);
    }
}
