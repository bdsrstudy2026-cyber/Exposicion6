/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
/**
 *
 * @author Juan Diego Diaz Navas
   * @author Brayan Dario Sierra Ramires
    * @author David Steven Castro Garavito
 */
public class Actividad {
    public static void main(String args[])
    {
        String nombre;
        int edad;
        nombre=JOptionPane.showInputDialog("Enter your name:");
        edad=Integer.parseInt(JOptionPane.showInputDialog("how old are you?"));
        String texto = "Hola, mi nombre es " + nombre + ", tengo " + edad + " años, y esta es la actividad de la exposición 6.";
        JOptionPane.showMessageDialog(null, texto);
    }
}
