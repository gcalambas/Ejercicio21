/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio21;
import java.util.Scanner;
public class Ejercicio21 {

    public static void main(String[] args) {
        double la, lb, lc; //lado a, lado b, lado c 
        double s, p; //semiperimetro y perimetro del triangulo
        double a; // area del triangulo
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del lado a: ");
        la = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del lado b: ");
        lb = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del lado c: ");
        lc = entrada.nextDouble();
        
        p = Triangulo.obtener_perimetro(la, lb, lc);
        s = Triangulo.obtener_semiperimetro(p);
        a = Triangulo.obtener_area(s, la, lb, lc);
                
        System.out.println("Perimetro: " + p);
        
        System.out.println("Semiperimetro: "+ s);
        
        System.out.println("Area: " + a);
    }
}
