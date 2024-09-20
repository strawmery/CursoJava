import java.util.Scanner;

public class ejercicio7and8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int num,num2,num3;

        System.out.println("introduzca el primer numero de la operacion: ");
        num = sc.nextInt();
        System.out.println("introduzca el segundo numero de la operacion: ");
        num2 = sc.nextInt();
        System.out.println("introduzca el tercer numero de la operacion: ");
        num3 = sc.nextInt();

        int sol = num + num2 * num3;
        System.out.println("la soluciuon de la opracion es: " + sol);*/

        //ejercicio 8 radio de un circulo solicitado por consola

        int radio;
        System.out.println("introduzca el valor del radio: ");
        radio = sc.nextInt();
        double area = Math.PI *  Math.pow(radio,2);
        System.out.println("el radio es de : " + area);
    }
}
