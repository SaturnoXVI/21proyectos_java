import javax.swing.JOptionPane;

public class ordenNumeros {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Hola mastodonte" + "\n"
                + "Por favor ingresa tu nombre:");

        String numero1Str = JOptionPane.showInputDialog("Hola " + nombre + "\n"
                + "Por favor ingresa el primer numero:");
        String numero2Str = JOptionPane.showInputDialog("Ahora ingresa el segundo numero:");
        String numero3Str = JOptionPane.showInputDialog("Ahora ingresa el tercer numero:");

        int numero1 = Integer.parseInt(numero1Str);
        int numero2 = Integer.parseInt(numero2Str);
        int numero3 = Integer.parseInt(numero3Str);

        String mensaje;
        if (numero1 < numero2 && numero2 < numero3) {
            mensaje = "Hola " + nombre + "\n"
                    + "Los numeros están en orden creciente.";
        } else if (numero1 > numero2 && numero2 > numero3) {
            mensaje = "Hola " + nombre + "\n"
                    + "Los numeros están en orden decreciente.";
        } else {
            mensaje = "Hola " + nombre + "\n"
                    + "Los numeros no siguen un patron de aumento o disminución.";
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
