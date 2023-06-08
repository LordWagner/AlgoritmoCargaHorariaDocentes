package com.mycompany.algoritmo;

import java.util.Scanner;

/**
 *
 * @author Mayko end Wagner
 */
public class Algoritmo {

    public static void main(String[] args) {

        /**
         * Declaração de variaveis:
         */
        double ns; // número de docentes substituos  
        double hs; // carga horária semanal dos docentes substitutos
        double nc; // número de docentes efetivos com coordenação
        double nn; // número de docentes efetivos sem coordenação
        double h; // carga horária total 
        double hn; // carga horária semanal dos docentes sem coordenação (restrição de 12  a 20 horas/semana)
        double hc; // carga horária semanal dos docentes com coordenação (restrição de 8  a 12 horas/semana)
        double v;// variavel para validar 

        String separa = "==============================================================================================";

        /**
         * Atribuição de valores :
         */
        Scanner leitor = new Scanner(System.in, "UTF-8");

        System.out.println("Digite a cabchxbzhcbxzhbchzxbchxzbhcbzxhbcxzhbchxzbchzxbhxcrga horária total dos docentes: ");
        h = leitor.nextDouble();

        System.out.println("Digite o número de docentes sem coordenação: ");
        nn = leitor.nextDouble();

        System.out.println("Digite o número de docentes com coordenação: ");
        nc = leitor.nextDouble();

        System.out.println("Digite o número de docentes substitutos: ");
        ns = leitor.nextDouble();

        System.out.println("Digite a carga horária exigida para docentes substitutos: ");
        hs = leitor.nextDouble();

        /**
         * Descobrindo a carga horária para os docentes com coordenação :
         */
        hc = 3 * (h - ns * hs) / (5 * nn + 3 * nc);

        System.out.println(separa);
        System.out.println(String.format("A carga horária semanal indicada para os docentes com coordenação: %.2f", hc));

        /**
         * Descobrindo a carga horária para os docentes sem coordenação :
         */
        hn = (5 * hc) / 3;

        System.out.println(String.format("A carga horária semanal indicada para os docentes sem coordenação: %.2f", hn));

        /**
         * Validando:
         */
        v = ns * hs + nn * hn + nc * hc;

        System.out.println(String.format("A carga horária total na validação: %.2f", v));

    }
}