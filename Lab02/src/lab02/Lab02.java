/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02;

/**
 *
 * @author Admin
 */
public class Lab02 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm'); 
        System.out.println(anAuthor); // call toString()
        anAuthor.setemail("paul@nowhere.com");
        System.out.println(anAuthor);
        
        Book aBook = new Book("Hello", anAuthor, 50, 50);
        System.out.println(aBook);
    }
    
}
