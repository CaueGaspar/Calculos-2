package Atividade;

import java.util.Scanner;

public class CalculoQuadrado {

    public static void main(String[] args) {
        Scanner lendo = new Scanner(System.in);

        double ladoQuadrado;
        double areaQuadrado;
        double dobroArea;

        System.out.println("Programa que calcula a valores da area de um quadrado a partir do valor de um dos lados digitado pelo usuário");

        System.out.print("Digite o valor dos lados do quadrado: ");
        ladoQuadrado = lendo.nextDouble();
        areaQuadrado = Math.pow(ladoQuadrado, 2);//ladoQuadrado * ladoQuadrado;
        dobroArea = areaQuadrado * 2;

        System.out.println("Seguem abaixo as medidas do quadrado.");
        System.out.println("Valor dos lados do quadrado: " + ladoQuadrado + "cm.");
        System.out.println("Valor da área do quadrado: " + areaQuadrado + "cm².");
        System.out.println("Valor do dobro da área do quadrado: " + dobroArea + "cm².");
    }

}
