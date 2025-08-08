public class Main {
    public static void main(String[] args) {

        //Tipo -> nome -> metodo que transforma em um object -> constructor
        Veiculo fusca = new Veiculo();

        fusca.anoFabricacao = 1980;
        fusca.modelo = "Fusca 1200";
        fusca.cor = "Azul";
        fusca.placa = "A9oKL23";

        System.out.printf("Modelo: %s \n", fusca.modelo);
        System.out.printf("Ano de Fabricação: %d \n", fusca.anoFabricacao);
        System.out.printf("Cor: %s \n", fusca.cor);
        System.out.printf("Placa: %s \n", fusca.placa);

    }
}
