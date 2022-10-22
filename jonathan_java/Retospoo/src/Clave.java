import java.util.Scanner;

public class Clave {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        Scanner pastwork=new Scanner(System.in);

        String user1;
        String pastwork1;

        System.out.println("Ingrese su usuario");
        user1=user.nextLine();

        System.out.println("Ingrese contraseña");
        pastwork1=pastwork.nextLine();
        
        if(((user1.equals("jfajardo") ) && (pastwork1.equals("123456789#"))) || ((user1.equals("tcabrera")) && (pastwork1.equals("qwerty2022")))){

            System.out.println("Puedes usar la calculadora");

            Scanner leer=new Scanner(System.in);
            int op,num1,num2,total;

            System.out.println("Menu opciones \n 1. Suma \n 2. Resta \n 3. Multiplicación \n 4. División \n 5. Potenciación \n 6. Radicación \n Ingrese el numero de las opciones que desea realizar ");
            op=leer.nextInt();
    
            System.out.println("Ingrese el numero 1");
            num1=leer.nextInt();
    
            System.out.println("Ingrese el numero 2");
            num2=leer.nextInt();
    
            switch(op){
                case 1:
                total=num1+num2;
                System.out.println("El total de la suma entre "+num1+" y "+num2+" es igual a "+total);
                break;
                case 2:
                total=num1-num2;
                System.out.println("El total de la resta entre "+num1+" y "+num2+" es igual a "+total);
                break;
                case 3:
                total=num1*num2;
                System.out.println("El total de la multiplicación entre "+num1+" y "+num2+" es igual a "+total);
                break;
                case 4:
                total=num1/num2;
                System.out.println("El total de la división entre "+num1+" y "+num2+" es igual a "+total);
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
                System.out.println("La opcción seleccionada no es valida");
                break;
    
            }
            leer.close();
        }
        else if(((user1.equals("jfajardo") ) && (pastwork1.equalsIgnoreCase(pastwork1))) || (user1.equals("tcabrera") && (pastwork1.equalsIgnoreCase(pastwork1)))){
            System.out.println("Tu contraseña no es correcta.");
        }
        else if(((user1.equalsIgnoreCase(user1) ) && (pastwork1.equals("123456789#"))) || (user1.equalsIgnoreCase(user1) && (pastwork1.equals("qwerty2022")))){
            System.out.println("Usuario no existe, no esta registrado.");
        }
        else{
            System.out.println("Credenciales de acceso incorrectas.");
        }
        user.close();
        pastwork.close();
    }
}
