package Chapter4;

class Veiculo {
    int passengers; //numero de passageiros
    int fuelcap; // capacidadede armazenamento de combustível
    int mpg; //consumo de combustivel em milhas por galao

    int range(){
       return mpg * fuelcap; //retorna a autonomia de determinado veiculo
    }
}

public class Methods2 {
    public static void main (String[]args){

        Veiculo moto = new Veiculo();
        Veiculo bmw = new Veiculo();

        int rangeMoto;
        int rangeBmw;

        //valores para o campo da moto
        moto.passengers = 2;
        moto.fuelcap = 16;
        moto.mpg = 22;

        //valores para o campo da BMW
        bmw.passengers = 2;
        bmw.fuelcap = 16;
        bmw.mpg = 22;

        //atribui valor retornando uma variavel
        rangeMoto = moto.range();
        rangeBmw = bmw.range();

        System.out.println("Uma moto pode carregar "+moto.passengers+" com uma distancia de "+rangeMoto+" milas");
        System.out.println("Uma moto pode carregar "+bmw.passengers+" com uma distancia de "+rangeBmw+" milas");

        if(rangeMoto > rangeBmw) {
            System.out.println("A distancia da moto é melhor");
        } else {
            System.out.println("A distancia da BMW é melhor");
        }
    }
}
