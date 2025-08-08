public class Main {
    public static void main(String[] args) {

        Livro romanos = new Livro();
        Musica tuestudo = new Musica();



        romanos.titulo = "Romanos";
        romanos.autor = "Paulo de Tarso";
        romanos.anoPublicacao = 57;

        System.out.printf("Título: %s\n",romanos.titulo);
        System.out.printf("Título: %s\n",romanos.autor);
        System.out.printf("Título: %d\n",romanos.anoPublicacao);

    }
}
