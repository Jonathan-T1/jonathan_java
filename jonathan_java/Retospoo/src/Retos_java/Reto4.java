package Retos_java;
import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner election=new Scanner(System.in);
        int user, cpu=0;
        System.out.println("para jugar eliga, 1 piedra, 2 papel, 3 tijera.");
        user=election.nextInt();
        cpu = (int)(Math.random()*3)+1;
        if(user==1 && cpu==2){
            System.out.println("sacaste piedra y la maquina papel, perdiste ");
        }
        else if(user==2 && cpu==1){
            System.out.println("sacaste papel y la maquina piedra, ganaste ");
        }
        else if(user==1 && cpu==3){
            System.out.println("sacaste piedra y la maquina tijera, ganaste ");
        }
        else if(user==3 && cpu==1){
            System.out.println("sacaste tijera y la maquina piedra, perdiste ");
        }
        else if(user==2 && cpu==3){
            System.out.println("sacaste papel y la maquina tijera, perdiste ");
        }
        else if(user==3 && cpu==2){
            System.out.println("sacaste tijera y la maquina papel, ganaste ");
        }
        else if(user==1 && cpu==1 || user==2 && cpu==2 || user==3 && cpu==3){
            System.out.println("Sacaste lo mismo que la maquina Empate ");
        }
        else{
            System.out.println("Datos no validos ");
        }
        System.out.println("Adios");
        election.close();
    }

}