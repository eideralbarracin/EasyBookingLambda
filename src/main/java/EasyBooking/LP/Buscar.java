package EasyBooking.LP;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JSpinnerDateEditor;

import EasyBooking.LD.Aeropuerto;

import javax.swing.JButton;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.SwingConstants;
import javax.swing.DefaultComboBoxModel;

public class Buscar extends JFrame {

	private JPanel contentPane;
	private JTextField txtNumViajeros;
	private JDateChooser datechooser;
	private ArrayList<Aeropuerto>Lista_Aeropuerto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Buscar frame = new Buscar();
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
	public Buscar() {
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
		contentPane.setLayout(null);
		this.setLocationRelativeTo(null);
		
		ButtonGroup grupoIda = new ButtonGroup();
		
		JPanel pIzquierda = new JPanel();
		pIzquierda.setForeground(new Color(255, 255, 255));
		pIzquierda.setBackground(Color.WHITE);
		pIzquierda.setBounds(0, 163, 1278, 521);
		contentPane.add(pIzquierda);
		pIzquierda.setLayout(null);
		
		JLabel label_1 = new JLabel("Precio: ");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(393, 253, 139, 20);
		pIzquierda.add(label_1);
		
		JSlider slFiltroPrecio = new JSlider();
		slFiltroPrecio.setBackground(Color.WHITE);
		slFiltroPrecio.setBounds(566, 253, 200, 61);
		slFiltroPrecio.setValue(900);
		slFiltroPrecio.setToolTipText("");
		slFiltroPrecio.setPaintTicks(true);
		slFiltroPrecio.setMajorTickSpacing(1000);
		slFiltroPrecio.setPaintLabels(true);
		slFiltroPrecio.setMaximum(1000);
		pIzquierda.add(slFiltroPrecio);
		
		JLabel lblNewLabel = new JLabel("Origen:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(365, 40, 76, 20);
		pIzquierda.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		//Aqui habria que poner el nombre de lso aeropuertos leidos de la BD
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BIO"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(483, 37, 297, 26);
		pIzquierda.add(comboBox);
		datechooser = new JDateChooser(null, null, null, new JSpinnerDateEditor());
		Date objDate= new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		sdf.format(objDate);
		datechooser.setDate(objDate);
		datechooser.setBounds (800,37, 175, 26);
		pIzquierda.add(datechooser);
		
		
		JLabel lblNewLabel_1 = new JLabel("Destino:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(365, 99, 81, 20);
		pIzquierda.add(lblNewLabel_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"BCN"}));
		comboBox_1.setSelectedIndex(0);
		comboBox_1.setBounds(483, 96, 297, 26);
		pIzquierda.add(comboBox_1);
		datechooser = new JDateChooser(null, null, null, new JSpinnerDateEditor());
		datechooser.setDate(objDate);
		datechooser.setBounds (800,96, 175, 26);
		pIzquierda.add(datechooser);
		
		JRadioButton rdbtnIda = new JRadioButton("Ida");
		rdbtnIda.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnIda.setBackground(Color.WHITE);
		rdbtnIda.setBounds(570, 146, 76, 29);
		pIzquierda.add(rdbtnIda);
		
		grupoIda.add(rdbtnIda);
		
		JRadioButton rdbtnIdaVuelta = new JRadioButton("Ida y vuelta");
		rdbtnIdaVuelta.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnIdaVuelta.setBackground(Color.WHITE);
		rdbtnIdaVuelta.setBounds(762, 146, 193, 29);
		pIzquierda.add(rdbtnIdaVuelta);
		grupoIda.add(rdbtnIdaVuelta);
		
		JLabel lblNewLabel_2 = new JLabel("Numero de viajeros:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(365, 204, 167, 20);
		pIzquierda.add(lblNewLabel_2);
		
		txtNumViajeros = new JTextField();
		txtNumViajeros.setBounds(556, 201, 43, 26);
		pIzquierda.add(txtNumViajeros);
		txtNumViajeros.setColumns(2);
		txtNumViajeros.setText("0");
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setForeground(new Color(255, 255, 255));
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnBuscar.setBackground(new Color(0, 0, 128));
		btnBuscar.setBounds(849, 405, 126, 43);
		btnBuscar.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				boolean estado_rdbtn=rdbtnIdaVuelta.isSelected();
				String viajeros=txtNumViajeros.getText();
				int precio = slFiltroPrecio.getValue();
				System.out.println(estado_rdbtn);
				System.out.println(viajeros);
				System.out.println(precio);
			
				if(estado_rdbtn=false||viajeros.equals("0")||precio==0)
				{
					JOptionPane.showMessageDialog(null,"Por favor, rellene todos los campos");
					return ;
				}
				else
				{
					Principal a = new Principal();
					a.setVisible(true);
					setVisible(false);
					
				}
			}
		});
		pIzquierda.add(btnBuscar);
		
		JPanel pNorte = new JPanel();
		pNorte.setBackground(new Color(0, 0, 128));
		pNorte.setBounds(0, 0, 1278, 163);
		contentPane.add(pNorte);
		pNorte.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setBounds(15, 16, 202, 73);
		ImageIcon fot = new ImageIcon(Buscar.class.getResource("/EasyBooking/Img/logo.png"));
		Icon icono = new ImageIcon(fot.getImage().getScaledInstance(lblLogo.getWidth(), lblLogo.getHeight(), Image.SCALE_DEFAULT));
		lblLogo.setIcon(icono);
		pNorte.add(lblLogo);
		
		
	}

}
