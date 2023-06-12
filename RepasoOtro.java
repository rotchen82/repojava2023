public class RepasoOtro {
    public static void main (String[] args){
        int variableComparacion;
        int variableUsuario;
        variableComparacion=10;

        System.out.println("Ingrese un numero");
        variableUsuario=Integer.parseInt(System.console().readLine());

        if(variableUsuario>variableComparacion){
            System.out.println("el numero ingresado es mayor a 10");
        }else if(variableUsuario<variableComparacion){
            System.out.println("el numero ingresado es menor a 10");

        }else{
            System.out.println("el numero ingresado es igual a 10");


        }


        System.out.println("fin de ejecucion");

    }    
}
