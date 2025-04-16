/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operacoesmatematicas;

/**
 *
 * @author Matheus Brito - 1º DS AMS
 */
public class OperacoesMatematicas {
    public static void main(String[] args) {
    // Definição de dois números
        double numero1 =  50.8;
        double numero2 = 20.7;
        
        // Realizando operações matemáticas
        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero2 != 0 ? numero1 / numero2 : Double.NaN;
        double resto = numero1 % numero2;
        
        System.out.print("Resultados das operações");
        System.out.print("Soma: " + soma);
        System.out.print("Subtração: + subracao");
        System.out.print("Divisão: " + (numero2 != 0 ? divisao : "Indefinida (divisão por zero)"));
        System.out.print("Resto da divisão: " + resto);
    }

}
