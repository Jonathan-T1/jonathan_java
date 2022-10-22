package Retos_java;

import java.util.Scanner;

public class Reto5 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String nombre, apellido;

        System.out.println("Digite su nombre ");
        nombre=leer.next();

        System.out.println("Digite su apellido");
        apellido=leer.next();

        int length = nombre.length();
        System.out.println("La longitud de su nombre es es: " + length);
         
        System.out.println(nombre.toUpperCase());
        System.out.println(apellido.toLowerCase());
        System.out.println(nombre +" "+apellido);

        String subnombre = nombre.substring(0, 2);

        System.out.println(subnombre+apellido);
        leer.close();
    }
    
}
