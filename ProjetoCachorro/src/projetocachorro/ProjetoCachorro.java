package projetocachorro;

public class ProjetoCachorro {

    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();
        

        cachorro1.nome = "LULU";
        cachorro1.corDoPelo = "Marrom";
        cachorro1.idade = 5;
        cachorro1.raca = "Vira latas";
        cachorro1.sexo = 'M';
        
        cachorro2.nome = "KITO";
        cachorro2.corDoPelo = "PRETO";
        cachorro2.idade = 8;
        cachorro2.raca = "Vira latas";
        cachorro2.sexo = 'M';

        cachorro1.mostraDados();
        cachorro2.mostraDados();
        
        /*
        System.out.println("       Nome :" + cachorro1.nome);
        System.out.println("Cor do Pelo : " + cachorro1.corDoPelo);
        System.out.println("      Idade : " + cachorro1.idade);
        System.out.println("      Sexo  :" + cachorro1.sexo);
        
        System.out.println(" \n    Nome :" + cachorro2.nome);
        System.out.println("Cor do Pelo : " + cachorro2.corDoPelo);
        System.out.println("      Idade : " + cachorro2.idade);
        System.out.println("      Sexo  :" + cachorro2.sexo);
*/
    }

}
