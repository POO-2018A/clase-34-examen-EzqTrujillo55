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
public class TrEscaleno implements Triangulo{

    double a;
    double b;
    double c;
    double s;
    public TrEscaleno(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
  
    
    @Override
    public double CalcularArea() {
       
        s= (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public double CalcularPerimetro() {
       return a+b+c; 
    }

    @Override
    public double CalcularAltura() {
      return (2/a)*Math.sqrt(s*(s-a)*(s-b)*(s-c)); 
    }
    
    
    
    
}
