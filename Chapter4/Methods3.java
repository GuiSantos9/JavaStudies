package Chapter4;

    class ChickNum {
        //retorna true se x for par
        boolean IsEvent (int x){
            if((x%2) == 0) return true;
            else return false;
        }
    }
public class Methods3 {
    public static void main (String[]args){

        ChickNum e = new ChickNum();

        //passa argumentos para IsEvent
        if (e.IsEvent(10))System.out.println("10 is event");
        if (e.IsEvent(2))System.out.println("2 is event");
        if (e.IsEvent(8))System.out.println("8 is event");




    }
            }