package EasyBooking.LP;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.ScrollPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import com.toedter.calendar.JDayChooser;

import EasyBooking.LD.Vuelo;
import EasyBooking.LN.Gestor_Vuelos;

import com.toedter.calendar.JDateChooser;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JSlider;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Principal extends JFrame {

	private JPanel contentPane;
	private static JScrollPane scrollPane;
	private static JPanel PscrollPane;
	private ArrayList<Vuelo>Lista_vuelos;
	private static JTextField txtPrecioMin;
	private static JTextField txtPrecioMax;
	private static JComboBox<String> comboBox;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Principal.class.getResource("/EasyBooking/Img/Avion.jpg")));
		setFont(new Font("Franklin Gothic Medium", Font.BOLD, 12));
		setTitle("EasyBooking");
		setForeground(Color.BLACK);
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1300, 740);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JPanel pArriba = new JPanel();
		pArriba.setBounds(0, 0, 1278, 159);
		pArriba.setBackground(new Color(0, 0, 128));
		contentPane.add(pArriba);
		pArriba.setLayout(null);
		
		JLabel lblLogo = new JLabel();
		lblLogo.setBounds(0, 0, 185, 64);
		pArriba.add(lblLogo);
		ImageIcon fot = new ImageIcon(Principal.class.getResource("/EasyBooking/Img/logo.png"));
		Icon icono = new ImageIcon(fot.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT));
		lblLogo.setIcon(icono);
		
		JDateChooser dChooser_ida = new JDateChooser();
		dChooser_ida.setBounds(861, 70, 125, 26);
		Date objDate= new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		sdf.format(objDate);
		dChooser_ida.setDate(objDate);
		pArriba.add(dChooser_ida);
		
		JDateChooser dChooser_vuelta = new JDateChooser();
		dChooser_vuelta.setBounds(1091, 70, 125, 26);
		dChooser_vuelta.setDate(objDate);
		pArriba.add(dChooser_vuelta);
		
		JLabel lblIda = new JLabel("Ida:");
		lblIda.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblIda.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIda.setLabelFor(this);
		lblIda.setForeground(Color.WHITE);
		lblIda.setBounds(777, 76, 69, 20);
		pArriba.add(lblIda);
		
		JLabel lblVuelta = new JLabel("Vuelta: ");
		lblVuelta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVuelta.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblVuelta.setForeground(Color.WHITE);
		lblVuelta.setBounds(1007, 76, 69, 20);
		pArriba.add(lblVuelta);
		
		JLabel lblOrigen = new JLabel("Origen: ");
		lblOrigen.setHorizontalAlignment(SwingConstants.RIGHT);
		lblOrigen.setForeground(Color.WHITE);
		lblOrigen.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblOrigen.setBounds(276, 76, 69, 20);
		pArriba.add(lblOrigen);
		
		JLabel lblAeropuerto_Origen = new JLabel("Madrid");
		lblAeropuerto_Origen.setForeground(Color.WHITE);
		lblAeropuerto_Origen.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAeropuerto_Origen.setBounds(360, 77, 69, 20);
		pArriba.add(lblAeropuerto_Origen);
		
		JLabel lblDestino = new JLabel("Destino: ");
		lblDestino.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDestino.setForeground(Color.WHITE);
		lblDestino.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblDestino.setBounds(475, 76, 93, 20);
		pArriba.add(lblDestino);
		
		JLabel lblAeropuerto_destino = new JLabel("New York");
		lblAeropuerto_destino.setForeground(Color.WHITE);
		lblAeropuerto_destino.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblAeropuerto_destino.setBounds(570, 76, 69, 20);
		pArriba.add(lblAeropuerto_destino);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBackground(new Color(255, 255, 255));
		btnBuscar.setBounds(1101, 114, 115, 29);	
		pArriba.add(btnBuscar);
		
		JLabel lblBuscar = new JLabel("");
		lblBuscar.setBounds(1048, 112, 38, 31);
		ImageIcon fotBuscar = new ImageIcon(Principal.class.getResource("/EasyBooking/Img/Buscar.png"));
		Icon iconoBuscar = new ImageIcon(fotBuscar.getImage().getScaledInstance(lblBuscar.getWidth(), lblBuscar.getHeight(), Image.SCALE_DEFAULT));
		lblBuscar.setIcon(iconoBuscar);
		pArriba.add(lblBuscar);
		
		JPanel pIzquierda= new JPanel();
		pIzquierda.setBounds(0, 155, 218, 529);
		pIzquierda.setBackground(new Color(0, 0, 128));
		contentPane.add(pIzquierda);
		pIzquierda.setLayout(null);
		
		JLabel lblFiltros = new JLabel("FILTROS");
		lblFiltros.setForeground(new Color(255, 255, 255));
		lblFiltros.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFiltros.setHorizontalAlignment(SwingConstants.CENTER);
		lblFiltros.setBounds(15, 16, 188, 44);
		pIzquierda.add(lblFiltros);
		
		JLabel lblPrecioMin = new JLabel("Precio Min:");
		lblPrecioMin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPrecioMin.setForeground(new Color(255, 255, 255));
		lblPrecioMin.setBounds(15, 100, 82, 30);
		pIzquierda.add(lblPrecioMin);
		
		JLabel lblDuracion = new JLabel("Hora de ida:");
		lblDuracion.setForeground(Color.WHITE);
		lblDuracion.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDuracion.setBounds(15, 182, 117, 20);
		pIzquierda.add(lblDuracion);
		
		JSlider slDuracion = new JSlider();
		slDuracion.setPaintTicks(true);
		slDuracion.setMajorTickSpacing(100000);
		slDuracion.setForeground(Color.WHITE);
		slDuracion.setBackground(new Color(0, 0, 128));
		slDuracion.setBounds(15, 218, 173, 30);
		pIzquierda.add(slDuracion);
		
		JLabel lblAerolinea = new JLabel("Aerolinea:");
		lblAerolinea.setForeground(Color.WHITE);
		lblAerolinea.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblAerolinea.setBounds(25, 264, 173, 20);
		pIzquierda.add(lblAerolinea);
		
		comboBox = new JComboBox<String>();
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setBounds(15, 302, 173, 30);
		comboBox.addItem("Iberia");
		comboBox.addItem("Vueling");
		pIzquierda.add(comboBox);
		
		JButton btnBuscar_2 = new JButton("Buscar");
		btnBuscar_2.addActionListener(e -> aplicarFiltros());
		btnBuscar_2.setBackground(Color.WHITE);
		btnBuscar_2.setBounds(73, 427, 115, 29);
		pIzquierda.add(btnBuscar_2);
		
		JLabel lblPrecio_Max = new JLabel("Precio Max:");
		lblPrecio_Max.setForeground(Color.WHITE);
		lblPrecio_Max.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblPrecio_Max.setBounds(106, 100, 97, 30);
		pIzquierda.add(lblPrecio_Max);
		
		txtPrecioMin = new JTextField();
		txtPrecioMin.setBounds(15, 140, 69, 26);
		pIzquierda.add(txtPrecioMin);
		txtPrecioMin.setColumns(10);
		
		txtPrecioMax = new JTextField();
		txtPrecioMax.setColumns(10);
		txtPrecioMax.setBounds(116, 140, 69, 26);
		pIzquierda.add(txtPrecioMax);
		
		JPanel pCentro = new JPanel();
		pCentro.setBounds(215, 155, 1063, 529);
		contentPane.add(pCentro);
		pCentro.setLayout(new BorderLayout(0, 0));
		
		PscrollPane = new JPanel();
		scrollPane = new JScrollPane(PscrollPane);
		pCentro.add(scrollPane, BorderLayout.CENTER);
		
		
		scrollPane.setViewportView(PscrollPane);
		scrollPane .getViewport().setView(PscrollPane);
		GridBagLayout gbl_PscrollPane = new GridBagLayout();
		gbl_PscrollPane.columnWidths = new int[]{0};
		gbl_PscrollPane.rowHeights = new int[]{0};
		gbl_PscrollPane.columnWeights = new double[]{Double.MIN_VALUE};
		gbl_PscrollPane.rowWeights = new double[]{Double.MIN_VALUE};
		PscrollPane.setLayout(gbl_PscrollPane);
		


		PscrollPane.repaint();
		InsertarJPanel(Gestor_Vuelos.devolver_Lista());
		PscrollPane.repaint();
		scrollPane.repaint();

		

		

		
		
		
		
	}
	/**
	 * Metodo para insertar el panel de clsJPanelVuelo
	 */
	public static void InsertarJPanel(List<Vuelo>Lista_vuelos)
	{	
		int x=0;
		int  y=50;
	
		System.out.println("Estoy aqui");
		System.out.println(Lista_vuelos.size());
		PscrollPane.removeAll();
		for( int i=0; i<Lista_vuelos.size(); i++)
		{
			JPanelVuelo panel=new JPanelVuelo(Lista_vuelos.get(i)); //objeto 
			panel.setVisible(true);
			GridBagConstraints gbc_lblFoto = new GridBagConstraints();
			gbc_lblFoto.ipadx = 1058;
			gbc_lblFoto.ipady = 265;
			gbc_lblFoto.gridx = x;
			gbc_lblFoto.gridy = y;
			PscrollPane.add(panel, gbc_lblFoto);

			y=y+265;
			
		}
		PscrollPane.repaint();
		scrollPane.repaint();
	}
	
	public static void aplicarFiltros()
	{
		String min = txtPrecioMin.getText();
		String max = txtPrecioMax.getText();
		if (min.equals("")) { min ="0"; }
		if (max.equals("")) { max ="10000"; }
		
		final double precioMin = Double.parseDouble(min);
		final double precioMax = Double.parseDouble(max);
		final String nomAerolinea = (String) comboBox.getSelectedItem();
				
		// FILTRO PARA PRECIO
		List<Vuelo>Lista_vuelos=Gestor_Vuelos.devolver_Lista();
		
		System.out.println(Lista_vuelos.size());
		Stream<Vuelo>vuelos=Lista_vuelos.stream();
		Stream<Vuelo>vuelos_filtrados= vuelos.filter(v->(v.getPrecio()>=precioMin) && v.getPrecio()<=precioMax);
		Lista_vuelos=vuelos_filtrados.collect(Collectors.toList());
				
		System.out.println(Lista_vuelos.size());
		//InsertarJPanel(Lista_vuelos);
		
		// FILTRO PARA AEROLINEA
		
		//List<Vuelo>Lista_vuelos2=Gestor_Vuelos.devolver_Lista();
		
		//System.out.println(Lista_vuelos2.size());
		Stream<Vuelo>vuelos2=Lista_vuelos.stream();
		
		
		//System.out.println(Lista_vuelos2.size());
		Stream<Vuelo>vuelos_filtrados_aerolinea= vuelos2.filter(v->v.getAerolinea().getNomAerolimea().equals(nomAerolinea));
		//Lista_vuelos2=vuelos_filtrados_aerolinea.collect(Collectors.toList());
		Lista_vuelos=vuelos_filtrados_aerolinea.collect(Collectors.toList());
				
		//System.out.println(Lista_vuelos2.size());
//		InsertarJPanel(Lista_vuelos2);
		InsertarJPanel(Lista_vuelos);
		
	}
	

	
}


