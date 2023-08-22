import javax.swing.JOptionPane;

public class Multiplos {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Hola user." + "\n"
                + "Por favor ingresa tu nombre:");

        String n1String = JOptionPane.showInputDialog(nombre +
                "\nIngrese el primer número: ");

        int n1 = Integer.parseInt(n1String);

        String n2String = JOptionPane.showInputDialog(nombre +
                "\nIngrese el segundo número: ");

        int n2 = Integer.parseInt(n2String);

        if (n1 % n2 == 0) {
            JOptionPane.showMessageDialog(null, nombre + "\nSí, los números son múltiplos");
        } else {
            JOptionPane.showMessageDialog(null, nombre + "\nNo, los números no son múltiplos");
        }
    }
}
