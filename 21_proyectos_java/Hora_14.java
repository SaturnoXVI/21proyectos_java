import javax.swing.JOptionPane;

public class Hora_14 {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Hola user." + "\n"
                + "Ingrese su nombre por favor. ");

        String horaString = JOptionPane.showInputDialog(nombre + "\nIngrese la hora (hh:mm:ss): ");

        String[] horaParts = horaString.split(":");
        int hora = Integer.parseInt(horaParts[0]);
        int minutos = Integer.parseInt(horaParts[1]);
        int segundos = Integer.parseInt(horaParts[2]);

        segundos++;
        if (segundos == 60) {
            minutos++;
            segundos = 0;
        }
        if (minutos == 60) {
            hora++;
            minutos = 0;
        }

        String horaNueva = hora + ":" + minutos + ":" + segundos;

        JOptionPane.showMessageDialog(null, nombre +
                "\nLa hora siguiente es " + horaNueva);
    }
}
