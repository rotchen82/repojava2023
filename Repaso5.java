public class Repaso5 {
  public static void main(String[] args){  
    int op;
    System.out.println("Ingrese una opcion");
    System.out.println("1:opcion 1");
    System.out.println("2:opcion 2");
    System.out.println("3:opcion 3");
    System.out.println("4:opcion 4");

    op=Integer.parseInt(System.console().readLine());

    switch(op){
         case 1:
             System.out.println("El usuario ingreso la opcion 1");
             break;
         case 2:
             System.out.println("El usuario ingreso la opcion 2");
             break;
         case 3:
             System.out.println("El usuario ingreso la opcion 3");
             break;
         default:   
             System.out.println("El usuario no sabe leer");


    }
  }
}



    
  
 
