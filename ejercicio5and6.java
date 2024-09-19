import java.util.Scanner;

public class ejercicio5and6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       /* float num;
        System.out.println("introduce un numero: ");
        num = sc.nextFloat();
        String palabra;
        System.out.println("introduce una palabra: ");
        palabra = sc.next();

        System.out.println(num);
        System.out.println(palabra);*/
        
        int num;
        int num2;

        System.out.println("introduzca un numero: ");
        num = sc.nextInt();
        System.out.println("introduzca el segundo numero: ");
        num2 = sc.nextInt();
        int resul = num + num2;
        System.out.println("el resultado de la suma es: "+ resul );


    }
}