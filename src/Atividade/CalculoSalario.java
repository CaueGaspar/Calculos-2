package Atividade;

import java.util.Scanner;

public class CalculoSalario {

    public static void main(String[] args) {
        Scanner lendo = new Scanner(System.in);

        double valorHora;
        double numeroHoras;
        double salarioBruto;
        double descontoIR;
        double descontoINSS;
        double descontoSindicato;
        double salarioLiquido;
        double descontos;

        System.out.println("Este programa destina-se a calcular e mostrar o valores de seu salário,");
        System.out.println("de acordo com o número de horas trabalhadas, ganhos por hora e descontos.");

        System.out.print("Digite o valor de quanto você ganha por hora: R$");
        valorHora = lendo.nextDouble();

        System.out.print("Digite o número de horas trabalhadas: ");
        numeroHoras = lendo.nextDouble();

        salarioBruto = numeroHoras * valorHora;

        descontoIR = (salarioBruto / 100) * 11;

        descontoINSS = (salarioBruto / 100) * 8;

        descontoSindicato = (salarioBruto / 100) * 5;

        descontos = descontoIR + descontoINSS + descontoSindicato;
        salarioLiquido = salarioBruto - descontos;

        System.out.println("Segue abaixo a descrição de seu salário e descontos:");
        System.out.println(" Salário Bruto: +R$" + salarioBruto);
        System.out.println(" Desconto de IR: -R$" + descontoIR);
        System.out.println(" Desconto de INSS: -R$" + descontoINSS);
        System.out.println("Desconto do Sindicato: -R$" + descontoSindicato);
        System.out.println(" Total de Descontos: -R$" + descontos);
        System.out.println(" Salário Líquido: +R$" + salarioLiquido);
    }

}
