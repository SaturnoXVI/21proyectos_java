import javax.swing.JOptionPane;

public class Notas {

    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Estudiante o Profesor" +
                "\nIngrese su nombre: ");

        String notaString = JOptionPane.showInputDialog(nombre +
                "\nIngrese una nota del 0 al 10: ");

        int nota = Integer.parseInt(notaString);

        String calificacion = "";
        if (nota < 6) {
            calificacion = "Insuficiente";
        } else if (nota < 7) {
            calificacion = "Suficiente";
        } else if (nota < 8) {
            calificacion = "Bien";
        } else if (nota < 9) {
            calificacion = "Notable";
        } else {
            calificacion = "Sobresaliente";
        }

        JOptionPane.showMessageDialog(null, nombre +
                "\nSu calificación es " + calificacion);
    }
}
