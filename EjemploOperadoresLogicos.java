import java.util.Scanner;
public class EjemploOperadoresLogicos {
    public static void main(String[]args){
        Scanner s = new Scanner(System.in);
        int num1;
        int num2;
        //Operador logico &&
        System.out.println( "Ingrese un numero");
        num1 = s.nextInt();
        
        if (num1> 50 && num1 < 100){
            System.out.println("numero ingresado se encuentra entre 50 y 100");
        }else{
            System.out.println("numero ingresado no se encuentra entre 50 y 100");
        }

        //Operador logico ||
        System.out.println("Ingrese de nuevo numero");
        num1= s.nextInt();
        System.out.println("Ingrese otro numero");
        num2= s.nextInt();
        if((num1> 10 && num1 < 20) || (num2 > 10 && num2 < 20)){
            System.out.println( "uno de los numeros esta dentro del rango");
        }else {
            System.out.println("Ninguno de los numeros esta dentro del rango");

        }

    }

    }
    
