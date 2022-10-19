package Retos_java;
import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner conversion=new Scanner(System.in);
        double gradosf,formula;

        System.out.println("introdusca los grados en farenheit");
        gradosf=conversion.nextDouble();
        formula=(gradosf-32)/1.8;

        System.out.println("los grados centrigrados que debe poner en el horno son"+formula);
        conversion.close();     
    }
}
