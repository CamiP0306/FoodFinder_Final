package Paginas;

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

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

import Usuario.Formu_unirse;
import Usuario.InicioSesion;
import Usuario.Registro;

public class AcercaDe extends JFrame {

	private JPanel contentPane;
	private boolean usuvisible = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AcercaDe frame = new AcercaDe();
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
	public AcercaDe() {
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
        panelusu.setBounds(315, 11, 184, 257);
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
        AcercaDe.this.setVisible(false);
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
        AcercaDe.this.setVisible(false);
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
				AcercaDe.this.setVisible(false);
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
				AcercaDe.this.setVisible(false);
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
				AcercaDe.this.setVisible(false);
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
				AcercaDe.this.setVisible(false);
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
				AcercaDe.this.setVisible(false);
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
				AcercaDe.this.setVisible(false);
			}
		});
        acer.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 17));
        acer.setForeground(new Color(255, 255, 255));
        acer.setBackground(new Color(199, 59, 27));
        panel_abajo.add(acer);
       
       JLabel titulo=new JLabel("FOOD FINDER");
       titulo.setBounds(493, 349, 400, 120);
       panelcontenido.add(titulo);
       titulo.setForeground(new Color(255, 255, 255));
       titulo.setFont(new Font("Cambria", Font.PLAIN, 65));
       
       JLabel lblAcer = new JLabel("Acerca de\r\n");
       lblAcer.setForeground(new Color(255, 255, 255));
       lblAcer.setFont(new Font("Cambria", Font.PLAIN, 45));
       lblAcer.setBounds(575, 322, 198, 53);
       panelcontenido.add(lblAcer);
        
         JLabel texto = new JLabel("");
         texto.setBounds(172, 438, 993, 1120);
         panelcontenido.add(texto);
         texto.setForeground(new Color(255, 255, 255));
         texto.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 35));
         texto.setText("<html>&nbsp;&nbsp;&nbsp;&nbsp;Food Finder es una pagina web que tiene como objetivo dar a conocer a restaurantes y a sitios de comida. Aquellas personas que necesiten buscar un posible lugar a donde puedan ir a comer tendran la posibilidad de encontrarlo a traves de nuestro listado de restaurantes, en el que se indica la direccion, telefono y horario de atencion de cada uno, y al acceder a el podran encontrar una variedad de lugares de comida segun los gustos y preferencias del usuario. Dentro de cada ventana de restaurante se encuentra un menu que muestra los diferentes platos o productos con los que cuenta ese mismo sitio de comida, divididos en las diferentes comidas del dia, de manera que sea dinamico e intuitivo para lo que este buscando un usuario de Food Finder. A su vez cada plato cuenta con una descripcion del mismo junto con su precio actual, de manera que las personas puedan informarse sobre el costo de los productos que tiene para ofrecer el sitio de comida que elijan buscar. <br>&nbsp;&nbsp;&nbsp;&nbsp;En Food Finder las personas pueden crearse una cuenta, e iniciar sesion en la misma para poder dar su calificacion o puntaje de estrellas sobre un restaurante al que ya hayan ido previamente, es decir siendo pensado para aquellos que fueron clientes de un sitio de comida determinado, y ademas podran dejar comentarios o sugerencias en la caja de comentarios, siendo capaces de dar su opinion sobre los mismos lugares de comida. Los demas usuarios podran ver la puntuacion y los comentarios que haya de cada uno de estos para elegir su sitio de comida de preferencia al que concurrir.<html>");
         
         JLabel unirse = new JLabel("Unete a Food Finder");
         unirse.setForeground(new Color(255, 255, 255));
         unirse.setFont(new Font("Cambria", Font.PLAIN, 45));
         unirse.setBounds(1312, 390, 400, 53);
         panelcontenido.add(unirse);
         
         JLabel texto2 = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp; Si usted es due\u00F1o de un restaurante o de un lugar de comida y quiere su propia pagina en Food Finder, puede crear una cuenta y nosotros validaremos su registro en la pagina. Una vez entre a la cuenta, a traves de un formulario en la ventana de restaurantes podra ingresar todo lo que quiera mostrar en la pagina sobre su sitio de comida, como puede ser sus productos o platos que tiene para ofrecer, sus precios, imagenes de cada plato, foto del local de donde vende, entre otros. De esta manera las personas que entren a buscar un sitio de comida en Food Finder podran tambien encontrar el restaurante del que es due\u00F1o!!.<html>");
         texto2.setForeground(new Color(255, 255, 255));
         texto2.setFont(new Font("Corbel", Font.BOLD | Font.ITALIC, 35));
         texto2.setBounds(1024, 439, 994, 430);
         panelcontenido.add(texto2);
         
         JButton uni = new JButton("Unirse");
         uni.addActionListener(new ActionListener() {
 			public void actionPerformed(ActionEvent e) {
 				Formu_unirse.main(new String[]{});
				AcercaDe.this.setVisible(false);
 			}
 		});
   		 uni.setFont(new Font("Georgia", Font.BOLD, 20));
   		 uni.setBackground(new Color(199, 59, 27));
   		 uni.setForeground(new Color(255, 255, 255));
         panelcontenido.add(uni);
       
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
					AcercaDe.this.setVisible(false);
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
					AcercaDe.this.setVisible(false);
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
                contentPane.setBounds(0, 0, nuevoAncho, nuevoAlto*2);//establecemos el tama�o del contentPane de acuerdo al tama�o de la pantalla
                panelcontenido.setPreferredSize(new Dimension( nuevoAncho-18, 2200));
                scrollPane.setBounds(0,0,nuevoAncho,nuevoAlto); // tamanio y ubicacion del scroll
                panel_arriba.setBounds(0,0,nuevoAncho,84);
                btnUsu.setBounds(nuevoAncho-111, 0, 111, 84);
                panelusu.setBounds(nuevoAncho-207, 90, 181, 257);
                titulo.setBounds(nuevoAncho/2-200,nuevoAlto/5, 400, 120);
                lblAcer.setBounds(nuevoAncho/2-99, nuevoAlto/5-30 ,198, 53);
                texto.setBounds(nuevoAncho/2-496, nuevoAlto/2-150, 992, 1115);
                unirse.setBounds(nuevoAncho/2-200, nuevoAlto/2+990, 400, 53);
                texto2.setBounds(nuevoAncho/2-496, nuevoAlto/2+720, 992, 1115);
                uni.setBounds(nuevoAncho/2+160, nuevoAlto/2+1455, 150, 30);
                
                btnUsu1.setBounds(nuevoAncho-111, 0, 111, 84);
                panelusu2.setBounds(nuevoAncho-207, 90, 181, 257);
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