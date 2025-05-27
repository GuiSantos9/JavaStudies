package Chapter3;

public class KbIn {
    public static void main (String[]args)
        throws java.io.IOException { //Trata os erros de entrada (Excessoes)
            char ch;

            System.out.print("Digite uma tecla e dê enter: ");

            ch = (char) System.in.read(); //obtem um char e le um caracter no teclado
            System.out.println("Sua tecla digitada eh: " +ch);

        }
}
