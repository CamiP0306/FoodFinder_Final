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
import Usuario.Registro;
import Paginas.Restaurantes;
import Paginas.Sesion;
import Paginas.AcercaDe;

public class InicioSesion extends JFrame {
	
	Conexion cx;

	private JPanel contentPane;
	private JTextField correo;
	private JPasswordField contra;
	private JButton entrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesion frame = new InicioSesion();
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
	
	// funcion de foco para ocultar el texto inicial del textfield "correo", para que al se�alarlos desaparezca
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
	
	public InicioSesion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
		contentPane = new JPanel() {
			@Override
            protected void paintComponent(Graphics g) { 
                super.paintComponent(g);
                ImageIcon imgfondo = new ImageIcon(Registro.class.getResource("/img_fondo/fondolol.jpg"));
                g.drawImage(imgfondo.getImage(), 0, 0, getWidth(), getHeight(), this);
                g.setColor(new Color(255, 255, 255, 50));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Creacion del panel blanco de inicio de sesion
        JPanel panelsesion = new JPanel();
  		panelsesion.setBackground(new Color(255, 255, 255));
  		panelsesion.setLayout(null);
  		
  		contentPane.add(panelsesion);
  		
  		// Label de logo de food finder:
  		JLabel logo = new JLabel("");
  		logo.setIcon(new ImageIcon(InicioSesion.class.getResource("/img_usuario/logo.png")));
  		logo.setBounds(95, 0, 248, 130);
  		panelsesion.add(logo);
  		
  		// Label de titulo "Iniciar sesion":
  		JLabel regis = new JLabel("Iniciar sesion");
  		regis.setFont(new Font("Cambria Math", Font.BOLD, 38));
  		regis.setForeground(new Color(199, 59, 27));
  		regis.setBounds(95, 145, 248, 57);
  		panelsesion.add(regis);

  		//declaracion de textfield de correo y llamada de funcion para establecer el dise�o del mismo
  		correo = new JTextField();
  		configurarTextField(correo, "Correo electronico");
  		correo.setBounds(45, 235, 330, 34);

  		panelsesion.add(correo);
  		
  		contra = new JPasswordField();
  		contra.setEchoChar((char) 0);
  		contra.setText("Contrasenia");
  		contra.setFont(new Font("Microsoft YaHei", Font.BOLD, 20));  //declaracion de passwordfield de contrase�a
  		contra.setForeground(new Color(148, 148, 148));
  		contra.setBackground(new Color(221, 221, 221));
  		contra.setBounds(45, 345, 296, 34);
  		panelsesion.add(contra);
  		
  		// declaracion de botones para ocultar o mostrar contraseñas:
  		JButton verCont = new JButton("");
  		verCont.setForeground(new Color(221, 221, 221));
  		verCont.setBackground(new Color(221, 221, 221));
  		verCont.setIcon(new ImageIcon(InicioSesion.class.getResource("/img_usuario/ojo1.jpg")));
  		verCont.setBounds(340, 345, 34, 33);
  		panelsesion.add(verCont);
  		panelsesion.setComponentZOrder(verCont, 4);
  		
  		JButton ocultarCont = new JButton("");
  		ocultarCont.setIcon(new ImageIcon(InicioSesion.class.getResource("/img_usuario/ojo2.jpg")));
  		ocultarCont.setVisible(false);
  		ocultarCont.setBounds(340, 345, 34, 33);
  		panelsesion.add(ocultarCont);
  		
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
  		
  	// funcion de foco para ocultar los textos iniciales de los password de registro, para que al se�alarlos desaparezcan
  		FocusListener focuscontrasenia = new FocusListener() {
  		    @Override
  		    public void focusGained(FocusEvent e) {
  		    	panelsesion.setComponentZOrder(verCont, 4);
  		        JPasswordField aux1 = (JPasswordField) e.getSource();
  		        if (String.valueOf(aux1.getText()).equals("Contrasenia")) {
  		        	aux1.setEchoChar('*');
  		        	aux1.setText("");
  		        }
  		        if (ocultarCont.isVisible() && aux1==contra) {
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
  		        }
  		    }
  		};
        contra.addFocusListener(focuscontrasenia);
        
        //CONEXION CON LA BASE DE DATOS
  		cx = new Conexion();
  		//cx.conectar();
        
        // Declaracion del resto de elementos de ventana:
        entrar = new JButton("Entrar");
        entrar.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				try {
  					String mail = correo.getText();
  	  				String password = String.valueOf(contra.getPassword());
  	  				
  	  				String query = "SELECT *FROM usuarios WHERE Correo = '"+mail+"' and Contrasenia = '"+password+"'";
  					
					Statement st = cx.conectar().createStatement();
					
					ResultSet rs = st.executeQuery(query);
					
					if(rs.next()) {
						JOptionPane.showMessageDialog(null, "SE INICIO SESION CORRECTAMENTE");
						Sesion.setusuRegis(true);
						Inicio.main(new String[]{});
		  				InicioSesion.this.setVisible(false);
					}else {
						JOptionPane.showMessageDialog(null, "EL USUARIO O LA CONTRASE�A PUEDEN ESTAR INCORRECTOS, INTENTE DE NUEVO");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
  			}
  		});
  		entrar.setFont(new Font("Georgia", Font.BOLD, 20));
  		entrar.setBackground(new Color(199, 59, 27));
  		entrar.setForeground(new Color(255, 255, 255));
  		entrar.setBounds(25, 455, 370, 45);
  		panelsesion.add(entrar);
  		
  		JLabel label1 = new JLabel("No tiene una cuenta?");
  		label1.setFont(new Font("Georgia", Font.BOLD, 15));
  		label1.setForeground(new Color(148, 148, 148));
  		label1.setBackground(new Color(255, 255, 255));
  		label1.setBounds(25, 515, 165, 17);
  		panelsesion.add(label1);
  		
  		JButton iniciarsesion = new JButton("Registrarse");
  		iniciarsesion.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				Registro.main(new String[]{});
  				InicioSesion.this.setVisible(false);
  			}
  		});
  		iniciarsesion.setBackground(new Color(255, 255, 255));
  		iniciarsesion.setFont(new Font("Georgia", Font.BOLD, 15));
  		iniciarsesion.setBounds(185, 515, 146, 17);
  		panelsesion.add(iniciarsesion);
  		
  		JButton volver = new JButton("");
  		volver.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				Inicio.main(new String[]{});
  				InicioSesion.this.setVisible(false);
  			}
  		});
  		volver.setIcon(new ImageIcon(InicioSesion.class.getResource("/img_usuario/flecha2.jpg")));
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
				panelsesion.setBounds(nuevoAncho/2-210, nuevoAlto/2-317, 420, 635); 
            }
        });
	}
}