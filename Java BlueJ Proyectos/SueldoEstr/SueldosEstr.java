
/**
 * Write a description of class SueldosEstr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class SueldosEstr
{
      public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       String[] identificaciones = new String[50];
       String[] cargos = new String[50];
       double[] salarios = new double[50];
             
       
       int numeroEmpleados;
       String identificacion, cargo;
       double sueldo;
       double promedio = 0;
       
       System.out.println("Digite la cantidad de Empleados: ");
       
       numeroEmpleados = sc.nextInt();
       
       for(int i = 0; i < numeroEmpleados;i++)
       {
        
        System.out.println("Digite la identificacion del Empleado: ");
        identificacion = sc.next();
        
        System.out.println("Digite el Cargo del Empleado: ");
        cargo = sc.next();
      
        System.out.println("Digite la Sueldo del Empleado: ");
        sueldo = sc.nextDouble();        
        
        identificaciones[i] = identificacion;
        cargos[i] = cargo;
        salarios[i] = sueldo;       
    
      }
      
      for(int i = 0; i < numeroEmpleados; i++)
      {
            promedio = promedio + salarios[i];
      }
        promedio = promedio/numeroEmpleados;
    
      System.out.println("El promedio de Sueldo es: " + promedio);
       
   }


}
