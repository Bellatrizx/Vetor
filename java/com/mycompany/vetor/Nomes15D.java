/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetor;

import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author Jess
 */
public class Nomes15D {
      public static void main(String[] args) {
        String[] nomes = new String[15];
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog("Informe o nome " + (i + 1) + ":");
        }
        Arrays.sort(nomes, Collections.reverseOrder());
        JOptionPane.showMessageDialog(null, "Nomes em ordem decrescente:\n" + Arrays.toString(nomes));
    }
}
