package Ejercicios_java;
import java.util.Scanner;

public class Ejercicio1{
   
    public static void main(String[] args) {
        Scanner valor=new Scanner(System.in);

        int precio,cantidad, referencias=0, subtotal, total=0,op,pagar,cambio;

        for(int x=0; x<=4; x++){

            System.out.println("digite el precio del producto");
            precio=valor.nextInt();

            System.out.println("digite la cantidad del producto");
            cantidad=valor.nextInt();

            subtotal=precio*cantidad;
            System.out.println(cantidad+"del producto de precio "+precio+"es"+subtotal);
            //iniciar el contador de minutos de la compra
            referencias=referencias+1;

            //iniciamos acumulador para eñl total de la compra
            total=total+subtotal;
             

          }
          System.out.println("la cantidad de minutos de la compra es "+referencias);
          System.out.println("el total de su compra es "+total);
          Scanner leer=new Scanner(System.in);
          System.out.println("ingrese el valor con el que desea cancelar");
          pagar=leer.nextInt();
          cambio=pagar-total;
          System.out.println("su cambio es "+cambio);
          System.out.println("digite 1 si cuenta con telefonia movil exito, de lo contrario digite 2 ");
          op=leer.nextInt();
          switch (op) {
            case 1:
            System.out.println("los minutos que obtuvo por su compra son "+referencias);
                break;
            case 2:
            System.out.println("no pierdas mas minutos, adquiere ya tu telefonia movil exito");
          
            default:
                break;
          }


          leer.close();
         valor.close();
}
}