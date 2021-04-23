package projetonotas;

public class Nota {
    
    float nota1,nota2,nota3,media;   
    String nome, senha ;

    
    public Nota() {
    nota1 = 0;
    nota2 = 0;
    nota3 = 0;
    media = 0; 
    senha = "VerNotaAluno";
    nome  = "Não informado";
 }
    
   float calculaMedia(float n1, float n2, float n3) {
        float xmedia;
        if (n1 < n2 && n1 < n3) {
            xmedia = (n2 + n3) / 2;
        } else if (n2 < n3) {
            xmedia = (n1 + n3) / 2;
        } else {
            xmedia = (n1 + n2) / 2;
        }
        return xmedia;
    }
   
   // POLIFORMISMO -  SOBRECARGA
   
   float calculaMedia(Nota nt) {
      //  float n1 = nt.nota1, n2 = nt.nota2, n3= nt.nota3;
        float xmedia;
 
        //Verifica as duas maiores nota e tira a média:
        if (nt.nota1 < nt.nota2 && nt.nota1 < nt.nota3) {
            xmedia = (nt.nota2 + nt.nota3) / 2;
        } else if (nt.nota2 < nt.nota3) {
            xmedia = (nt.nota1 + nt.nota3) / 2;
        } else {
            xmedia = (nt.nota1 + nt.nota2) / 2;
        }
        return xmedia;
    }
   
   
   
    
    
}


