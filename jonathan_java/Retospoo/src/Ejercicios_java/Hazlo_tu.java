package Ejercicios_java;

import java.util.Scanner;

public class Hazlo_tu {
    private static double nota;

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double nota=0.0,promedio,total=0;
        for(double i =0; i<=3;i++){
            System.out.println("escriba la nota a calificar");
            nota = leer.nextDouble();
            total=total+nota;
        }
        promedio=total/4;
        if((promedio>=3.0)||(promedio<=3.9)){
            System.out.println("usted aprobo la materia raspando");
        }
        else if (promedio>=4.0){
            System.out.println("aprobaste la materia con buenos resultados");
        }
        else{
            System.out.println("usted reprobo la materia ");
        }
        System.out.println("su nota final es "+promedio);
          
        



        leer.close();
    }
}
