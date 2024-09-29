public class Ejercicio34 {
    public static void main(String[] args) {
        System.out.println("Valores de int:");
        System.out.println("Valor máximo de int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de int: " + Integer.MIN_VALUE);

        // Obtener y mostrar el valor máximo y mínimo de double
        System.out.println("\nValores de double:");
        System.out.println("Valor máximo de double: " + Double.MAX_VALUE);
        System.out.println("Valor mínimo de double: " + Double.MIN_VALUE);

        // Obtener y mostrar el valor máximo y mínimo de char
        System.out.println("\nValores de char:");
        System.out.println("Valor máximo de char: " + (int) Character.MAX_VALUE + " (representado como '" + Character.MAX_VALUE + "')");
        System.out.println("Valor mínimo de char: " + (int) Character.MIN_VALUE + " (representado como '" + Character.MIN_VALUE + "')");
    
    }
}