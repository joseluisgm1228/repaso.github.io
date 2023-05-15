
/**
 * Write a description of class Sueldos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Sueldos
{
     public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       
       SueldoOBJ[] LosSueldos = new SueldoOBJ[50];     
       
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
        
        SueldoOBJ unSueldo = new SueldoOBJ();
        
        unSueldo.identificacion = identificacion;
        unSueldo.cargo = cargo;
        unSueldo.sueldo = sueldo;       
        LosSueldos[i] = unSueldo;
      }
      
      for(int i = 0; i < numeroEmpleados; i++)
      {
            promedio = promedio + LosSueldos[i].sueldo ;
      }
        promedio = promedio/numeroEmpleados;
        
      System.out.println("El promedio de Sueldo es: " + promedio);
       
   }
}
