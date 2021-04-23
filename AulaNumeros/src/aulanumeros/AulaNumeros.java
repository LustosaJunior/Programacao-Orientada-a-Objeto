
 
package aulanumeros;

import java.util.Scanner;

public class AulaNumeros {

   
    public static void main(String[] args) {
     
        //Define o leitor do teclado
        Scanner leitor = new Scanner(System.in);
 
        //Define a variáveis locais
        int x, y;
        byte r;
        try{
        System.out.println(" DIGITE UM NUEMRO DE 0 ATE 128 ");
        r = leitor.nextByte();
        System.out.println(r);
        }
        catch (Exception yy ){
              System.out.println(" Ate 128");
              leitor.next();
        }
      
                
 
        //Le
        
        System.out.print("Infome o 1º valor: ");
        x = leitor.nextInt();
 
        System.out.print("Infome o 2º valor: ");
        y = leitor.nextInt();
 
        //Cria a instancia da classe matematica utilizando o construtor
        Matematica mat = new Matematica(x, y);
 
        // Imprime o resultado das operações através
        // de chamadas aos métodos da classe Matemática
        System.out.print("\n\t--------------------"); //Apenas para organiar a saída
        System.out.print("\n\tO valor da soma é: " + mat.soma());
        System.out.print("\n\tO valor da subtração é: " + mat.subtrai());
        System.out.print("\n\tO valor da multiplicação é: " + mat.multiplica());
        System.out.print("\n\tn O valor da divisão é: " + mat.divide());
        System.out.print("\n\t--------------------\n\n"); //Apenas para organiar a saída
     
       // sout 
 
    }
        
        
        
    }
    

