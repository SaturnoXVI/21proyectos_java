import javax.swing.JOptionPane;

public class sumaNumeros {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Hola user." + "\n"
                + "Por favor ingresa tu nombre:");

        String numero1Str = JOptionPane.showInputDialog("Hola " + nombre + "\n"
                + "Por favor ingresa el primer numero:");
        String numero2Str = JOptionPane.showInputDialog("Ahora ingresa el segundo numero:");

        double numero1 = Double.parseDouble(numero1Str);
        double numero2 = Double.parseDouble(numero2Str);

        double suma = numero1 + numero2;

        String mensaje = "La suma de " + numero1 + " y " + numero2 + "\n"
                + "Es: " + suma;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
