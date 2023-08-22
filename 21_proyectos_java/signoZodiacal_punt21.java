import javax.swing.JOptionPane;

public class signoZodiacal_punt21 {

    public static void main(String[] args) {

       
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");

      
        String mesString = JOptionPane.showInputDialog(nombre + 
        "\nIngrese su mes de nacimiento: ");
        int mes = Integer.parseInt(mesString);
        String diaString = JOptionPane.showInputDialog(nombre + 
        "\nIngrese su día de nacimiento: ");
        int dia = Integer.parseInt(diaString);

       
        String signoZodiacal = "";
        switch (mes) {
            case 1:
                if (dia >= 20) {
                    signoZodiacal = "Acuario";
                } else {
                    signoZodiacal = "Capricornio";
                }
                break;
            case 2:
                if (dia >= 19) {
                    signoZodiacal = "Piscis";
                } else {
                    signoZodiacal = "Acuario";
                }
                break;
            case 3:
                if (dia >= 21) {
                    signoZodiacal = "Aries";
                } else {
                    signoZodiacal = "Piscis";
                }
                break;
            case 4:
                if (dia >= 20) {
                    signoZodiacal = "Tauro";
                } else {
                    signoZodiacal = "Aries";
                }
                break;
            case 5:
                if (dia >= 21) {
                    signoZodiacal = "Géminis";
                } else {
                    signoZodiacal = "Tauro";
                }
                break;
            case 6:
                if (dia >= 21) {
                    signoZodiacal = "Cáncer";
                } else {
                    signoZodiacal = "Géminis";
                }
                break;
            case 7:
                if (dia >= 22) {
                    signoZodiacal = "Leo";
                } else {
                    signoZodiacal = "Cáncer";
                }
                break;
            case 8:
                if (dia >= 23) {
                    signoZodiacal = "Virgo";
                } else {
                    signoZodiacal = "Leo";
                }
                break;
            case 9:
                if (dia >= 23) {
                    signoZodiacal = "Libra";
                } else {
                    signoZodiacal = "Virgo";
                }
                break;
            case 10:
                if (dia >= 23) {
                    signoZodiacal = "Escorpio";
                } else {
                    signoZodiacal = "Libra";
                }
                break;
            case 11:
                if (dia >= 22) {
                    signoZodiacal = "Sagitario";
                } else {
                    signoZodiacal = "Escorpio";
                }
                break;
            case 12:
                if (dia >= 22) {
                    signoZodiacal = "Capricornio";
                } else {
                    signoZodiacal = "Sagitario";
                }
                break;
        }

        
        JOptionPane.showMessageDialog(null, "Tu signo zodiacal es " + signoZodiacal);
    }
}
