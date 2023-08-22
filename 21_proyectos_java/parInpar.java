import javax.swing.JOptionPane;

public class parInpar {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Hola." +
                "\n" + "Joven por favor ingrese su nombre");
        String numeroStr = JOptionPane.showInputDialog("Hola " + nombre + "\n"
                + "Por favor ingrese un numero:");

        int numero = Integer.parseInt(numeroStr);

        String mensaje;
        if (numero % 2 == 0) {
            mensaje = "Hola we " + nombre + "\n" +
                    "el numero es par.";
        } else {
            mensaje = "Hola we" + nombre + "\n"
                    + "el numero es impar.";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
