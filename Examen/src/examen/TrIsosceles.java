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
public class TrIsosceles implements Triangulo {
    
    double a;
    double b;
    double c;

    public TrIsosceles(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    
    @Override
      public double CalcularArea(){
    
    return (b*Math.sqrt(Math.pow(a,2.0) - (Math.pow(b,2.0)/4)))/2;
    
    }
    
    @Override
    public double CalcularPerimetro(){
    
    return (2*a)+b;
    
    
    }
    
    @Override
    public double CalcularAltura(){
    
    return Math.sqrt(Math.pow(a,2.0) - (Math.pow(b,2.0)/4));
    
    }
    
    
    
    
    
    
}
