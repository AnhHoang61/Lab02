/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;

/**
 *
 * @author Admin
 */
//Khai báo class Tác Giả
public class Author {
    //Khai báo
    private String name;
    private String email;
    private char gender;
    //Hàm chuyền dữ liệu
    public Author (String name, String email, char gender){
        //Gán các giá trị cho các tham số
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    //Trả giá trị về cho biến
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    //Hàm gán email để thay đổi
    public void setemail(String email){
        this.email = email;
    }
    public char getGender(){
        return gender;
    }
    //Hiển thị thông tin theo 1 chuỗi
    public String toString() {
        return name + " (" + gender + ") at " + email;
    }
    
    
    
}
