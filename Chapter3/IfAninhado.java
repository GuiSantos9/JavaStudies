package Chapter3;

public class IfAninhado {
    public static void main (String[]args)
        throws java.io.IOException {

            char resposta;
            char respostaCorreta = 'K';

            System.out.println("Tente adivinhar a letra correta: ");

            resposta = (char) System.in.read();

            if(resposta == respostaCorreta) {
                System.out.println("Acertou miseravi");
            } else {
                System.out.println("Errou");
            }

            if(resposta < respostaCorreta) System.out.print("Frio");
            else System.out.print("Quente");
    }
}
