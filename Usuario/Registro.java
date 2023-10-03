package Usuario;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import BD.Conexion;
import Paginas.Inicio;
import Paginas.Sesion;

public class Registro extends JFrame {
	
	Conexion cx;
	private JPanel contentPane;
	private JTextField usu;
	private JTextField correo;
	private JPasswordField contra;
	private JPasswordField conf;
	private JButton verConf;
	private JButton ocultarConf;
	private JButton crear;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	
	// funcion de foco para ocultar los textos iniciales de los textfields de registro, para que al se�alarlos desaparezcan
		private void configurarTextField(JTextField textField, String textoInicial) {
			    textField.setForeground(new Color(148, 148, 148));
			    textField.setBackground(new Color(221, 221, 221));
			    textField.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));
			    textField.setText(textoInicial);
			    textField.setColumns(10);
			    
			    textField.addFocusListener(new FocusListener() {
		            @Override
		            public void focusGained(FocusEvent e) {
		                if (textField.getText().equals(textoInicial)) {
		                    textField.setText("");
		                }
		            }

		            @Override
		            public void focusLost(FocusEvent e) {
		                if (textField.getText().isEmpty()) {
		                    textField.setText(textoInicial);
		                }
		            }
		        });
			}
		
	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		contentPane = new JPanel() {
			@Override
            protected void paintComponent(Graphics g) { 
                super.paintComponent(g);
                ImageIcon imgfondo = new ImageIcon(InicioSesion.class.getResource("/img_fondo/fondolol.jpg"));
                g.drawImage(imgfondo.getImage(), 0, 0, getWidth(), getHeight(), this);
                g.setColor(new Color(255, 255, 255, 50));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);	
		
		// Creacion del panel blanco de registro
        JPanel panel1 = new JPanel();
  		panel1.setBackground(new Color(255, 255, 255));
  		panel1.setLayout(null);
  		contentPane.add(panel1);
  		
  		// Label de logo de food finder:
  		JLabel logo = new JLabel("");
  		logo.setIcon(new ImageIcon(Registro.class.getResource("/img_usuario/logo.png")));
  		logo.setBounds(95, 0, 248, 130);
  		panel1.add(logo);
  		
  		// Label de titulo "Registro":
  		JLabel regis = new JLabel("Registro");
  		regis.setFont(new Font("Cambria Math", Font.BOLD, 38));
  		regis.setForeground(new Color(199, 59, 27));
  		regis.setBounds(139, 130, 154, 57);
  		panel1.add(regis);
  		
  	//declaracion de textfields de registro y llamada de funcion para establecer los dise�os de ellos
  		usu = new JTextField();
  		configurarTextField(usu, "Nombre de usuario");
  		usu.setBounds(45, 195, 330, 34);

  		correo = new JTextField();
  		configurarTextField(correo, "Correo electronico");
  		correo.setBounds(45, 271, 330, 34);
 
  		panel1.add(usu);
  		panel1.add(correo);
  		
  		contra = new JPasswordField();
  		contra.setEchoChar((char) 0);
  		contra.setText("Contrasenia");
  		contra.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));  //declaracion de passwordfield de contrase�a
  		contra.setForeground(new Color(148, 148, 148));
  		contra.setBackground(new Color(221, 221, 221));
  		contra.setBounds(45, 347, 296, 34);
  		panel1.add(contra);
  		
  		conf = new JPasswordField();
  		conf.setEchoChar((char) 0);
  		conf.setText("Confirmar contrasenia");
  		conf.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));   //declaracion de passwordfield de confirmacion de contrase�a
  		conf.setForeground(new Color(148, 148, 148));
  		conf.setBackground(new Color(221, 221, 221));
  		conf.setBounds(45, 423, 296, 34);
  		panel1.add(conf);
  		
  		// declaracion de botones para ocultar o mostrar contrase�as:
  		JButton verCont = new JButton("");
  		verCont.setForeground(new Color(221, 221, 221));
  		verCont.setBackground(new Color(221, 221, 221));
  		verCont.setIcon(new ImageIcon(Registro.class.getResource("/img_usuario/ojo1.jpg")));
  		verCont.setBounds(340, 347, 34, 33);
  		panel1.add(verCont);
  		panel1.setComponentZOrder(verCont, 4);
  		
  		JButton ocultarCont = new JButton("");
  		ocultarCont.setIcon(new ImageIcon(Registro.class.getResource("/img_usuario/ojo2.jpg")));
  		ocultarCont.setVisible(false);
  		ocultarCont.setBounds(340, 347, 34, 33);
  		panel1.add(ocultarCont);
  		
  		verConf = new JButton("");
  		verConf.setIcon(new ImageIcon(Registro.class.getResource("/img_usuario/ojo1.jpg")));
  		verConf.setBounds(340, 423, 34, 33);
  		panel1.add(verConf);
  		
  		ocultarConf = new JButton("");
  		ocultarConf.setIcon(new ImageIcon(Registro.class.getResource("/img_usuario/ojo2.jpg")));
  		ocultarConf.setVisible(false);
  		ocultarConf.setBounds(340, 423, 34, 33);
  		panel1.add(ocultarConf);
  		
  	//Funcion para mostrar u ocultar texto del passwordfield de contrase�a:
  		verCont.addActionListener(new ActionListener() {
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				if(!contra.getText().equals("Contrasenia")) {
  					contra.setEchoChar((char) 0);
  	  				verCont.setVisible(false);
  	  				ocultarCont.setVisible(true);
  				}
  			}
  		});
  		ocultarCont.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				if(!contra.getText().equals("Contrasenia")) {
  					contra.setEchoChar('*');
  	  				verCont.setVisible(true);
  	  				ocultarCont.setVisible(false);
  				}
  			}
  		});
  		
  	//Funcion para mostrar u ocultar texto del passwordfield de confirmacion de contrase�a:
  		verConf.addActionListener(new ActionListener() {
  			@Override
  			public void actionPerformed(ActionEvent e) {
  				if(!conf.getText().equals("Confirmar contrasenia")) {
  					conf.setEchoChar((char) 0);
  	  				verConf.setVisible(false);
  	  				ocultarConf.setVisible(true);
  				}
  			}
  		});
  		ocultarConf.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				if(!conf.getText().equals("Confirmar contrasenia")) {
  					conf.setEchoChar('*');
  	  				verConf.setVisible(true);
  	  				ocultarConf.setVisible(false);
  				}
  			}
  		});
  		
  	// funcion de foco para ocultar los textos iniciales de los password de registro, para que al se�alarlos desaparezcan
  		FocusListener focuscontrasenia = new FocusListener() {
  		    @Override
  		    public void focusGained(FocusEvent e) {
  		    	panel1.setComponentZOrder(verCont, 4);
  		        JPasswordField aux1 = (JPasswordField) e.getSource();
  		        if (String.valueOf(aux1.getText()).equals("Contrasenia") || String.valueOf(aux1.getText()).equals("Confirmar contrasenia")) {
  		        	aux1.setEchoChar('*');
  		        	aux1.setText("");
  		        }
  		        if (ocultarCont.isVisible() && aux1==contra) {
  		        	aux1.setEchoChar((char) 0);
  		        }
  		        else if (ocultarConf.isVisible() && aux1==conf) {
		        	aux1.setEchoChar((char) 0);
		        }
  		    }
  		    @Override
  		    public void focusLost(FocusEvent e) {
  		        JPasswordField aux1 = (JPasswordField) e.getSource();
  		        if (String.valueOf(aux1.getText()).isEmpty()) {
  		        	aux1.setEchoChar((char) 0);
  		        	if(aux1==contra) {
  	  		            aux1.setText("Contrasenia");
  		        	}
  		        	if(aux1==conf) {
  	  		            aux1.setText("Confirmar contrasenia");
  		        	}
  		        }
  		    }
  		};
        contra.addFocusListener(focuscontrasenia);  //se agrega el focus que tendran los jpassword
        conf.addFocusListener(focuscontrasenia);
        
      //CONEXION CON LA BASE DE DATOS
      		cx = new Conexion();
      		//cx.conectar();
        
     // Declaracion del resto de elementos de ventana:
        crear = new JButton("CREAR CUENTA");
        crear.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				try {
  					String mail = correo.getText();
  	  				String user = usu.getText();
  	  				String password = String.valueOf(contra.getPassword());
  	  				
  	  			// Crear una consulta SQL para insertar el nuevo usuario
  	              String query = "INSERT INTO usuarios (Correo, Nombre, Contrasenia) VALUES (?, ?, ?)";

  	              PreparedStatement preparedStatement = cx.conectar().prepareStatement(query);
  	              if(!new String(usu.getText()).equals(new String("Nombre de usuario"))) {
  	              preparedStatement.setString(1, mail);
  	              }
  	              if(!new String(correo.getText()).equals(new String("Correo electronico"))) {
  	              preparedStatement.setString(2, user);
  	              }
  	              if(new String(conf.getPassword()).equals(password)) {
  	  	            	preparedStatement.setString(3, password);
  	              }

  	              int rowsAffected = preparedStatement.executeUpdate();

  	              if(rowsAffected > 0) {
	            		JOptionPane.showMessageDialog(null, "REGISTRADO CORRECTAMENTE");
	            		Sesion.setusuRegis(true);
	            		Inicio.main(new String[]{});
		  				Registro.this.setVisible(false);
		  				
		  				System.out.println("usuario: "+ user);
	              }
  	              else {
  	                  JOptionPane.showMessageDialog(null, "ERROR EN EL REGISTRO");
  	              }

  	              // Cierra la conexión después de usarla
  	              cx.desconectar();
  	          } catch (SQLException ex) {
  	              // Manejo de excepciones, muestra un mensaje de error al usuario
  	              JOptionPane.showMessageDialog(null, "ALGUN DATO ESTA VACIO, O EL CORREO O USUARIO QUE INGRESO YA ESTA REGISTRADO, INTENTE DE NUEVO");
  	          }
  			}

  		});
  		crear.setFont(new Font("Georgia", Font.BOLD, 20));
  		crear.setBackground(new Color(199, 59, 27));
  		crear.setForeground(new Color(255, 255, 255));
  		crear.setBounds(25, 500, 370, 45);
  		panel1.add(crear);
  		
  		JLabel label1 = new JLabel("Ya tiene cuenta?");
  		label1.setFont(new Font("Georgia", Font.BOLD, 15));
  		label1.setForeground(new Color(148, 148, 148));
  		label1.setBackground(new Color(255, 255, 255));
  		label1.setBounds(25, 560, 125, 17);
  		panel1.add(label1);
  		
  		JButton iniciarsesion = new JButton("Iniciar sesion");
  		iniciarsesion.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				InicioSesion.main(new String[]{});
  				Registro.this.setVisible(false);
  			}
  		});
  		iniciarsesion.setBackground(new Color(255, 255, 255));
  		iniciarsesion.setFont(new Font("Georgia", Font.BOLD, 15));
  		iniciarsesion.setBounds(149, 560, 146, 17);
  		panel1.add(iniciarsesion);
  		
  		JButton volver = new JButton("");
  		volver.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				Inicio.main(new String[]{});
  				Registro.this.setVisible(false);
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
                // Cuando la ventana se redimensiona, obtén las dimensiones actuales del contentPane
                int nuevoAlto = contentPane.getHeight();
                int nuevoAncho = contentPane.getWidth();         
                
				// Establece las coordenadas y el tamaño
                contentPane.setBounds(0, 0, nuevoAncho, nuevoAlto);//establecemos el tamaño del contentPane de acuerdo al tamaño de la pantalla
				panel1.setBounds(nuevoAncho/2-210, nuevoAlto/2-317, 420, 635);   
            }
        });
	}
}