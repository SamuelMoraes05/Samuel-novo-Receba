package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercício02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coloque um número: ");
        int numero1 = (int) scanner.nextDouble();
        if (numero1 > 0) {
            System.out.println("O valor é positivo.");
        } else if(numero1 < 0) {
            System.out.println("O valor é negativo.");
        }else {
                 System.out.println("ZERO");
                 scanner.close();
        }
    }
}