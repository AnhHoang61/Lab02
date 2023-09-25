/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.pkg1;

/**
 *
 * @author Admin
 */
public class MyCircle {
    private MyPoint center;
    private int radius;
    
    public MyCircle (int radius, int x, int y){
        //Gán các giá trị cho các tham số
        this.center = center;
        this.radius = radius;
    }
    
    public MyPoint getcenter(){
        return center;
    }
    public void setcenter(MyPoint center){
        this.center = center;
    }
    
    public int getradius(){
        return radius;
    }
    public void setradius(int radius){
        this.radius = radius;
    }
    
    public int getcenterX(){
        return center.getX();
    } 
    public int getcenterY(){
        return center.getY();
    }
    public void setcenterX(int centerX){
        center.setX(centerX);
    }
     public void setcenterY(int centerY){
        center.setY(centerY);
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Circle @" + "(" + center.getX() + center.getY() + ")" + radius;
    }
    
    
}
