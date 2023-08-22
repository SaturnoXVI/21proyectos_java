import javax.swing.JOptionPane;

public class MayusMinus {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Mi king" + "\n"
                + "Por favor ingresa tu nombre:");
        

        String letraStr = JOptionPane.showInputDialog("Hola " + nombre + "\n"
        +"Por favor, introduce una letra:");
        

        char letra = letraStr.charAt(0);
        

        String mensaje;
        if (Character.isUpperCase(letra)) {
            mensaje = "Hola " + nombre + "\n"
                    + "La letra ingresada esta en mayuscula.";
        } else if (Character.isLowerCase(letra)) {
            mensaje ="Hola " + nombre + "\n"
                    + "La letra ingresada esta en minuscula.";
        } else {
            mensaje = "Hola " + nombre + "\n"
                    +"El caracter ingresado no es una letra.";
        }
        

        JOptionPane.showMessageDialog(null, mensaje);
    }
}
