import java.util.Scanner;

public class EntradaeSaidaDados {

    //função que retorna a soma dos numeros
    public static int somarNumeros(int x, int y){
        return x + y;
    }

    public static double mediaNumeros(double x){
        return (x)/3;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        //variaveis declaradas
        int numerosSoma1;
        int numerosSoma2;
        int resultado;
        double media = 0;
        double numerosMedia;

        System.out.print("Informe seu nome: ");
        String nome = leitor.nextLine();

        System.out.print("Informe um numero qualquer: ");
        int numero = leitor.nextInt();


            System.out.print("Informe o primeiro numero para soma-lo: ");
            numerosSoma1 = leitor.nextInt();

            leitor.nextLine();

            System.out.print("Informe o segundo numero para soma-lo: ");
            numerosSoma2 = leitor.nextInt();

            resultado = somarNumeros(numerosSoma1,numerosSoma2);

            for(int i = 0; i < 3; i++){
                System.out.print("Informe um numero para fazer a media: ");
                numerosMedia = leitor.nextInt();

                media = media + numerosMedia;
            }

            double resultadoMedia = mediaNumeros(media);


            int base;
            int antecessor;
            int sucessor;

            //para eu ter um antecessor é a base - 1
            //para eu ter um sucessor é a base + 1



        System.out.printf("Bem vindo %s \n",nome);
        System.out.printf("Seu Numero é: %d \n",numero);
        System.out.printf("A soma de %d + %d é: %d\n",numerosSoma1,numerosSoma2,resultado);
        System.out.printf("A media dos 3 numeros é igual a %.2f",resultadoMedia);

        leitor.close();
    }
}
