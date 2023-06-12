public class Ejercicio2Tarea {
    public static void main(String[]args){
        int hora;

        System.out.print("ingrese una hora: ");
        hora= Integer.parseInt(System.console().readLine());

        if(hora>=6 && hora <=12){
            System.out.println("buenos dias");
        }else if (hora >= 13 && hora<= 20){
            System.out.println("buenas tardes");

        }else{
            System.out.println("buenas noches");
        }

    }
        

    
}
