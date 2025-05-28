package Chapter4;

class Vehicles {
    int passengers; //numero de passageiros
    int fuelcap; // capacidadede armazenamento de combustível
    int mpg; //consumo de combustivel em milhas por galao
}

public class TwoVehicles {
    public static void main (String[] args ){

        Vehicles minivan = new Vehicles(); //cria um objeto Vehicle chamado minivan
        Vehicles carroEsportivo = new Vehicles();

        
        int range1;
        int range2;

        //para acessar as instancias de uma classe utilizamos o operador ponto
        //"objeto.membro"

        //valores para o campo de minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //valores para o campo de carroEsportivo
        carroEsportivo.passengers = 3;
        carroEsportivo.fuelcap = 17;
        carroEsportivo.mpg = 27;

        //calcula a autonomia presumindo um tanque cheio de gasolina
        range1 = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan pode carregar "+minivan.passengers+" pessoas com uma range de "+range1);

        range2 = carroEsportivo.fuelcap * carroEsportivo.mpg;
        System.out.println("Um carro esportivo pode carregar "+carroEsportivo.passengers+" pessoas com uma range de "+range2);
    }

}



