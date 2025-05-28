package Chapter4;

class Vehicle {
    int passengers; //numero de passageiros
    int fuelcap; // capacidadede armazenamento de combustível
    int mpg; //consumo de combustivel em milhas por galao
}

public class Classes {
    public static void main (String[] args ){

        Vehicle minivan = new Vehicle(); //cria um objeto Vehicle chamado minivan

        int range;

        //para acessar as instancias de uma classe utilizamos o operador ponto
        //"objeto.membro"

        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;

        //calcula a autonomia presumindo um tanque cheio de gasolina
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan pode carregar "+minivan.passengers+" pessoas com uma range de "+range);
    }
}
