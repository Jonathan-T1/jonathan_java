import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner vacuna=new Scanner(System.in);
        float meses,libras,dosis;

        System.out.println("ingrese la edad en meses del bebe");
        meses=vacuna.nextFloat();
        meses=meses*10;

        System.out.println("ingrese el peso del bebe en libras");
        libras=vacuna.nextFloat();
        libras=libras+10;
        dosis=libras/meses*8;

        System.out.println("la dosis a aplicar es"+dosis+"milimetros cubicos");
        vacuna.close();
    }
}
