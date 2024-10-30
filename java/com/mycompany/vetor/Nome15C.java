/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vetor;


import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 *
 * @author Jess
 */
public class Nome15C {
 
    public static void main(String[] args) {
        String[] nomes = new String[15];
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = JOptionPane.showInputDialog("Digite o nome " + (i + 1) + ":");
        }
        Arrays.sort(nomes);
        JOptionPane.showMessageDialog(null, "Nomes em ordem crescente:\n" + Arrays.toString(nomes));
    }
}
