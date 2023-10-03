package Paginas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.border.EmptyBorder;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ActionEvent;

import BD.Conexion;
import Paginas.Inicio;
import Paginas.Restaurantes;
import Paginas.AcercaDe;
import Usuario.Formu_unirse;
import Usuario.InicioSesion;
import Usuario.Registro;
import Paginas.Sesion;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private boolean usuvisible = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
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
		
		JPanel panel_arriba = new JPanel();
		panel_arriba.setBackground(new Color(199, 59, 27));

		contentPane.add(panel_arriba);
		panel_arriba.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Inicio.class.getResource("/img_fondo/logo.PNG")));
		lblLogo.setBounds(0, 0, 208, 82);
		panel_arriba.add(lblLogo);
		
		
		//USUARIO PANEL
		
				//Elementos de panel de usuario para inicio de sesion y registro:
		        JPanel panelusu = new JPanel();
		        panelusu.setBackground(new Color(255, 255, 255));
		        panelusu.setBounds(172, 72, 184, 257);
		        contentPane.add(panelusu);
		        panelusu.setLayout(null);
		        panelusu.setVisible(usuvisible);
		       
		        JLabel usuimagen = new JLabel("");
		        usuimagen.setIcon(new ImageIcon(Inicio.class.getResource("/img_usuario/usuario blanco.jpg")));
		        usuimagen.setBounds(58, 11, 72, 75);
		        panelusu.add(usuimagen);
		       
		        JLabel entrar = new JLabel("Entrar a food finder:");
		        entrar.setFont(new Font("Georgia", Font.PLAIN, 15));
		        entrar.setBounds(20, 95, 144, 14);
		        panelusu.add(entrar);
		       
		        JButton regist = new JButton("Registrarse");
		        regist.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        Registro.main(new String[]{});
		        Inicio.this.setVisible(false);
		        }
		        });
		        regist.setFont(new Font("Georgia", Font.BOLD, 11));
		        regist.setBackground(new Color(199, 59, 27));
		        regist.setForeground(new Color(255, 255, 255));
		        regist.setBounds(37, 218, 110, 23);
		        panelusu.add(regist);
		       
		        JButton inic = new JButton("Iniciar sesion");
		        inic.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        InicioSesion.main(new String[]{});
		        Inicio.this.setVisible(false);
		        }
		        });
		        inic.setFont(new Font("Georgia", Font.BOLD, 13));
		        inic.setBackground(new Color(199, 59, 27));
		     	inic.setForeground(new Color(255, 255, 255));
		        inic.setBounds(17, 128, 150, 40);
		        panelusu.add(inic);
		        
		        JLabel labelcuent = new JLabel("No tiene una cuenta?");
		        labelcuent.setFont(new Font("Georgia", Font.PLAIN, 11));
		        labelcuent.setBounds(32, 193, 128, 14);
		        panelusu.add(labelcuent);
		        
		        JLabel linea = new JLabel("");
		        linea.setForeground(new Color(192, 192, 192));
		        linea.setBackground(new Color(0, 0, 0));
		        linea.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
		        linea.setFont(new Font("Georgia", Font.PLAIN, 16));
		        linea.setBounds(0, 185, 184, 1);
		        panelusu.add(linea);
		       
		        //boton de usuario para abrir y cerrar panel de inicio y registro de sesion:
		        JButton btnUsu = new JButton("");
		        btnUsu.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        usuvisible=!usuvisible;
		                panelusu.setVisible(usuvisible);
		        }
		        });
		        btnUsu.setIcon(new ImageIcon(Inicio.class.getResource("/img_fondo/usuario.PNG")));
		        btnUsu.setBounds(1245, 0, 111, 82);
		        panel_arriba.add(btnUsu);   
		        
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio.main(new String[]{});
				Inicio.this.setVisible(false);
			}
		});
		btnInicio.setBackground(new Color(0, 0, 0));
		btnInicio.setForeground(Color.WHITE);
		btnInicio.setFont(new Font("Mangal", Font.PLAIN, 20));
		btnInicio.setBounds(369, 24, 214, 36);
		panel_arriba.add(btnInicio);
		
		JButton btnRestaurantes = new JButton("Restaurantes");
		btnRestaurantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restaurantes.main(new String[]{});
				Inicio.this.setVisible(false);
			}
		});
		btnRestaurantes.setForeground(Color.WHITE);
		btnRestaurantes.setFont(new Font("Mangal", Font.PLAIN, 20));
		btnRestaurantes.setBackground(new Color(0, 0, 0));
		btnRestaurantes.setBounds(581, 24, 214, 36);
		panel_arriba.add(btnRestaurantes);
		
		JButton btnAcercaDe = new JButton("Acerca De");
		btnAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AcercaDe.main(new String[]{});
				Inicio.this.setVisible(false);
			}
		});
		btnAcercaDe.setForeground(Color.WHITE);
		btnAcercaDe.setFont(new Font("Mangal", Font.PLAIN, 20));
		btnAcercaDe.setBackground(new Color(0, 0, 0));
		btnAcercaDe.setBounds(793, 24, 214, 36);
		panel_arriba.add(btnAcercaDe);
		
		//PANEL DE ABAJO
		JPanel panel_abajo = new JPanel();
        panel_abajo.setBackground(new Color(199, 59, 27));
        contentPane.add(panel_abajo);
        panel_abajo.setLayout(null);
       
        JLabel lblLogo1 = new JLabel("");
        panel_abajo.add(lblLogo1);
        lblLogo1.setIcon(new ImageIcon(Inicio.class.getResource("/img_fondo/logo.png")));
        lblLogo1.setFont(new Font("Dialog", Font.PLAIN, 11));
       
        JLabel labelCR = new JLabel("\u00A9 2023 Food Finder Inc.");
        labelCR.setForeground(new Color(255, 255, 255));
        labelCR.setFont(new Font("SansSerif", Font.BOLD, 18));
        panel_abajo.add(labelCR);
       
        JLabel escuela = new JLabel("<html>ESCUELA TECNICA N\u00B035 D.E 18\r\n\" ING. EDUARDO LATZINA \"</html>");
        escuela.setForeground(Color.WHITE);
        escuela.setFont(new Font("SansSerif", Font.BOLD, 14));
        panel_abajo.add(escuela);
       
       
        JLabel mails = new JLabel("<html>yamilpcmax@gmail.com platacamilaalejandra@gmail.com joaquintarczydlo@gmail.com cortezachatanicole@gmail.com<html>");
        mails.setFont(new Font("SansSerif", Font.PLAIN, 14));
        mails.setForeground(new Color(255, 255, 255));
        panel_abajo.add(mails);
       
        
		
		JLabel lblNewLabel = new JLabel("BIENVENIDO A");
		lblNewLabel.setBounds(543, 282, 314, 63);
		lblNewLabel.setForeground(Color.white);
		lblNewLabel.setFont(new Font("Cambria", Font.BOLD, 45));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FOOD FINDER");
		lblNewLabel_1.setBounds(114, 340, 426, 75);
		lblNewLabel_1.setForeground(Color.white);
		lblNewLabel_1.setFont(new Font("Cambria", Font.BOLD, 65));

		contentPane.add(lblNewLabel_1);
		
		// Panel de usuario logueado y sus elementos
		JPanel panelusu2 = new JPanel();
		panelusu2.setBackground(new Color(255, 255, 255));
		panelusu2.setBounds(430, 53, 184, 257);
		contentPane.add(panelusu2);
		panelusu2.setLayout(null);
		panelusu2.setVisible(false);
		
		JButton btnUsu1 = new JButton("");
		btnUsu1.setBackground(new Color(199, 59, 27));
		btnUsu1.setIcon(new ImageIcon(Inicio.class.getResource("/img_fondo/realpizza.png")));
		btnUsu1.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        usuvisible=!usuvisible;
	                panelusu2.setVisible(usuvisible);
	        }
	        });
		
		btnUsu1.setBounds(43, 198, 111, 82);
		panel_arriba.add(btnUsu1); 
		
		JLabel salir = new JLabel("Salir de food finder:");
		salir.setFont(new Font("Georgia", Font.PLAIN, 15));
		salir.setBounds(24, 95, 136, 14);
		panelusu2.add(salir);
		
		JButton btnCerrar = new JButton("Cerrar sesion");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InicioSesion.main(new String[]{});
				Inicio.this.setVisible(false);
				Sesion.setusuRegis(false);
			}
		});
		btnCerrar.setForeground(Color.WHITE);
		btnCerrar.setFont(new Font("Georgia", Font.BOLD, 13));
		btnCerrar.setBackground(new Color(199, 59, 27));
		btnCerrar.setBounds(17, 128, 150, 40);
		panelusu2.add(btnCerrar);
		
		JLabel usuimagen1 = new JLabel("");
		usuimagen1.setIcon(new ImageIcon(Inicio.class.getResource("/img_usuario/pizzawh.png")));
		usuimagen1.setBounds(63, 9, 58, 75);
		panelusu2.add(usuimagen1);
		
		JLabel linea1 = new JLabel("");
		linea1.setForeground(Color.LIGHT_GRAY);
		linea1.setFont(new Font("Georgia", Font.PLAIN, 16));
		linea1.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));
		linea1.setBackground(Color.BLACK);
		linea1.setBounds(0, 185, 184, 1);
		panelusu2.add(linea1);
		
		JLabel labelduenio = new JLabel("Tiene un lugar de comida?");
		labelduenio.setFont(new Font("Georgia", Font.PLAIN, 11));
		labelduenio.setBounds(12, 193, 160, 14);
		panelusu2.add(labelduenio);
		
		JButton unirs = new JButton("Unirse a food finder");
		unirs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Formu_unirse.main(new String[]{});
				Inicio.this.setVisible(false);
			}
		});
		unirs.setForeground(Color.WHITE);
		unirs.setFont(new Font("Georgia", Font.BOLD, 11));
		unirs.setBackground(new Color(199, 59, 27));
		unirs.setBounds(10, 218, 164, 23);
		panelusu2.add(unirs);
		
		//condicionales para establecer el panel de usuario correspondiente si el mismo esta logueado o no en la pagina
		if(Sesion.estadousuRegis()==true) {
        	btnUsu.setVisible(false);
        	btnUsu1.setVisible(true);
        }
        else {
        	btnUsu.setVisible(true);
        	btnUsu1.setVisible(false);
        } 
		
		addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                // Cuando la ventana se redimensiona, obt�n las dimensiones actuales del contentPane
                int nuevoAlto = contentPane.getHeight();
                int nuevoAncho = contentPane.getWidth();
                
				// Establece las coordenadas y el tama�o
                contentPane.setBounds(0, 0, nuevoAncho, nuevoAlto);//establecemos el tama�o del contentPane de acuerdo al tama�o de la pantalla
                panel_arriba.setBounds(0,0,nuevoAncho,84);
                btnUsu.setBounds(nuevoAncho-111, 0, 111, 84);
                btnUsu1.setBounds(nuevoAncho-111, 0, 111, 84);
                
                lblNewLabel.setBounds(nuevoAncho/2-157, nuevoAlto/2-70, 314, 63);
                lblNewLabel_1.setBounds(nuevoAncho/2-213, nuevoAlto/2-10, 426, 75);
                panelusu.setBounds(nuevoAncho-207, 90, 181, 257);
                panelusu2.setBounds(nuevoAncho-207, 90, 181, 257);
                panel_abajo.setBounds(0,nuevoAlto-100,nuevoAncho,100);
                mails.setBounds((nuevoAncho/5)*4,0,nuevoAncho/5,100);
                escuela.setBounds((nuevoAncho/5)*3-(nuevoAncho/10),0,nuevoAncho/5,100);
                labelCR.setBounds(nuevoAncho/5+70,0,nuevoAncho/5,100);
                lblLogo1.setBounds(0,0,nuevoAncho/5,100);      
            }
        });
	}
}