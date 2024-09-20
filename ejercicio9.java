import javax.swing.JOptionPane;

public class ejercicio9 {
    public static void main(String[] args) {
        String nombre =JOptionPane.showInputDialog("ingrese su nombre su nombre: ");
        
        if(nombre !=null && !nombre.isEmpty()){
            String mensaje = "hola, "+ nombre +"! ten un buen dia!";

            JOptionPane.showMessageDialog(null, mensaje);
        }else {
            JOptionPane.showMessageDialog(null, "no se ingreso un nombre");
        }

    }
}