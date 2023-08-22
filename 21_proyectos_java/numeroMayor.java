import javax.swing.JOptionPane;

public class numeroMayor {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Mi pana" + "\n"
                + "Por favor ingresa tu nombre:");

        String numero1Str = JOptionPane.showInputDialog("Hola " + nombre + "\n"
                + "Por favor ingresa el primer numero:");
        String numero2Str = JOptionPane.showInputDialog("Ahora introduce el segundo numero:");
        String numero3Str = JOptionPane.showInputDialog("Ahora introduce el tercer numero:");

        int numero1 = Integer.parseInt(numero1Str);
        int numero2 = Integer.parseInt(numero2Str);
        int numero3 = Integer.parseInt(numero3Str);

        int numeroMayor = Math.max(numero1, Math.max(numero2, numero3));

        String mensaje = "Hola " + nombre + "\n"
                + "El numero mayor de los tres es: " + numeroMayor;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
