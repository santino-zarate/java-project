
// Nombre y Apellido: Zarate Gonzalez Santino Joel
// Programacion IV
// UNLaR - Sede Chamical

import javax.swing.JButton;     // Botón clickeable
import javax.swing.JFrame;      // La ventana principal del programa
import javax.swing.JLabel;      // Texto fijo, no editable por el usuario
import javax.swing.JOptionPane; // Ventanas emergentes de diálogo (mensajes, alertas)
import javax.swing.JPanel;      // Contenedor donde se agrupan otros componentes
import javax.swing.JTextField;  // Caja de texto donde el usuario puede escribir
import java.awt.Font;           // Para personalizar tipografía, tamaño y estilo del texto

// Cambio a  "App" para que coinsida con el archivo
public class App {

    public static void main(String[] args) {

        // MODIFICACION 1: titulo personalizado 
        JFrame ventana = new JFrame("TP Java - Santino");

        // MODIFICACION 2: tamaño de la ventana 
        ventana.setSize(450, 220);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // MODIFICACION 3: posicion inicial de la ventana 
        ventana.setLocation(200, 150);

        JPanel panel = new JPanel();

        // >>> MODIFICACIÓN 4: nuevo componente gráfico (JLabel) 
        JLabel infoEstudiante = new JLabel("TP Programación IV - UNLaR Sede Chamical");

        infoEstudiante.setFont(new Font("SansSerif", Font.ITALIC, 11));

        JLabel etiqueta = new JLabel("Tu nombre:");
        JTextField cajaTexto = new JTextField(15);
        JButton boton = new JButton("Saludar");

        boton.addActionListener(e -> {
            String texto = cajaTexto.getText();

            JOptionPane.showMessageDialog(ventana, "¡Hola, " + texto + "!");
        });

        panel.add(infoEstudiante);
        panel.add(etiqueta);
        panel.add(cajaTexto);
        panel.add(boton);

        ventana.add(panel);

        ventana.setVisible(true);
    }
}