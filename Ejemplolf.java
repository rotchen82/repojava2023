public class Ejemplolf {

    public static void main(String[]args){
        int num1 = 30;
        int num2 = 20;
       // boolean flag = false;//NO LA USA

        System.out.print("ingrese un numero");
        num1= Integer.parseInt(System.console().readLine());
        System.out.print("ingrese otro numero: ");
        num2= Integer.parseInt(System.console().readLine());
        

        if(num1>num2){
            System.out.println("num1 mayor a num2");
            flag = true;

        }else if(num1<num2){
            System.out.println("num1 no es mayor a num2");
        }else{
            System.out.println("num1 es igual a num2");
        }
    }
}
    
    
