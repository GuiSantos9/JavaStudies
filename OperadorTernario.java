public class OperadorTernario {
    public static void main(String[]args){

        //doar se salario foi maior que 5000
        double salario = 6000;
        String mensagemDoar = "Vou doar 500 reais";
        String mensagemNaoDoar = "Nao tenho dinheiro";

        //sintaxe ternario -> (condicao) ? verdadeiro : falso;
        String resultado = (salario > 5000) ? mensagemDoar : mensagemNaoDoar;

        //jeito antigo
        /*if(salario > 5000) {
            resultado = mensagemDoar;
        } else {
            resultado = mensagemNaoDoar;
        }*/
        
        System.out.println("\n"+resultado);
    }
}
