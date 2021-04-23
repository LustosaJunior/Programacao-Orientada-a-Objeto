package projetoconta;

public class ProjetoConta {

    public static void main(String[] args) {

        Conta objConta1 = new Conta(); // Corrente
        Conta objConta2 = new Conta(); // Poupança

        objConta1.tipo = true; // Corrente
        objConta2.tipo = false;

        objConta1.cliente = "Marisa";
        objConta2.cliente = "Marisa";

        objConta1.exibeSaldo();

        objConta1.depositar(500);
        objConta1.depositar(1500);
        objConta1.sacar(200);
        
        
        objConta2.depositar(objConta1.saldo);
        
        objConta1.sacar(objConta1.saldo);
        
      
        // DEPOSITAR NA CONTA POUPANÇA O SALDO FINAL DA CONTA CORRENTE
        

    }

}
