/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p_ed_laura;

/**
 *
 * @author laura
 */
/**
 * <h2>Clase con los métodos de la calculadora.</h2>
 */
public class Calcular {

    /**
     * <p>
     * Constructor por defecto de la clase Calcular.</p>
     */
    public Calcular() {
    }

    /**
     * <p>
     * Suma dos números enteros.</p>
     *
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return La suma de los dos números enteros.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * <p>
     * Resta dos números enteros.</p>
     *
     * @param a Primer número entero (minuendo).
     * @param b Segundo número entero (sustraendo).
     * @return La resta de los dos números enteros.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * <p>
     * Multiplica dos números enteros.</p>
     *
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return El producto de los dos números enteros.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * <p>Divide dos números enteros.</p>
     *
     * @param a Dividendo.
     * @param b Divisor.
     * @return El cociente de la división como un número de punto flotante.
     * @throws ArithmeticException Si se intenta dividir por cero.
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }

    /**
     * <p>Calcula la potencia de un número.</p>
     *
     * @param base Base de la potencia.
     * @param exponente Exponente de la potencia (debe ser no negativo).
     * @return El resultado de elevar la base al exponente.
     * @throws IllegalArgumentException Si el exponente es negativo.
     */
    public int potencia(int base, int exponente) {
        if (exponente < 0) {
            throw new IllegalArgumentException("El exponente debe ser un número no negativo");
        }
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado *= base;
        }
        return resultado;
    }
}
