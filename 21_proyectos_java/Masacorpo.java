import javax.swing.JOptionPane;

public class Masacorpo {

    public static void main(String[] args) {

        
        String nombre = JOptionPane.showInputDialog("Querido Paciente." 
        + "\nPor favor ingresa tu nombre:");

        
        String pesoString = JOptionPane.showInputDialog("Ingrese su peso en kilogramos: ");
        String alturaString = JOptionPane.showInputDialog("Ingrese su altura en metros: ");

     
        double peso = Double.parseDouble(pesoString);
        double altura = Double.parseDouble(alturaString);

      
        double imc = peso / altura * altura;

       
        String diagnostico = "";
        if (imc < 16) {
            diagnostico = "Criterio de ingreso en hospital";
        } else if (imc >= 16 && imc < 17) {
            diagnostico = "Infra peso";
        } else if (imc >= 17 && imc < 18) {
            diagnostico = "Bajo peso";
        } else if (imc >= 18 && imc < 25) {
            diagnostico = "Peso normal (saludable)";
        } else if (imc >= 25 && imc < 30) {
            diagnostico = "Sobrepeso (obesidad de grado I)";
        } else if (imc >= 30 && imc < 35) {
            diagnostico = "Sobrepeso crónico (obesidad de grado II)";
        } else {
            diagnostico = "Obesidad de grado III";
        }

       
        JOptionPane.showMessageDialog(null, "Hola. " + nombre +
                "\nSu índice de masa corporal es " + imc +
                "\nSu diagnóstico es " + diagnostico);
    }
}
