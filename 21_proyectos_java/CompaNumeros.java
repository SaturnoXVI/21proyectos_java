import javax.swing.JOptionPane;

public class CompaNumeros {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Hola chaval." + "\n"
                + "Por favor ingresa tu nombre:");

        String numero1Str = JOptionPane.showInputDialog("Hola " + nombre + "\n"
                + "Por favor ingresa el primer numero:");
        String numero2Str = JOptionPane.showInputDialog("Ahora introduce el segundo numero:");
        String numero3Str = JOptionPane.showInputDialog("Ahora introduce el tercer numero:");

        int numero1 = Integer.parseInt(numero1Str);
        int numero2 = Integer.parseInt(numero2Str);
        int numero3 = Integer.parseInt(numero3Str);

        String mensaje;
        if (numero1 == numero2 && numero2 == numero3) {
            mensaje = "Hola" + nombre + "\n"
                    + "Los tres numeros son iguales: " + numero1 + ", " + numero2 + " y " + numero3 + ".";
        } else if (numero1 != numero2 && numero1 != numero3 && numero2 != numero3) {
            mensaje = "Hola" + nombre + "\n"
                    + "Los tres numeros son diferentes.";
        } else {
            mensaje = "Hola " + nombre + "\n"
                    + "Dos numero son iguales  y un  numero es diferentes.";
            if (numero1 == numero2) {
                mensaje += "\nLos numeros " + numero1 + " y " + numero2 + " son iguales.";
                mensaje += "\nEl numeros " + numero3 + " es diferente.";
            } else if (numero1 == numero3) {
                mensaje += "\nLos numeros " + numero1 + " y " + numero3 + " son iguales.";
                mensaje += "\nEl numeros " + numero2 + " es diferente.";
            } else if (numero2 == numero3) {
                mensaje += "\nLos numeros " + numero2 + " y " + numero3 + " son iguales.";
                mensaje += "\nEl numeros " + numero1 + " es diferente.";
            }
        }

        JOptionPane.showMessageDialog(null, mensaje);
    }
}