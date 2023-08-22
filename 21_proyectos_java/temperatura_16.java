import javax.swing.JOptionPane;

public class temperatura_16 {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");

        String temperaturaString = JOptionPane.showInputDialog(nombre +
                "\nIngrese la temperatura (°C): ");
        float temperatura = Float.parseFloat(temperaturaString);

        if (temperatura <= 10) {
            JOptionPane.showMessageDialog(null, "El clima es frío.");
        } else if (temperatura > 10 && temperatura <= 20) {
            JOptionPane.showMessageDialog(null, "El clima está nublado.");
        } else if (temperatura > 20 && temperatura <= 30) {
            JOptionPane.showMessageDialog(null, "El clima está caluroso.");
        } else {
            JOptionPane.showMessageDialog(null, "El clima es tropical.");
        }
    }
}
