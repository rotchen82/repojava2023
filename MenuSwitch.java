//import java.util.Scanner;

public class MenuSwitch{

    public static void main(String[] args){
   // Scanner s = new Scanner(System.in);//NO HACE FALTA PONERLO


       int seleccion;
       int num1;
       int num2;

       System.out.println("***Menu de opciones***");
       System.out.println("1: suma");
       System.out.println("2: Resta");
       System.out.println("3: Multiplicacion");
       System.out.println("4: Division");
       seleccion = Integer.parseInt(System.console().readLine());


       System.out.print(" ingrese numero: ");
       num1= Integer.parseInt(System.console().readLine());
       System.out.print("ingrese otro numero: ");
       num2= Integer.parseInt(System.console().readLine());


       switch(seleccion){
        case 1:
        System.out.println(num1+num2);
          break;
        case 2:
        System.out.println(num1-num2);
        break;
        case 3:
        System.out.println(num1*num2);
          break;
        case 4:
        System.out.println((double)num1/(double)num2);
          break;
        default: 
        System.out.println("opcion incorrecta"); 
        

    }
}

}