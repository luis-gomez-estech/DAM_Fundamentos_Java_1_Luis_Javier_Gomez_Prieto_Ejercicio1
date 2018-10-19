package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner escaner = new Scanner (System.in);

        System.out.println("Ecuación: ax2 + bx + c = 0");
        System.out.println("Introduce el valor de a");
       int a = escaner.nextInt();
        System.out.println("Introduce el valor de b");
       int b = escaner.nextInt();
        System.out.println("Introduce el valor de c");
       int c = escaner.nextInt();

        // Para una ecuación de segundo grado, si el discriminante, osea,
        //(b^2 + 4*a*c) es un numero positivo, entonces la ecuacion tiene 2 soluciones
        //(b^2 + 4*a*c) es igual a cero, entonces la ecuacion tiene 1 solucion
        //(b^2 + 4*a*c) es un numero negativo, entonces la ecuacion no tiene soluciones reales

        double discriminante = (b*b)-(4*a*c); // Aqui calculo el discriminante y uso double para que imprima decimales

        // Obtengo resultado de la ecuación con signo +

        double resultado1 = ((-b) + Math.sqrt((b*b)-(4*a*c)))/(2*a);

        // Obtengo resultado de la ecuación con signo -

        double resultado2 = ((-b) - Math.sqrt((b*b)-(4*a*c)))/(2*a);

        // Aqui mediante if con respecto al valor del discriminante le digo:
        // Que imprima si tiene 2 soluciones, asi como el resultado de ambas

        if(discriminante>0){
            System.out.println("La ecuación tiene 2 soluciones");
            System.out.println("x= " + resultado1 + " / " + "x = " + resultado2);

        }

        // Que imprima que solo tiene 1 solucion, asi como el resultado de la solucion
        if(discriminante==0){
            System.out.println("La ecuación solo tiene 1 solución");
            System.out.println("x= " + resultado1);

        }

        // Que imprima que no tiene solucion real
        if(discriminante<0){
            System.out.println("La ecuación no tiene soluciones reales");

        }


    }


    }

