package Chapter4;

    class Automoveis {
        int passengers;
        int fuelcap;
        int mpg;

        //retorna a autonomia
        int range (){
            return mpg * fuelcap;
        }
        //calcula o combustivel necessario para uma determinada distancia
        double fuelneeded(int miles){
            return (double) miles / mpg;
        }
    }

    class CompFuel {
        public class MetodoParametrizado {
            public static void main (String[] args){
                Automoveis minivan = new Automoveis();
                Automoveis motocicleta = new Automoveis();
                double gallons;
                int dist = 252;
            }
        }

    }



