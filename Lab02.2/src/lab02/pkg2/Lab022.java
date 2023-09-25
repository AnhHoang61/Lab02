/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg2;

/**
 *
 * @author DELL
 */
public class Lab022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         MyComplex complex1 = new MyComplex(3, 4);
        MyComplex complex2 = new MyComplex(1, -2);

        System.out.println("Complex 1: " + complex1);
        System.out.println("Complex 2: " + complex2);

        System.out.println("Magnitude of Complex 1: " + complex1.magnitude());
        System.out.println("Argument in Degrees of Complex 1: " + complex1.argumentInDegrees());
        
    }
    
}
