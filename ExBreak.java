public class ExBreak {
    //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    //Condição: valor da parcela >= 1000 ou seja em um carro da 40k o valor da parcela será de 40x de 1000
    public static void main(String[] args) {

        int carro = 40000;

        for (int parcela = 1; parcela <= carro; parcela++) {
            int valorParcela = carro/parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("parcela "+parcela+" RS "+valorParcela);
           
        }

    }
}
