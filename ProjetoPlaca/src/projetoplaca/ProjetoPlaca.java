package projetoplaca;

import java.util.Scanner;

public class ProjetoPlaca {

    public static void main(String[] args) {

        int placa;
        Scanner tec = new Scanner(System.in);

        System.out.print("Informe o número final da Placa [0 ate 9] : ");
        placa = tec.nextInt();

        /*
        if (placa == 1 || placa == 2) {
        System.out.println(" Proibido Segunda-Feira");
        } else if (placa == 3 || placa == 4) {
        System.out.println("Proibido Terça-Feira");
        } else if (placa == 5 || placa == 6) {
        System.out.println("Proibido Quarta-Feira");
        } else if (placa == 7 || placa == 8) {
        System.out.println("Proibido Quinta-Feira");
        } else {
        System.out.println("Proibido Sexta-Feira");
        }
         
        
   
1 	abril 
2 	até maio 
3 	até junho 
4 	até julho 
5 e 6 	até agosto 
7 	até setembro 
8 	até outubro 
9 	até novembro 
0 	até dezembro 

         */
        System.out.println(" Proibido 7h até 10h \n          17h até 20h");

        switch (placa) {
            case 1:
                System.out.println(" Licenciamento até abril");
                System.out.println(" Proibido Segunda-Feira");
                break;
            case 2:
                System.out.println(" Licenciamento até maio");
                System.out.println(" Proibido Segunda-Feira");
                break;
            case 3:
                System.out.println(" Licenciamento até Junho");
                System.out.println(" Proibido Terça-Feira");
                break;
            case 4:
                System.out.println(" Licenciamento até Julho");
                System.out.println("Proibido Terça-Feira");
                break;
            case 5:
            case 6:
                System.out.println(" Licenciamento até Agosto");
                System.out.println("Proibido Quarta-Feira");
                break;
            case 7:
                System.out.println(" Licenciamento até Setembro");
                System.out.println("Proibido Quinta-Feira");
                break;
            case 8:
                System.out.println(" Licenciamento até OUTUBRO");
                System.out.println("Proibido Quinta-Feira");
                break;
            case 9:
                System.out.println(" Licenciamento até NOVEMBRO");
                System.out.println("Proibido Sexta-Feira");
                break;
            case 0:
                System.out.println(" Licenciamento até Dezembro");
                System.out.println("Proibido Sexta-Feira");
                break;
            default:
                System.out.println(" Número inválido: ");
                break;

        }
    }
}
