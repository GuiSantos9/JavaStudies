package Chapter3;

public class Help {
    public static void main (String[]args)
        throws java.io.IOException{
        char choise;

        System.out.println("AJuda:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("Escolha uma das duas: ");

        choise = (char) System.in.read(); //recebe um valor inteiro

        switch (choise) {
            case '1':
                System.out.println("if (condition) statement");
                System.out.println("else statement");
                break;

            case '2':
                System.out.println("switch(expression)statement");
                System.out.println("  case constant: ");
                System.out.println("    statement sequence");
                System.out.println("    break;");
                System.out.println("   // ...");
                System.out.println("}");
                break;
            default:
                System.out.println("Selection not found");
        }
    }
}
