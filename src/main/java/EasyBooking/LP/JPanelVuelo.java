package EasyBooking.LP;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.border.LineBorder;

import EasyBooking.LD.Vuelo;

import javax.swing.JButton;
import javax.swing.ImageIcon;

public class JPanelVuelo extends JPanel {

	/**
	 * Create the panel.
	 */
	public JPanelVuelo(Vuelo v) {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setSize(1064,265);
		setBackground(Color.WHITE);
		setForeground(Color.WHITE);
		setLayout(null);
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
		String horaSalida = sdf.format(v.getHora_salida());
		
		JLabel lblHoraSalida = new JLabel(horaSalida);
		lblHoraSalida.setFont(new Font("Tahoma", Font.PLAIN, 42));
		lblHoraSalida.setBounds(280, 92, 181, 36);
		add(lblHoraSalida);
		
		String horaLlegada = sdf.format(v.getHora_llegada());
		
		
		JLabel lblHoraLlegada = new JLabel(horaLlegada);
		lblHoraLlegada.setFont(new Font("Tahoma", Font.PLAIN, 42));
		lblHoraLlegada.setBounds(411, 73, 201, 75);
		add(lblHoraLlegada);
		
		JLabel lblLinea = new JLabel(" -  ");
		lblLinea.setFont(new Font("Tahoma", Font.PLAIN, 42));
		lblLinea.setBounds(380, 96, 69, 20);
		add(lblLinea);
		
		JPanel panelDeArriba = new JPanel();
		panelDeArriba.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelDeArriba.setBackground(Color.WHITE);
		panelDeArriba.setBounds(682, 0, 382, 265);
		add(panelDeArriba);
		panelDeArriba.setLayout(null);
		
		double precio=v.getPrecio();
		String precioLabel= Double.toString(precio);
		JLabel lblPrecio = new JLabel(precioLabel);
		lblPrecio.setBounds(120, 68, 156, 46);
		panelDeArriba.add(lblPrecio);
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 38));
		
		JButton btnVerVuelos = new JButton("VER VUELO ");
		btnVerVuelos.setBounds(120, 127, 156, 36);
		panelDeArriba.add(btnVerVuelos);
		btnVerVuelos.setBackground(new Color(0, 0, 128));
		btnVerVuelos.setForeground(Color.WHITE);
		btnVerVuelos.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblOrigen = new JLabel(v.getOrigen());
		lblOrigen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOrigen.setBounds(290, 144, 69, 20);
		add(lblOrigen);
		
		JLabel lblNewYork = new JLabel(v.getDestino());
		lblNewYork.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewYork.setBounds(421, 144, 102, 20);
		add(lblNewYork);
		
		JLabel lblLogoCompania = new JLabel("New label");
		lblLogoCompania.setIcon(new ImageIcon(JPanelVuelo.class.getResource("/EasyBooking/Img/eDreams.jpg")));
		lblLogoCompania.setBounds(15, 72, 181, 91);
		add(lblLogoCompania);
		
		JLabel lblQuedanDisponibles = new JLabel("Quedan        disponibles");
		lblQuedanDisponibles.setForeground(Color.GRAY);
		lblQuedanDisponibles.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblQuedanDisponibles.setBounds(30, 217, 201, 20);
		add(lblQuedanDisponibles);
		
		JLabel lblNumeroDisponible = new JLabel("10");
		lblNumeroDisponible.setForeground(Color.GRAY);
		lblNumeroDisponible.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblNumeroDisponible.setBounds(96, 217, 69, 20);
		add(lblNumeroDisponible);

	}
}
