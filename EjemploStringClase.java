public class EjemploStringClase {
    public static void main(String[]args){
        String palabra1 = "hola";
        String palabra2 = "hola";
        String palabra3 = new String("hola");
        
        String clave = " clave";
        String claveIngresada;

        //System.out.println(palabra1 == palabra2);
        //System.out.println(palabra1 != palabra2);
       // System.out.println(palabra2==palabra3);
       // System.out.println(palabra2!=palabra3);

        System.out.println("Ingrese clave");
        claveIngresada = System.console().readLine();


     if (clave.equals(claveIngresada)){
        System.out.println("Bienvenido");
    }else{
        System.out.println("clave incorrecta");
        System.out.println("Ingresaste " + claveIngresada);

    }


      /*  if (claveIngresada == clave){
            System.out.println("Bienvenido");
        }else {
            System.out.println("Clave incorecta");
            System.out.println("ingresaste " + claveIngresada);
            }*/
            
            System.out.println(System.identityhashCode.);
    }

    }
}
