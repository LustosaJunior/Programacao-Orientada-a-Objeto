package projetonotas;

import java.util.Scanner;

public class ProjetoNotas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Nota notaAluno = new Nota();

        String senhaDigitada;

        //float nota1, nota2, nota3, media;
        //Leitura das notas
        System.out.println("Informe as notas: ");

        //Nota 1:
        System.out.print("\n\tNota 1: ");
        notaAluno.nota1 = teclado.nextFloat();

        //Nota 2:
        System.out.print("\tNota 2: ");
        notaAluno.nota2 = teclado.nextFloat();

        //Nota 3
        System.out.print("\tNota 3: ");
        notaAluno.nota3 = teclado.nextFloat();

        System.out.println("\t Senha:");
        senhaDigitada = teclado.next();

        //  CONSIDERA MAIUSCULO E MINUSCULO
        // if (senhaDigitada.equals(notaAluno.senha)) {
        // NAO CONSIDERA
        if (senhaDigitada.equalsIgnoreCase(notaAluno.senha)) {
            //ALT SHIFT F
            notaAluno.media = notaAluno.calculaMedia(notaAluno.nota1, notaAluno.nota2, notaAluno.nota3);
            System.out.println("\tMedia :  " + notaAluno.media);

            notaAluno.media = notaAluno.calculaMedia(notaAluno);
            System.out.println("\tMedia :  " + notaAluno.media);
        } else {
            System.out.println(" ... Senha Inválida ...");
        }

    }

}
