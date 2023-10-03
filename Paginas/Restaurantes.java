package Paginas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

import Usuario.Formu_unirse;
import Usuario.InicioSesion;
import Usuario.Registro;
import Restaurantes.Menu;

public class Restaurantes extends JFrame {

	private JPanel contentPane;
	private boolean usuvisible = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Restaurantes frame = new Restaurantes();
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
	public Restaurantes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel panelcontenido = new JPanel() {
			@Override
            protected void paintComponent(Graphics g) { 
                super.paintComponent(g);
                ImageIcon imgfondo = new ImageIcon(AcercaDe.class.getResource("/img_fondo/fondolol.jpg"));
                g.drawImage(imgfondo.getImage(), 0, 0, getWidth(), getHeight(), this);
                g.setColor(new Color(255, 255, 255, 50));
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        
        panelcontenido.setForeground(new Color(110, 110,110));
        panelcontenido.setLayout(null);
        contentPane.add(panelcontenido);
		JScrollPane scrollPane = new JScrollPane();  //Creacion del scroll pane
        scrollPane.setViewportView(panelcontenido);
        add(scrollPane);
		
		JPanel panel_arriba = new JPanel();
		panel_arriba.setBackground(new Color(199, 59, 27));

		panelcontenido.add(panel_arriba);
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
        panelcontenido.add(panelusu);
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
        Restaurantes.this.setVisible(false);
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
        Restaurantes.this.setVisible(false);
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
				Restaurantes.this.setVisible(false);
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
				Restaurantes.this.setVisible(false);
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
				Restaurantes.this.setVisible(false);
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
        panelcontenido.add(panel_abajo);
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
       
       
        JLabel mails = new JLabel("<html>yamilpcmax@gmail.com \r\nplatacamilaalejandra@gmail.com \r\njoaquintarczydlo@gmail.com \r\ncortezachatanicole@gmail.com<html>");
        mails.setFont(new Font("SansSerif", Font.PLAIN, 14));
        mails.setForeground(new Color(255, 255, 255));
        panel_abajo.add(mails);
       
        JButton ini = new JButton("Inicio");
        ini.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio.main(new String[]{});
				Restaurantes.this.setVisible(false);
			}
		});
        ini.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 17));
        ini.setForeground(new Color(255, 255, 255));
        ini.setBackground(new Color(199, 59, 27));
        panel_abajo.add(ini);
       
        JButton rest = new JButton("Restaurantes");
        rest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restaurantes.main(new String[]{});
				Restaurantes.this.setVisible(false);
			}
		});
        rest.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 17));
        rest.setForeground(new Color(255, 255, 255));
        rest.setBackground(new Color(199, 59, 27));
        panel_abajo.add(rest);
       
        JButton acer = new JButton("Acerca de nosotros");
        acer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AcercaDe.main(new String[]{});
				Restaurantes.this.setVisible(false);
			}
		});
        acer.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 17));
        acer.setForeground(new Color(255, 255, 255));
        acer.setBackground(new Color(199, 59, 27));
        panel_abajo.add(acer);
			
		// Crear una lista de JLabel para cada bot√≥n
		List<JLabel[]> labelsList = new ArrayList<>();
		JButton[] btn35 = new JButton[5];
		for (int i = 0; i < 5; i++) {
		    final int index = i;  // Crear una variable final para usar en el ActionListener

		    // Crear y configurar el JButton
		    btn35[i] = new JButton();
		    btn35[i].addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		            Menu.main(new String[]{});
		            Restaurantes.this.setVisible(false);
		        }
		    });
		    btn35[i].setBackground(new Color(199, 59, 27));
		    panelcontenido.add(btn35[i]);
		    btn35[i].setLayout(null);

		    // Crear y configurar los JLabel
		    JLabel lblNewLabel = new JLabel("");
		    lblNewLabel.setIcon(new ImageIcon(Restaurantes.class.getResource("/img_restaurantes/et35.png")));
		    lblNewLabel.setBounds(0, 0, 584, 304);
		    
		    JLabel lblNewLabel_1 = new JLabel("BUFFET 35");
		    lblNewLabel_1.setForeground(Color.WHITE);
		    lblNewLabel_1.setFont(new Font("Mangal", Font.PLAIN, 35));
		    lblNewLabel_1.setBounds(810, 11, 211, 51);
		    
		    JLabel lblNewLabel_2 = new JLabel("Direcci\u00F3n: Av. Lope de Vega 2150, C1417 CABA\n");
			lblNewLabel_2.setForeground(Color.WHITE);
			lblNewLabel_2.setFont(new Font("Mangal", Font.PLAIN, 25));
			lblNewLabel_2.setBounds(594, 73, 608, 32);

			
			JLabel lblNewLabel_3 = new JLabel("Tel\u00E9fono: 011 4567-5838\n");
			lblNewLabel_3.setForeground(Color.WHITE);
			lblNewLabel_3.setFont(new Font("Mangal", Font.PLAIN, 25));
			lblNewLabel_3.setBounds(594, 129, 608, 32);
		
			
			JLabel lblNewLabel_4 = new JLabel("Horario de atenci\u00F3n: 07:45hs a 23:10hs");
			lblNewLabel_4.setForeground(Color.WHITE);
			lblNewLabel_4.setFont(new Font("Mangal", Font.PLAIN, 25));
			lblNewLabel_4.setBounds(594, 185, 608, 32);
		
			
			JLabel lblNewLabel_5 = new JLabel("Precio: $30 - $2000");
			lblNewLabel_5.setForeground(Color.WHITE);
			lblNewLabel_5.setFont(new Font("Mangal", Font.PLAIN, 25));
			lblNewLabel_5.setBounds(594, 240, 608, 32);

		    // Agregar los JLabel al JButton
		    btn35[i].add(lblNewLabel);
		    btn35[i].add(lblNewLabel_1);
		    btn35[i].add(lblNewLabel_2);
		    btn35[i].add(lblNewLabel_3);
		    btn35[i].add(lblNewLabel_4);
		    btn35[i].add(lblNewLabel_5);
		    

		    // Agregar el conjunto de JLabel al ArrayList
		    labelsList.add(new JLabel[]{lblNewLabel, lblNewLabel_1,lblNewLabel_2,lblNewLabel_3,lblNewLabel_4,lblNewLabel_5});
		}
		
		// Panel de usuario logueado y sus elementos
				JPanel panelusu2 = new JPanel();
				panelusu2.setBackground(new Color(255, 255, 255));
				panelusu2.setBounds(430, 53, 184, 257);
				panelcontenido.add(panelusu2);
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
						Restaurantes.this.setVisible(false);
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
				
				JLabel labeldueÒo = new JLabel("Tiene un lugar de comida?");
				labeldueÒo.setFont(new Font("Georgia", Font.PLAIN, 11));
				labeldueÒo.setBounds(12, 193, 160, 14);
				panelusu2.add(labeldueÒo);
				
				JButton unirs = new JButton("Unirse a food finder");
				unirs.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Formu_unirse.main(new String[]{});
						Restaurantes.this.setVisible(false);
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
                // Cuando la ventana se redimensiona, obtÔøΩn las dimensiones actuales del contentPane
                int nuevoAlto = contentPane.getHeight();
                int nuevoAncho = contentPane.getWidth();             
                
				// Establece las coordenadas y el tamaÔøΩo
                contentPane.setBounds(0, 0, nuevoAncho, nuevoAlto);//establecemos el tamaÔøΩo del contentPane de acuerdo al tamaÔøΩo de la pantalla
                panelcontenido.setPreferredSize(new Dimension( nuevoAncho-18, 2200));
                scrollPane.setBounds(0,0,nuevoAncho,nuevoAlto); // tamanio y ubicacion del scroll
                panel_arriba.setBounds(0,0,nuevoAncho,84);
                btnUsu.setBounds(nuevoAncho-111, 0, 111, 84);
                btnUsu1.setBounds(nuevoAncho-111, 0, 111, 84);
                panelusu.setBounds(nuevoAncho-207, 90, 181, 257);
                panelusu2.setBounds(nuevoAncho-207, 90, 181, 257);
                for (int i = 0; i < 5; i++) {
        		    final int index = i;  // Crear una variable final para usar en el ActionListener

        		    btn35[i].setBounds(nuevoAncho/2-606, 140+350*i, 1212, 304);
        		    
        		}
             
                panel_abajo.setBounds(0,2100,nuevoAncho,100);
                mails.setBounds((nuevoAncho/5)*4,0,nuevoAncho/5,100);
                escuela.setBounds((nuevoAncho/5)*3,0,nuevoAncho/5,100);
                labelCR.setBounds(nuevoAncho/5,0,nuevoAncho/5,100);
                lblLogo1.setBounds(0,0,nuevoAncho/5,100);
                ini.setBounds((nuevoAncho/5)*2,0,nuevoAncho/5,33);
                rest.setBounds((nuevoAncho/5)*2,33,nuevoAncho/5,33);
                acer.setBounds((nuevoAncho/5)*2,66,nuevoAncho/5,33);               
            }
        });		
	}
}