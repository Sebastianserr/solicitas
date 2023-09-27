
package com.mycompany.suma2numeros;
import java.util.Scanner;
public class Suma2numeros {
public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner leer=new Scanner (System.in);
        float n1,n2,r;
        System.out.print("ingresa el primer numero: ");
        n1=leer.nextFloat();
        System.out.print("ingresa el segundo numero: ");
        n2=leer.nextFloat();
        r=n1+n2;
        System.out.print("la suma es: " +r);
        
    }
}
