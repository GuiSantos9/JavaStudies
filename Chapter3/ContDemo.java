package Chapter3;

public class ContDemo {
    public static void main (String[] args ){
        int i;

        //exibe numeros pares de 0 a 100
        for (i = 0; i <= 100; i++){
            if((i%2) != 0) continue; //itera
            System.out.println(i);
        }
    }
}
