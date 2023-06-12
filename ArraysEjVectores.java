import java.util.Scanner;
public class ArraysEjVectores {
    public static void main(String[]args){
       Scanner s = new Scanner(System.in);
       // int vector[] = new int[10];
       int[]vector[];
       //int[] vector2 = {2,5,6,9};hasta 4
       int[] vector2={2,5,6,9,7,10,21,21,35,20,14,97,10};
       int numeroIngresado;

       /*for(int i = 0; i < 10; i ++){
        vector[i] = 0;
    }/* */  

       /* for(int i = 0; i < 10; i ++){
            System.out.println("ingrese numero" + i + ": " );
            vector[i] = s.nextInt();
        } */  

        /*for(int i = 0; i < 10; i ++){
            System.out.println("ingrese numero entre 20 y 50 " + i + ": " );
            numeroIngresado = s.nextInt();
            while(numeroIngresado < 20 || numeroIngresado > 50){
                System.out.println("numero fuera del rango,ingrese nuevamente ");
                numeroIngresado= s.nextInt();
            }
            vector[i]= numeroIngresado;

        }*/



          /*System.out.println("valores del vector:");
            for(int i = 0; i < 10; i ++){
                System.out.println(vector[i]);  */ 

              /*  System.out.println("valores del vector:");
                for(int i = 0; i < 10; i ++){
                        System.out.println("indice " + i + " : " + vector[i]);   

                } */           

                /*System.out.println("valores del vector 2:");
                for(int i = 0; i < 4; i ++){
                        System.out.println("indice " + i + " : " + vector2[i]); 
                 }*/   
                 
        System.out.println("longitud del vector: " + vector2.length);
          
          
        System.out.println("valores del vector 2:");
        for (int i = 0; i < vector2.length; i ++){
            System.out.println("indice " + i + " : " + vector2[i]);
        }
   
                  
    }               
        

    
}





