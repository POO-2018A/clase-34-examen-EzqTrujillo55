/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author ESFOT
 */
public class TrRectangulo implements Triangulo {
    
    double a;
    double b;
    double c;

    public TrRectangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

   
    
    @Override
    public double CalcularArea(){
    
    return (b*a)/2;
    
    
    }
    
    @Override
    public double CalcularPerimetro(){
    
    return a+b+c;
    
    
    }
    
    @Override
    public double CalcularAltura(){
    
    return (a*b)/c; 
    
    }
    
    
}
