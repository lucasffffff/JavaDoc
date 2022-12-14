/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.boletin2_3;

/**
 * titulo: Conversor euro dólar.
 * @author lucas
 * @version 1.0
 */
import java.util.Scanner;
public class Boletin2_3 {
    public static void main(String[] args) {
        /** Declaro un scanner para poder mostrar texto.*/
        Scanner sc = new Scanner(System.in);
        /** Pido la cantidad de euros a convertir:*/
        System.out.println("Introduzca la cantidad de euros que desea convertir: ");
        double euros = sc.nextDouble();
        /** Pido el valor actual del dólar.*/
        System.out.println("Introduzca el valor actual del dólar: ");
        double dolar = sc.nextDouble();
        /** Hago la conversión euro/dolar*/
        double convert = euros * dolar;
        /** Muestro los dólares que tienes finalmente*/
        System.out.println("Tienes un total de " + convert + " dólares.");
    }
}
