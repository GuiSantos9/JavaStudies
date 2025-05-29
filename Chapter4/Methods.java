package Chapter4;

//quanto falamos da sintaxe de um metodo em Java
//utilizamos a seguinte sintaxe

//tipo-ret nome(lista-parametros){   tipo-ret se da pelo tipo que será retornado pelo metodo
//   corpo do metodo
// }

// se o metodo nao retornar um valor usamos o var

class Veiculos {
    int passengers; //numero de passageiros
    int fuelcap; // capacidadede armazenamento de combustível
    int mpg; //consumo de combustivel em milhas por galao

    void range(){
        System.out.println("Range is "+ fuelcap * mpg);
    }
}


public class Methods {
    public static void main (String[] args){
        Veiculos minivan = new Veiculos();
        Veiculos carroEsportivo = new Veiculos();

        //valores para o campo de minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //valores para o campo de carroEsportivo
        carroEsportivo.passengers = 3;
        carroEsportivo.fuelcap = 17;
        carroEsportivo.mpg = 27;

        System.out.println("Minivan pode carregar "+minivan.passengers+" .");
        minivan.range(); //exibe a autonomia da minivan

        System.out.println("O carro espotivo pode carregar "+carroEsportivo.passengers+" .");
        carroEsportivo.range(); //exibe a autonomia do carro esportivo

    }
}
