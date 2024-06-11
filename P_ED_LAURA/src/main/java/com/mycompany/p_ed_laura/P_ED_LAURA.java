/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.p_ed_laura;

/**
 *
 * @author laura
 */

public class P_ED_LAURA {
/**
 * <h2>Método principal para <b>probar</b> la funcionalidad de la clase
 * Calcular.</h2>
 *
 * @param args Los argumentos de la línea de comandos (no utilizados en este
 * programa).
 */
    public static void main(String[] args) {
// Crear una instancia de la clase Calcular
        Calcular calc = new Calcular();

        // Realizar algunas operaciones matemáticas y mostrar los resultados
        System.out.println("Suma: " + calc.sumar(5, 3));
        System.out.println("Resta: " + calc.restar(5, 3));
        System.out.println("Multiplicación: " + calc.multiplicar(5, 3));
        System.out.println("División: " + calc.dividir(10, 2));
        System.out.println("Potencia: " + calc.potencia(2, 3));
    }
}
