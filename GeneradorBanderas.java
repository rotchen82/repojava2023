import java.util.Scanner;
public class GeneradorBanderas {
    public static void main(String[]args){  
        Scanner s = new Scanner(System.in);
        String[]color= {"rojo","amarillo","verde","blanco","azul","negro"}
        int franjas;

        System.out.println("generador de banderas");
        //System.out.println("¿Cuantas franjas tiene la bandera?");
        franjas= s.nextInt();
        System.out.println("------------");
        /*for(int i= 0; i<franjas; i ++){
            System.out.println(color[(int)(Math.random()*6)]);
        }*/

        System.out.println(color[0]);   
        System.out.println("------------");
    }
}
