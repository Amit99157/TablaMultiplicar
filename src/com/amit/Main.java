package com.amit;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);
                int numero, resultado, i = 0;

                System.out.print("¿Qué tabla de multiplicar quiere repasar? La tabla del: ");
                numero = entrada.nextInt();

                while (i <= 10) {
                        resultado = numero * i;
                        System.out.println(i + " * " + numero + " = " + resultado);

                        i++;
                }

                entrada.close();
        }
}
