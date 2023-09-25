/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;

/**
 *
 * @author Admin
 */
public class Book {
    //Khai báo
    private String name;
    private Author Author;
    private double price;
    private int qtyInStock;
    
    //Hàm truyền dữ liệu
    public Book (String name, Author Author, int qtyInStock, int par1){
        this.name = name;
        this.Author = Author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    
    //Trả giá trị 
    public String getName(){
        return name;
    }
    public Author getAuthor(){
        return Author;
    }
    public double getPrice(){
        return price;
    }
    public int getqtyInStock(){
        return qtyInStock;
    }
    //Hàm thay đổi
    public void setPrice(double price){
        this.price = price;
    }
    public void setqtyInStock(int qtyInStock){
        this.qtyInStock = qtyInStock;
    }
    //
    public String toString() {
        return name + " " + Author + price + qtyInStock;
    }
}
