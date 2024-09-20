import java.util.Scanner;

public class ejercicio7and8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,num2,num3;

        System.out.println("introduzca el primer numero de la operacion: ");
        num = sc.nextInt();
        System.out.println("introduzca el segundo numero de la operacion: ");
        num2 = sc.nextInt();
        System.out.println("introduzca el tercer numero de la operacion: ");
        num3 = sc.nextInt();

        int sol = num + num2 * num3;
        System.out.println("la soluciuon de la opracion es: " + sol);
    
    }
}
