import javax.swing.JOptionPane;

public class salario_18 {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Hola trabajador." + "\n"
                + "Ingrese su nombre por favor. ");

        String edadString = JOptionPane.showInputDialog(nombre +
                "\nIngrese su edad: ");
        int edad = Integer.parseInt(edadString);

        String salarioString = JOptionPane.showInputDialog(nombre +
                "\nIngrese su salario: ");
        float salario = Float.parseFloat(salarioString);

        float salarioCalculado = salario;
        if (edad < 17) {
            JOptionPane.showMessageDialog(null, "Lo siento, no puede trabajar.");
        } else if (edad >= 18 && edad <= 50) {
            salarioCalculado = salario + (salario * 0.05f);
        } else if (edad >= 51 && edad <= 60) {
            salarioCalculado = salario + (salario * 0.10f);
        } else {
            salarioCalculado = salario + (salario * 0.15f);
        }

        JOptionPane.showMessageDialog(null, "Su salario es: " + salarioCalculado);
    }
}
