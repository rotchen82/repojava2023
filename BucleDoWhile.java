public class BucleDoWhile {
    public static void main (String[]args){
        boolean flag= true;//false= en este caso no se repite el bucle
        int numeroIngresado;
        int acumulador = 0;





        do{
            System.out.println("Ingrese numero");
            numeroIngresado= Integer.parseInt(System.console().readLine());
            if(Integer.parseInt(System.console().readLine()) == -1){
                System.out.println("flag ha cambiado");
                flag = false;
            }else{
                    acumulador= acumulador + numeroIngresado;
                



            acumulador = acumulador + numeroIngresado;
            System.out.println(" Desea continuar ingresando numeros?");
            System.out.println("-1 para salir");
            
            }

        }while(flag);
        System.out.println(acumulador);

    }
}
