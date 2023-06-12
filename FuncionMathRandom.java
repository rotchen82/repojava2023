public class FuncionMathRandom {
    public static void main(String[]args){
        //double rand= Math.random();
        int[]vectorRandom = new int[50];

       /*  for(int i=0; i<10; i++){
        System.out.println((int)(Math.random()*10)+1);
     }*/

     for(int i=0; i<vectorRandom.length; i++){
        //System.out.println((int)(Math.random()*10)+1);
        vectorRandom[i]= (int)(Math.random()*10)+1;
     }

        for(int i=0; i<vectorRandom.length; i++){
            System.out.print(vectorRandom[i]+ " ");  
     }


    
}
}
