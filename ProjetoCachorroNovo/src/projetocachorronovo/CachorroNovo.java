
package projetocachorronovo;


public class CachorroNovo {
    byte tamanho;
    String nome; 
 
    void verTamanho(){
        System.out.println("O nome é: " + nome + "\n o tamanho é: " + tamanho );
        
        if ( tamanho > 20 )
            System.out.println(" \n PORTE GRANDE");
        else
            System.out.println(" \n PORTE PEQUENO");  
    }
        
    void latir(){
        System.out.println(nome + " AU AU \n");    
    } 
    
    void dormir(){
        System.out.println(nome + " ZZZZZZZ ZZZZ Que sono !");
    }
    
    void comer(){
        System.out.println(nome + " Que delicia de OSSO HUMMMM !");
    }
    
    
    
}
