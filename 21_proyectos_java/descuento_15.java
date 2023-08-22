import javax.swing.JOptionPane;

public class descuento_15 {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Hola cliente." + "\n"
                + "Ingrese su nombre por favor. ");

        String valorString = JOptionPane.showInputDialog("Ingrese el valor de la compra: ");
        int valor = Integer.parseInt(valorString);

        if (valor > 300) {
            float descuento = 0.20f;
            float montoDescuento = valor * descuento;
            float totalPagar = valor - montoDescuento;

            JOptionPane.showMessageDialog(null, "El monto del descuento es " + montoDescuento + ". El total a pagar es "
                    + totalPagar + ". Gracias por su compra, " + nombre + "!");
        } else {
            JOptionPane.showMessageDialog(null, "No hay descuento disponible. El total a pagar es " + valor
                    + ". Gracias por su compra, " + nombre + "!");
        }
    }
}
