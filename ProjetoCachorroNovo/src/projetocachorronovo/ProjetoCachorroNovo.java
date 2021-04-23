
package projetocachorronovo;

import java.util.Scanner;


public class ProjetoCachorroNovo {

    
    public static void main(String[] args) {
       
       CachorroNovo lulu  = new CachorroNovo();  //instaciar uma classe
        // Lulu é o objeto.
        
        //lulu.nome = "Lulu";
        //lulu.tamanho = 35;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println(" Digite o Nome do Cachorro: ");
        lulu.nome = in.nextLine();
        
        System.out.println(" Digite o tamanho : ");
        lulu.tamanho = in.nextByte();
        
            
        lulu.comer(); 
        lulu.dormir();
        lulu.latir();
        lulu.verTamanho();
        
        
        
    }
    
}
