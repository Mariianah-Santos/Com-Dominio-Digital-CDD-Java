package ExericiosBasico;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        // 6 –Faça um programa que faça 5 perguntas para
        // uma pessoa sobre um crime. As perguntas são:
        // “Telefonou para a vítima? “
        // “Esteve no local do crime?”
        // “Mora perto da vítima? “
        // “Devia para a vítima? “
        // “Já trabalhou com a vítima? “
        // O programa deve no final emitir uma
        // classificação sobre a participação da pessoa no
        // crime. Se a pessoa responder positivamente a 2
        // questões ela deve ser classificada como
        // “Suspeita”, entre 3 e 4 como “Cúmplice” e 5
        // como “Assassino“. Caso contrário, ele será
        // classificado como “Inocente“.

        Scanner teclado = new Scanner(System.in);
        System.out.println("----------------------------------------------");
        System.out.println("VOCÊ ESTÁ SENDO INVESTIGADO POR UM CRIME!!");
        System.out.println("IREI FAZER ALGUMAS PERGUNTAS PARA SABER SE É INOCENTE OU NAO!");
        System.out.println("RESPONDA COM SIM OU NÃO");
        System.out.println("----------------------------------------------");

        System.out.print("Telefonou para a vitima? ¬.¬ ");
        String telefonou = teclado.nextLine().toUpperCase();
        System.out.print("Esteve no local do crime? -.- ");
        String localCrime = teclado.nextLine().toUpperCase();
        System.out.print("Mora perto da vitima? +.+ ");
        String moraPerto = teclado.nextLine().toUpperCase();
        System.out.print("Devia para a vitima? :| ");
        String devia = teclado.nextLine().toUpperCase();
        System.out.print("Já trabalhou com a vitima? ¬¬ ");
        String trabalhou = teclado.nextLine().toUpperCase();
        int cont = 0;
        
        if (telefonou.equals("SIM")) {
            cont += 1;
            
        } if (localCrime.equals("SIM")) {
            cont += 1;
        } if (moraPerto.equals("SIM")) {
            cont += 1;
        } if (devia.equals("SIM")) {
            cont += 1;
        } if (trabalhou.equals("SIM")) {
            cont += 1;
        } if (cont == 2) {
            System.out.println("Você é um suspeito. Aguarde mais informações");
        } else if (cont == 3 || cont == 4) {
            System.out.println("Você é cúmplice. Chame seu advogado");
        } else if (cont == 5) {
            System.out.println("Você foi descoberto!! Você é o assassino e esta preso em nome da lei >.<");
        } else {
            System.out.println("Você é inocente! vá aproveita a vida");
        }

        teclado.close();

    }
}
