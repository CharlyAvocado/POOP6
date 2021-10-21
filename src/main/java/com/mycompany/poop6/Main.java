/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop6;

/**
 *
 * @author Hyperion
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Clase empaquetada desde el IDE");
        System.out.println("La suma es: "+suma(2,3));
        System.out.println("Nueva línea");
    } 
    /**
     * Retorna la suma de dos enteros
     * @param a
     * @param b
     * @return 
     */
    public static int suma(int a, int b){
    return a+b;
    }
}
