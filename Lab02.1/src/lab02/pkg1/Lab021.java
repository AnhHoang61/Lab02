/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.pkg1;

/**
 *
 * @author Admin
 */
public class Lab021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 0);
        MyPoint p2 = new MyPoint(0, 4);
        
        System.out.println(p1.distance(p2)); 
        System.out.println(p1.distance(5, 6));
        
         MyCircle circle1 = new MyCircle(5, 2, 3);
         System.out.println("Area: " + circle1.getArea());

        MyTriangle triangle1 = new MyTriangle(1, 2, 3, 4, 5, 6);
        MyPoint v1 = new MyPoint(1,2);
        MyPoint v2 = new MyPoint(3, 4);
        MyPoint v3 = new MyPoint(5, 6);
        MyTriangle triangle2 = new MyTriangle(v1, v2, v3);

        System.out.println("Triangle 1: " + triangle1);
        System.out.println("Triangle 2: " + triangle2);

        System.out.println("Perimeter of Triangle 1: " + triangle1.getPerimeter());
        System.out.println("Perimeter of Triangle 2: " + triangle2.getPerimeter());

        
    }
    
}
