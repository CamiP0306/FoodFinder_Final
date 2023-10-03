package Usuario;

import javax.swing.border.EmptyBorder;

import BD.Conexion;
import Paginas.AcercaDe;
import Paginas.Inicio;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

import Usuario.InicioSesion;
import Usuario.Registro;

public class Formu_unirse extends JFrame {
	
	Conexion cx;

	private JPanel contentPane;
	private boolean usuvisible = false;
	private JTextField nombre;
	private JTextField direccion;
	private JTextField telefono;
	private JTextField apertura;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formu_unirse frame = new Formu_unirse();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH); //para que abra en pantalla completa
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
	public Formu_unirse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel() {
			@Override
            protected void paintComponent(Graphics g) { // Funcion para establecer imagen de fondo de la ventana
	            ImageIcon imgfondo = new ImageIcon(AcercaDe.class.getResource("/img_fondo/fondolol.jpg"));
                g.drawImage(imgfondo.getImage(), 0, 0, getWidth(), getHeight(), this);
                g.setColor(new Color(255, 255, 255, 50));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		// Creacion del panel blanco de formulario
        JPanel panel = new JPanel();
  		panel.setBackground(new Color(255, 255, 255));
  		panel.setBounds(145, 0, 770, 650);
  		panel.setLayout(null);
  		contentPane.add(panel);
  		
  	// Label de logo de food finder:
  		JLabel logo = new JLabel("");
  		logo.setIcon(new ImageIcon(Registro.class.getResource("/img_usuario/logo.png")));
  		logo.setBounds(0, 0, 226, 130);
  		panel.add(logo);
  		
  		// Label de titulo "Unirse como duenio":
  		JLabel regis = new JLabel("<html>Unirse como due\u00F1o &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;de restaurante<html>");
  		regis.setFont(new Font("Cambria Math", Font.BOLD, 42));
  		regis.setForeground(new Color(199, 59, 27));
  		regis.setBounds(331, 0, 373, 130);
  		panel.add(regis);
  		
  		JLabel lbltitulo = new JLabel("Formulario de validacion de datos:");
	    lbltitulo.setForeground(new Color(199, 59, 27));
	    lbltitulo.setFont(new Font("Cambria Math", Font.BOLD, 32));
	    lbltitulo.setBounds(25, 162, 514, 45);
	    panel.add(lbltitulo);
	    
	    //creacion de campos de texto de los datos a validar:
	    JLabel correolbl = new JLabel("Correo electronico");
	    correolbl.setForeground(new Color(199, 59, 27));
	    correolbl.setFont(new Font("Georgia", Font.PLAIN, 20));
	    correolbl.setBounds(25, 250, 170, 21);
	    panel.add(correolbl);
	    
	    JTextField correo = new JTextField();
  		correo.setForeground(new Color(148, 148, 148));
	    correo.setBackground(new Color(221, 221, 221));
	    correo.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
	    correo.setBounds(25, 271, 330, 34);
	    panel.add(correo);
	    
	    JLabel nombrelbl = new JLabel("Nombre de su lugar de comida");
	    nombrelbl.setForeground(new Color(199, 59, 27));
	    nombrelbl.setFont(new Font("Georgia", Font.PLAIN, 20));
	    nombrelbl.setBounds(25, 330, 277, 21);
	    panel.add(nombrelbl);
	    
	    nombre = new JTextField();
	    nombre.setForeground(new Color(148, 148, 148));
	    nombre.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
	    nombre.setBackground(new Color(221, 221, 221));
	    nombre.setBounds(25, 351, 330, 34);
	    panel.add(nombre);
	    
	    JLabel direccionlbl = new JLabel("Direccion del lugar de comida");
	    direccionlbl.setForeground(new Color(199, 59, 27));
	    direccionlbl.setFont(new Font("Georgia", Font.PLAIN, 20));
	    direccionlbl.setBounds(25, 410, 271, 21);
	    panel.add(direccionlbl);
	    
	    direccion = new JTextField();
	    direccion.setForeground(new Color(148, 148, 148));
	    direccion.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
	    direccion.setBackground(new Color(221, 221, 221));
	    direccion.setBounds(25, 431, 330, 34);
	    panel.add(direccion);
	    
	    JLabel telefonolbl = new JLabel("Telefono");
	    telefonolbl.setForeground(new Color(199, 59, 27));
	    telefonolbl.setFont(new Font("Georgia", Font.PLAIN, 20));
	    telefonolbl.setBounds(25, 490, 86, 21);
	    panel.add(telefonolbl);
	    
	    telefono = new JTextField();
	    telefono.setForeground(new Color(148, 148, 148));
	    telefono.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
	    telefono.setBackground(new Color(221, 221, 221));
	    telefono.setBounds(25, 511, 330, 34);
	    panel.add(telefono);
	    
	    JLabel aperturalbl = new JLabel("Horario de apertura y cierre");
	    aperturalbl.setForeground(new Color(199, 59, 27));
	    aperturalbl.setFont(new Font("Georgia", Font.PLAIN, 20));
	    aperturalbl.setBounds(25, 570, 253, 21);
	    panel.add(aperturalbl);
	    
	    apertura = new JTextField();
	    apertura.setForeground(new Color(148, 148, 148));
	    apertura.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
	    apertura.setBackground(new Color(221, 221, 221));
	    apertura.setBounds(25, 591, 330, 34);
	    panel.add(apertura);
	    
	    JLabel descripcionlbl = new JLabel("<html>Descripcion (cuente acerca de su lugar de comida, porque lo creo, hace cuanto tiempo, etc)<html>");
	    descripcionlbl.setForeground(new Color(199, 59, 27));
	    descripcionlbl.setFont(new Font("Georgia", Font.PLAIN, 20));
	    descripcionlbl.setBounds(415, 244, 330, 80);
	    panel.add(descripcionlbl);
	    
	    JTextArea descrip = new JTextArea();
	    descrip.setFont(new Font("Microsoft YaHei", Font.BOLD, 16));
	    descrip.setForeground(new Color(148, 148, 148));
	    descrip.setLineWrap(true);
	    descrip.setWrapStyleWord(true);
	    descrip.setBackground(new Color(221, 221, 221));
	    
	    //scroll para el campo de descripcion
	    JScrollPane scrollPane = new JScrollPane(descrip);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(415, 328, 330, 183);
        panel.add(scrollPane);
        
        
      //CONEXION CON LA BASE DE DATOS
  		cx = new Conexion();
  		//cx.conectar();
        
	    //boton de envio de datos de formulario
	    JButton envio = new JButton("Enviar");
	    envio.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		try {
  					String mail = correo.getText();
  	  				String user = nombre.getText();
  	  				String direc = direccion.getText();
  	  				String tel = telefono.getText();
  	  				String hora = apertura.getText();
  	  				String resumen = descrip.getText();
  	  				
  	  			// Crear una consulta SQL para insertar el nuevo usuario
  	              String query = "INSERT INTO restaurantes (Duenio, NombreRestaurante, Direccion, Telefono, Horario, DescripcionRestaurante) VALUES (?, ?, ?, ?, ?, ?)";

  	              PreparedStatement preparedStatement = cx.conectar().prepareStatement(query);
  	              preparedStatement.setString(1, mail);
  	              preparedStatement.setString(2, user);
  	              preparedStatement.setString(3, direc);
  	              preparedStatement.setString(4, tel);
  	              preparedStatement.setString(5, hora);
  	              preparedStatement.setString(6, resumen);
  	        

  	              int rowsAffected = preparedStatement.executeUpdate();

  	              if (rowsAffected > 0) {
  	                  JOptionPane.showMessageDialog(null, "REGISTRADO CORRECTAMENTE");
  	                  Inicio.main(new String[]{});
	  				  Formu_unirse.this.setVisible(false);
  	              } else {
  	                  JOptionPane.showMessageDialog(null, "ERROR EN EL REGISTRO");
  	              }

  	              // Cierra la conexión después de usarla
  	              cx.desconectar();
  	          } catch (SQLException ex) {
  	              // Manejo de excepciones, muestra un mensaje de error al usuario
  	              JOptionPane.showMessageDialog(null, "Error al registrar el usuario: " + ex.getMessage());
  	          }
	    	}
	    });
	    envio.setFont(new Font("Georgia", Font.PLAIN, 20));
  		envio.setBackground(new Color(199, 59, 27));
  		envio.setForeground(new Color(255, 255, 255));
	    envio.setBounds(633, 602, 112, 23);
	    panel.add(envio);
	    
	    //boton volver al inicio
		JButton volver = new JButton("");
  		volver.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				Inicio.main(new String[]{});
  				Formu_unirse.this.setVisible(false);
  			}
  		});
  		volver.setIcon(new ImageIcon(Registro.class.getResource("/img_usuario/flecha2.jpg")));
  		volver.setForeground(new Color(255, 255, 255));
  		volver.setBackground(new Color(199, 59, 27));
  		volver.setFont(new Font("Dialog", Font.BOLD, 15));
  		volver.setBounds(0, 0, 80, 80);
  		contentPane.add(volver);
		
		addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // Cuando la ventana se redimensiona, obt�n las dimensiones actuales del contentPane
                int nuevoAlto = contentPane.getHeight();
                int nuevoAncho = contentPane.getWidth();
                
				// Establece las coordenadas y el tama�o
                contentPane.setBounds(0, 0, nuevoAncho, nuevoAlto);//establecemos el tama�o del contentPane de acuerdo al tama�o de la pantalla
                panel.setBounds(nuevoAncho/2-385, nuevoAlto/2-325, 770, 650);
                
            }
        });
  		
	}
}