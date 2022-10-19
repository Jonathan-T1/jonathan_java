package Ejercicios_java;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
       

        int op,num1,num2,total;

        System.out.println("menu opciones \n 1. Suma \n 2.Resta \n 3.multiplicacion \n 4.Division \n ingrese el numero de la opcion que desea realizar");
        op=leer.nextInt();

        System.out.println("ingrese el numero 1");
        num1=leer.nextInt();

        System.out.println("ingrese el numero 2");
        num2=leer.nextInt();

        switch(op){
            case 1:
            total=num1+num2;
            System.out.println("el total es "+total);
            break;
            case 2:
            total=num1-num2;
            System.out.println("el total es "+total);
            break;
            case 3:
            total=num1*num2;
            System.out.println("el total es "+total);
            break;
            case 4:
            total=num1/num2;
            System.out.println("el total es "+total);
            break;
            case 5:
            double n1=(double) num1;
            double n2=(double) num2;
            double elevado = Math.pow(n1,n2);
            System.out.println("El total de la potencia entre "+num1+"y"+num2+"es" + elevado);
            break;
            case 6:
            Double raiz = Math.sqrt(num1);
            Double raiz2 = Math.sqrt(num2);
            System.out.println("La raiz cuadrada de "+num1+"es"+raiz+"\n la raiz cuadrada de" +num2+"es"+raiz2 );
            break;
            default:
            System.out.println("la opcion no esta valida");
            break;

        }
        leer.close();
    }
}
