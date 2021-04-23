package projetocachorro;

public class Cachorro {

    int tamanho;
    String nome;
    String raca;
    char sexo;
    short idade;
    String corDoPelo;

    void mostraDados() {
        System.out.println("       Nome :" + nome);
        System.out.println("Cor do Pelo : " + corDoPelo);
        System.out.println("      Idade : " + idade);
        System.out.println("      Sexo  :" + sexo + "\n\n");
    }

}
