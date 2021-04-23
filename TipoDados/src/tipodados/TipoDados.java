package tipodados;

public class TipoDados {

    public static void main(String[] args) {
        /*
        boolean casado;      
        casado = true;            
                  
        if (casado)
            System.out.println("Casado");
        else
            System.out.println(" Não casado");
        
        int idade;  // int é padrao;
        long idadeNova;
        
        double salario;  // double é padrão;
        float salarioAlterado;
        
        char sexo;  // um caracter por vez
        byte numero;  // -128 ate 127;

        numero =  127;
       
        sexo = 'M';  // utiliza apostrofo
        idade = 56;
        idadeNova = 56l; // Utiliza o l para entender que é long.
        salario = 2000.00;
        salarioAlterado =  (float) 2000.00;
                // Double é o padrao para o JAVa

        System.out.println(idade);
        //sout tab
        idade = 64;
        System.out.println("idade..." + idade + sexo);
        System.out.println(" Numero " + numero);

        // ALT SHIFT F  IDENTA O PROGRAMA

         
        
        short s = 32_767;
        int i = 2_000_000_000; // 2 bilhoes
        long l = 9_000_000_000_000_000_000L;
        
       // i = s; // conversao promotion
       // System.out.println(" valor do i : " + i);
        
       // l = i;  // conversao automatica promotion
       // System.out.println(" Valor do l : " + l);
        
       s = (short) i;// casting força uma conversao
       System.out.println(" s : " + s);
       
       i = 30001;       
       s = (short) i ;
       System.out.println(" s : " + s);
       
       */
        
        String nome;
        String nomeNovo = "Marisa Carla Voigt Gava";
        
        nome = "Marisa Carla voigt Gava";
        System.out.println(" Nome: " + nome);
        
        if (nome.equals(nomeNovo))
            System.out.println(" Iguais");
        else
            System.out.println(" Diferente");
        
        if (nome.equalsIgnoreCase(nomeNovo))
            System.out.println(" Iguais");
        else
            System.out.println(" Diferente");
       }

}
