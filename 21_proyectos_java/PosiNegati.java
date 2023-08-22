import javax.swing.JOptionPane;

public class PosiNegati {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Hola, Porfavor ingresa tu nombre :)");
        String numeroStr = JOptionPane.showInputDialog("Hola " + nombre + "introduce un numero:");

        double numero = Double.parseDouble(numeroStr);

        String mensaje;
        if (numero > 0) {
            mensaje = "El numero es positivo";
        } else if (numero < 0) {
            mensaje = "El numero es negativo";
        } else {
            mensaje = "El numero es cero";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
