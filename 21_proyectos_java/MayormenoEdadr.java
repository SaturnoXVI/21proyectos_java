import javax.swing.JOptionPane;

public class MayormenoEdadr {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Hola user." + "\n"
                + "Por favor ingresa tu nombre:");

        String edadStr = JOptionPane.showInputDialog("Hola " + nombre + "\n"
                + "Por favor, ingrese su edad:");

        int edad = Integer.parseInt(edadStr);

        String mensaje;
        if (edad >= 18) {
            mensaje = "Hola " + nombre + "\n"
                    + "Eres mayor de edad.";
        } else {
            mensaje = "Hola " + nombre + "\n"
                    + "Eres menor de edad.";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
