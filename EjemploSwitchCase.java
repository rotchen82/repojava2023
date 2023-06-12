import java.util.Scanner;

public class EjemploSwitchCase {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int numeroMes;

        System.out.println ( "ingrese numero de mes");
        numeroMes = s.nextInt();

       /*  if(numeroMes == 1 ){
           System.out.println("el mes es enero");
        } else if(numeroMes == 2){
            System.out.println("el mes es febrero");
        } else if(numeroMes == 3){
            System.out.println("el mes es marzo"); 
              }*/

        switch(numeroMes){
            case 1 :
            System.out.println(" El mes es Enero");
            break;
            case 2 :
            System.out.println(" El mes es Febrero");
            break;
            case 3 :
            System.out.println(" El mes es Marzo");
            break;
            case 4 :
            System.out.println(" El mes es  Abril");
            break;
            case 5 :
            System.out.println(" El mes es Mayo");
            break;
            case 6 :
            System.out.println(" El mes es Junio");
            break;
            case 7 :
            System.out.println(" El mes es Julio");
            break;
            case 8 :
            System.out.println(" El mes es Agosto");
            break;
            case 9 :
            System.out.println(" El mes es Septiembre");
            break;
            case 10 :
            System.out.println(" El mes es Octubre");
            break;
            case 11 :
            System.out.println(" El mes es Noviembre");
            break;
            case 12 :
            System.out.println(" El mes es Diciembre");
            break;
         default:
            System.out.println( " el numero es incorrecto");   
        }    
    }
}    
        
        
    
