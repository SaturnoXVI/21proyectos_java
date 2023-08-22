import javax.swing.JOptionPane;

public class triangulo_20 {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Hola" + "\n"
                + "Por favor ingresa tu nombre:");

        String lado1String = JOptionPane.showInputDialog(nombre +
                "\nIngrese el lado 1 del triángulo: ");
        int lado1 = Integer.parseInt(lado1String);
        String lado2String = JOptionPane.showInputDialog(nombre +
                "\nIngrese el lado 2 del triángulo: ");
        int lado2 = Integer.parseInt(lado2String);
        String lado3String = JOptionPane.showInputDialog(nombre +
                "\nIngrese el lado 3 del triángulo: ");
        int lado3 = Integer.parseInt(lado3String);

        if (lado1 == lado2 && lado2 == lado3) {
            JOptionPane.showMessageDialog(null, "El triángulo es equilátero.");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            JOptionPane.showMessageDialog(null, "El triángulo es isósceles.");
        } else {
            JOptionPane.showMessageDialog(null, "El triángulo es escaleno.");
        }
    }
}
