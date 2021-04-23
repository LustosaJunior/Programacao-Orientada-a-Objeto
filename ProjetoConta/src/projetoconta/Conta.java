
package projetoconta;

public class Conta {
    boolean tipo;   // true conta corrente // false conta poupança;
    String cliente;
    double saldo;
    
    public Conta(){  // CONSTRUTOR
        tipo    = false;
        cliente = "NAO IDENTIFICADO";
        saldo   = 0;
    }
        
    void exibeSaldo(){
        System.out.println("=======================");
        System.out.println("   Nome: " + cliente);
        System.out.println(" Saldo : " + saldo);
        
        if (tipo)
            System.out.println(" \n CONTA CORRENTE");
        else
            System.out.println(" \n CONTA POUPANÇA");
        
        System.out.println("========================");
    }
    
    void depositar(double valor){
       // saldo = saldo + valor;
        saldo += valor;
        exibeSaldo();        
    }
    
    void sacar(double valor){
        if( valor <= saldo ) {
            saldo -=valor;
            exibeSaldo(); 
        }
        else
            System.out.println("\n Saldo Insuficiente...");
    }
    
    

    
    
    
}
