/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.pkg1;

/**
 *
 * @author Admin
 */
public class MyPoint {
    //Khai báo
    private int x;
    private int y;
    
    public MyPoint (int x, int y){
        //Gán các giá trị cho các tham số
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    
    public String toString() {
        return x + " " + y ;
    }
    
    public double distance(int x, int y) { 
    int xDiff = this.x - x; 
    int yDiff = this.y - y;
    return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
    public double distance(MyPoint another) { 
        int xDiff = this.x = another.x;
        int yDiff = this.y = another.y;
        return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
}
