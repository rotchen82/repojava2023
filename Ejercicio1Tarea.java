
public class Ejercicio1Tarea {
    public static void main(String[]args){
        String diaIngresado;

    System.out.println("ingrese dia de la semana: ");
    diaIngresado = System.console().readLine();


    if((diaIngresado == "lunes") || (diaIngresado == "miercoles") || (diaIngresado == "viernes")){
      System.out.println("este dia es de programacion");

    }else if ((diaIngresado == "martes") || (diaIngresado == "jueves")){ 
        System.out.println("este dia  No es de programacion");

    }

} 
}   
      
       

