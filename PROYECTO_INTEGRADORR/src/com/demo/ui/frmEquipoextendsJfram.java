package com.demo.ui;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.demo.entidades.Equipo;
import com.demo.repository.EquipoRepository;

public class frmEquipoextendsJfram {

private EquipoRepository clienteRepository=new EquipoRepository();
	
	private JPanel contentPane;
	private JTextField txtNombredelequipo;
	private JTextField txtNombredelcapitan;
	private JTextField txtApellidosdelcapitan;
	private JTextField txtnumerodeintegrantedelequipo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmEquipo frame = new frmEquipo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void frmCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombredelequipo = new JTextField();
		txtNombredelequipo.setBounds(119, 37, 146, 20);
		contentPane.add(txtNombredelequipo);
		txtNombredelequipo.setColumns(10);
		
		txtNombredelcapitan = new JTextField();
		txtNombredelcapitan.setBounds(119, 68, 146, 20);
		contentPane.add(txtNombredelcapitan);
		txtNombredelcapitan.setColumns(10);
		
		txtApellidosdelcapitan = new JTextField();
		txtApellidosdelcapitan.setBounds(119, 11, 146, 20);
		contentPane.add(txtApellidosdelcapitan);
		txtApellidosdelcapitan.setColumns(10);
		
		txtnumerodeintegrantedelequipo = new JTextField();
		txtnumerodeintegrantedelequipo.setBounds(119, 99, 143, 20);
		contentPane.add(txtnumerodeintegrantedelequipo);
		txtnumerodeintegrantedelequipo.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int edad=Integer.parseInt(txtnumerodeintegrantedelequipo.getText());
				Equipo cl=new Equipo(txtNombredelequipo.getText(),
						txtNombredelequipo.getText(),txtNombredelcapitan.getText(), edad);
				
				clienteRepository.ingresar(cl);
				
			}
		});
		btnGuardar.setBounds(119, 134, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblApellidosdelcapitan = new JLabel("Apellidosdelcapitan\u00F3n");
		Component lblApellidosdelcapitann = null;
		lblApellidosdelcapitann.setBounds(10, 11, 94, 20);
		contentPane.add(lblApellidosdelcapitan);
		
		JLabel lblNewLabel = new JLabel("Nombredelcapitan");
		lblNewLabel.setBounds(10, 40, 89, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombredelcapitan");
		lblNewLabel_1.setBounds(10, 71, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblEdad = new JLabel("numerodeintegrantedelequipo");
		lblEdad.setBounds(10, 102, 89, 14);
		contentPane.add(lblEdad);
		
		JButton btnMostrar = new JButton("Mostrar");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ArrayList<Equipo> temp=clienteRepository.getEquipos();
				
				for(int i=0;i<temp.size();i++){
					System.out.println(temp.get(i));
				}
			}
		});
		btnMostrar.setBounds(119, 168, 89, 23);
		contentPane.add(btnMostrar);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Equipo temp=clienteRepository.getEquipo(txtApellidosdelcapitan.getText());
				txtNombredelcapitan.setText(temp.getNombredelcapitan());
				txtnumerodeintegrantedelequipo.setText(temp.getnumerodeintegrantedelequipo()+"");
				txtNombredelcapitan.setText(temp.getNombredelcapitan());
			}
		});
		btnBuscar.setBounds(275, 10, 89, 23);
		contentPane.add(btnBuscar);
	}

	private void setContentPane(JPanel contentPane2) {
		// TODO Auto-generated method stub
		
	}

	private void setBounds(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}
}
