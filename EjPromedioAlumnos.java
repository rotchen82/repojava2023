public class EjPromedioAlumnos {
    public static void main(String[]args){
    int vector[] = new int[3];
    int acumulador = 0;
      for(int i = 0; i < 3; i ++){
        System.out.println("ingrese nota" + ( i +1)+ " : ");
        vector[i]= Integer.parseInt(System.console().readLine());
      }

      for(int i = 0; i<3; i ++){
        acumulador= vector[i] + acumulador;//valor qu esta en el vector va cambiando
      }

      System.out.println("El promedio es: "+ (acumulador/ 3));
    }
   

    
}
