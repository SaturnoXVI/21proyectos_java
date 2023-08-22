import javax.swing.JOptionPane;

public class cantidaCifras {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Hola mi perro." + "\n"
                + "Por favor ingresa tu nombre:");

        String numeroStr = JOptionPane.showInputDialog("Hola " + nombre + "\n"
                + "Por favor ingrese un numero:");

        long numero = Long.parseLong(numeroStr);

        int cantidadCifras = String.valueOf(numero).length();

        String mensaje = "Hola " + nombre + "\n"
                + "El numero " + numero + "\n"
                + "tiene " + cantidadCifras + " cifras.";

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
