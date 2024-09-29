import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("introduzca un numero: ");
        num = sc.nextInt();
        System.out.println("la potencia de tu numero elevado a 2 es igual a: "+ Math.pow(num,2));
        System.out.println("la raiz cuadrada es: "+ Math.sqrt(num));
        System.out.println("el valor absoluto de tu numero es: "+ Math.abs(num));
    }
}
