package Chapter3;

public class Break6 {
    public static void main (String[] args ){
        int x = 0;
        int y = 0;

        stop1: for(x = 0; x < 5; x++){
                for(y = 0; y < 5; y++){
                    if(y == 2) break stop1;
                    System.out.println("x e y: "+x+" "+y);
                }
        }

        stop2: for(x = 0; x < 5; x++){
            for(y = 0; y < 5; y++){
                if(y == 2) break stop2;
                System.out.println("x e y: "+x+" "+y);
            }
        }

    }
}
