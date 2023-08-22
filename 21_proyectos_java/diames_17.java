import javax.swing.JOptionPane;

public class diames_17 {

    public static void main(String[] args) {

     
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");

        String mesString = JOptionPane.showInputDialog(nombre + "\nIngrese un número entre 1 y 12 para el mes: ");
        int mes = Integer.parseInt(mesString);

        
        switch (mes) {
            case 1:
                JOptionPane.showMessageDialog(null, "Enero tiene 31 días.");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Febrero tiene 28 días en años no bisiestos y 29 días en años bisiestos.");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Marzo tiene 31 días.");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Abril tiene 30 días.");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Mayo tiene 31 días.");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Junio tiene 30 días.");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Julio tiene 31 días.");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Agosto tiene 31 días.");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Septiembre tiene 30 días.");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Octubre tiene 31 días.");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "Noviembre tiene 30 días.");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "Diciembre tiene 31 días.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "El número ingresado no es un mes válido.");
                break;
        }
    }
}
