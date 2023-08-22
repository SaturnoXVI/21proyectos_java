import javax.swing.JOptionPane;

public class multide8 {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Hola Mi king." + "\n"
                + "Ingrese su nombre por favor. ");

        String numeroStr = JOptionPane.showInputDialog("Hola " + nombre + "\n"
                + "Por favor, ingrese un numero:");

        int numero = Integer.parseInt(numeroStr);

        String mensaje;
        if (numero % 8 == 0) {
            mensaje = "Mi king. " + nombre + "\n"
                    + "El numero es multiplo de 8.";
        } else {
            mensaje = "Mi king. " + nombre + "\n"
                    + "El numero no es multiplo de 8.";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
