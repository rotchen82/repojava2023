import java.util.Scanner;
public class Ejercicio3Tarea {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        int numero;

        System.out.println ( "ingrese numero de dia");
        numero = s.nextInt();

       

        switch(numero){
            case 1 :
            System.out.println(" El dia es Lunes");
            break;
            case 2 :
            System.out.println(" El dia es martes");
            break;
            case 3 :
            System.out.println(" El dia es miercoles");
            break;
            case 4 :
            System.out.println(" El dia es jueves");
            break;
            case 5 :
            System.out.println(" El dia es viernes");
            break;
            case 6 :
            System.out.println(" El dia es sabado");
            break;
            case 7 :
            System.out.println(" El dia es domingo");
            break;
        }  

    }  
}          
