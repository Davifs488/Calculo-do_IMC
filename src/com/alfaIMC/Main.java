package com.alfaIMC;

import java.util.Scanner;

public class Main {

    public static void calculoImc(double peso, double altura) {

        double[] pesosImc = {18.5 , 24.9 , 29.9 , 39.9 , 90000};
        String[]  classificacoesImc = {"Magreza" , "Normal" , "Sobrepeso" , "Obesidade" , "Obesidade Grave"};
        double imc = peso / (altura * altura);
        System.out.println("O IMC é :" + imc);
        int i = 0;
        while (imc > pesosImc[i]) {i ++;}
        System.out.println("A classificacao é:" + classificacoesImc[i]);

    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int teste = 1;
        while (teste == 1) {
            System.out.println("Calcular IMC ? (1 = sim, 0 = não)");
            teste = sc.nextInt();
            if (teste == 1) {
                System.out.println("Entre com o peso em Kg: ");
                double peso = sc.nextDouble();
                System.out.println("Entre com a altura em metros:");
                double altura = sc.nextDouble();
                calculoImc(peso, altura);
            }
        }
    }
}
