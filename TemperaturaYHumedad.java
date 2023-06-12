import java.util.Scanner;
public class TemperaturaYHumedad {
    public static void main (String[]args){
        Scanner s=new Scanner(System.in);
        double vector[]=new double[12];
        String mesIngresado= "";
        double temperatura;
        double humedad;
        double tempMayor;
        double humMenor;
        double acumuladortemp=0;
        double acumuladorHum=0;

        for(double i=0; i<11;i++){
            System.out.println("ingrese temperatura promedio");
            temperatura= s.nextInt();
            tempMayor=0;
            if(array[i]>array[i+1]){//cambiar el > a < para ordenar de menor a mayor
                temperatura= array[i];
                array[i]=array[i+1];
                array[i+1]=temp;
            
           /* */ }System.out.println("ingrese humedad promedio");
            humedad= s.nextInt();
            acumuladorHum=humedad+acumuladorHum;
            humMenor=100;
            if(humMenor>humedad){
                humMenor=humedad;
                System.out.println("la humedad menor es:"+ humMenor);


            }
            System.out.println("");
        for(double int i = 0; i< 12; i++){//Bucle para acceder a los elemntos del array
            for(int j= 0; j< n-i-1; j++){//Bucle para comparar con los elementos adyacentes
                if(array[j]>array[j+1]){//cambiar el > a < para ordenar de menor a mayor
                    tmp= array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }

            System.out.println("Array Ordenado");
            for(i=0;i<n; i++){
                System.out.print(array[i]+ " ");
            }
            System.out.println("");





        }
    }

    
}
}

