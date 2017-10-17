package Atividade;

import java.util.Scanner;

public class CalculosDiversos {

    public static void main(String[] args) {
        Scanner lendo = new Scanner(System.in);

        int valor1;
        int valor2;
        double valor3;
        double calculo1;
        double calculo2;
        double calculo3;

        System.out.println("Este programa se destina a calcular valores de dois números inteiros ");
        System.out.println("e um número real fornecidos pelo usuário.");
        System.out.print("Digite um número inteiro: ");
        valor1 = lendo.nextInt();

        System.out.print("Digite outro número inteiro: ");
        valor2 = lendo.nextInt();

        System.out.print("Digite um número real: ");
        valor3 = lendo.nextDouble();

        calculo1 = valor1 * 2;
        calculo2 = valor2 / 2;
        calculo1 = calculo1 * calculo2;
        System.out.println("O dobro do primeiro valor (2*" + valor1 + ") "
                + "multiplicado com a metade do segundo valor (" + valor2 + "/2)é: " + calculo1);

        calculo2 = valor1 * 3;
        calculo2 = calculo2 + valor3;
        System.out.println("O triplo do primeiro valor (3*" + valor1 + ") "
                + "somado com o terceiro valor (" + valor3 + ") é: " + calculo2);

        calculo3 = Math.pow(valor3, 3); //valor3 * valor3 * valor3;
        System.out.println("O terceiro valor (" + valor3 + ") elevado ao cubo é: " + calculo3);
    }

}
