package PontoFlutuante;

public class Hypot {
    public static void main (String[]args){
        double x,y,z;
        int i;
        byte b;

        i = 100;
        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y); //retorna um valor double que é a raiz de seu argunmento double
        b = (byte) i;
        System.out.println("Hypotenuse is " +z);
    }
}
