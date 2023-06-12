public class EjemploSwitchCase2 {
    
    public static void main(String[]args){
        String nombre;
        String seleccion;

        System.out.println("ingrese un nombre");
        seleccion = System.console().readLine();
B

        switch(seleccion){
            case "Ricardo": 
            System.out.println("tu apellido es fort?");
          break;
            case "Susana":
            System.out.println("tu apellido es Gimenez?");
          break;
            case "Marcelo":
            System.out.println("tu apellido es tinelli?");
          break;

        }
    }
}
