/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetor;

import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author Jess
 */
public class Numeros50D {
    public static void main(String[] args) {
        Integer[] numeros = new Integer[50];
        for (int i = 0; i < numeros.length; i++) {
            String input = JOptionPane.showInputDialog("Informe o número " + (i + 1) + ":");
            numeros[i] = Integer.parseInt(input);
        }
        Arrays.sort(numeros, Collections.reverseOrder());
        JOptionPane.showMessageDialog(null, "Números em ordem decrescente:\n" + Arrays.toString(numeros));
    }

}
