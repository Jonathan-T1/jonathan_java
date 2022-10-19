package Ejercicios_java;
import java.util.Scanner;

public class Ejercicio_Edad {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        int edad;
        System.out.println("ingrese su edad ");
        edad=leer.nextInt();

        if(edad>=18){

            System.out.println("Bienvenido, siga trae plata cerveza 3.000");
        }
        else{
            System.out.println("para su casa a lavar los platos, procede a tirarle la chancla");
        }
        leer.close();
        
    }
    
}
