import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el número de filas de la primera matriz:");
        int filas1 = scanner.nextInt();
        System.out.println("Ingrese el número de columnas de la primera matriz:");
        int columnas1 = scanner.nextInt();

        System.out.println("Ingrese el número de filas de la segunda matriz:");
        int filas2 = scanner.nextInt();
        System.out.println("Ingrese el número de columnas de la segunda matriz:");
        int columnas2 = scanner.nextInt();

        
        if (columnas1 != filas2) {
            System.out.println("La multiplicación no es posible. El número de columnas de la primera matriz debe ser igual al número de filas de la segunda matriz.");
            return;
        }

        
        int[][] matriz1 = new int[filas1][columnas1];
        int[][] matriz2 = new int[filas2][columnas2];
        int[][] resultado = new int[filas1][columnas2]; 

        
        System.out.println("Ingrese los elementos de la primera matriz:");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas1; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz1[i][j] = scanner.nextInt();
            }
        }

        
        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (int i = 0; i < filas2; i++) {
            for (int j = 0; j < columnas2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz2[i][j] = scanner.nextInt();
            }
        }

        
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                for (int k = 0; k < columnas1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        
        System.out.println("La matriz resultante de la multiplicación es:");
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
