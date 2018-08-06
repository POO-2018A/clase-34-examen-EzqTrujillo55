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
public class TrEquilatero implements Triangulo{
    
    double a;
    double b;
    double c;

    public TrEquilatero(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double CalcularArea() {
       return ((Math.sqrt(3)*a)/2)*Math.pow(a, 2.0);
    }

    @Override
    public double CalcularPerimetro() {
      return 3*a;
    }

    @Override
    public double CalcularAltura() {
       return (Math.sqrt(3)*a)/2;
    }
    
    
    
    
    
    
    
}
