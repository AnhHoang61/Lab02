/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.pkg2;

/**
 *
 * @author DELL
 */
public class MyComplex {
    private double real;
    private double imag;
    
    public MyComplex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    public double getReal(){
        return real;
    }
    public void setReal(double real){
        this.real = real;
    }
    
    public double getImag(){
        return imag;
    }
    public void setImag(double imag){
        this.imag = imag;
    }
    
    public void setValue(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    
    public String toString() {
        return real  + " " + imag  ;
    }
    
    public boolean isReal(){
        if (imag == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isImaginary(){
        if (real == 0){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean equals(double real, double imag){
        if (this.real == real&& this.imag == imag){
            return true;
        } else {
            return false;
        }
    }
    
   public boolean equals(MyComplex another){
       if (this.real == another.getReal() && this.imag == another.getImag()){
           return true;
       } else {
           return false;
       }
   } 
   
   public double magnitude(){
       return Math.sqrt(real * real + imag * imag);
   }
   
   public double argumentInRadian(){
       return Math.atan2(imag, real);
   }
   
    public int argumentInDegrees(){
       return (int) Math.toDegrees(argumentInRadian());
   }
    
    public MyComplex conjugate(){
        return new MyComplex(real, -imag);
    }
    
    public MyComplex add(MyComplex another){
        double newReal = this.real + another.real;
        double newImag = this.imag + another.imag;
        return  new MyComplex(newReal, newImag);
    }
    
    public MyComplex subtract(MyComplex another){
        double newReal = this.real - another.real;
        double newImag = this.imag - another.imag;
        return  new MyComplex(newReal, newImag);
    }
    
     public MyComplex multiplyWith(MyComplex another) {
        double newReal = this.real * another.real - this.imag * another.imag;
        double newImag = this.real * another.imag + this.imag * another.real;
        return new MyComplex(newReal, newImag);
    }

    public MyComplex divideBy(MyComplex another) {
        double divisor = another.real * another.real + another.imag * another.imag;
        double newReal = (this.real * another.real + this.imag * another.imag) / divisor;
        double newImag = (this.imag * another.real - this.real * another.imag) / divisor;
        return new MyComplex(newReal, newImag);
    }
 
    
}
