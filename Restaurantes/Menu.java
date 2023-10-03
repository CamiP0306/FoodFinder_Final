package Restaurantes;

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
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import Paginas.AcercaDe;
import Paginas.Inicio;
import Paginas.Restaurantes;
import Paginas.Sesion;
import Usuario.Formu_unirse;
import Usuario.InicioSesion;
import Usuario.Registro;
import javax.swing.border.MatteBorder;

public class Menu extends JFrame {

	private JPanel contentPane;

	private boolean usuvisible = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
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
		panel_arriba.setBounds(0, 0, 1444, 82);
		panel_arriba.setBackground(new Color(199, 59, 27));
		panelcontenido.add(panel_arriba);
		panel_arriba.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Inicio.class.getResource("/img_fondo/logo.PNG")));
		lblLogo.setBounds(0, 0, 208, 82);
		panel_arriba.add(lblLogo);
		
		
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
        Menu
        .this.setVisible(false);
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
        Menu.this.setVisible(false);
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
				Menu.this.setVisible(false);
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
				Menu.this.setVisible(false);
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
				Menu.this.setVisible(false);
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
				Menu.this.setVisible(false);
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
				Menu.this.setVisible(false);
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
				Menu.this.setVisible(false);
			}
		});
        acer.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 17));
        acer.setForeground(new Color(255, 255, 255));
        acer.setBackground(new Color(199, 59, 27));
        panel_abajo.add(acer);
        
		
		
      //BOTONES DEL MENU
		JButton btnMenu = new JButton("MENU");
		JButton btnDesayuno = new JButton("DESAYUNO");
		JButton btnAlmuerzo = new JButton("ALMUERZO");
		JButton btnPostres = new JButton("POSTRES");
		JButton btnKiosco = new JButton("KIOSCO");
		JButton btnBebidas = new JButton("BEBIDAS");

//PANEL DESAYUNO
PanelDesayuno panelDesayuno = new PanelDesayuno();
panelcontenido.add(panelDesayuno);
panelDesayuno.setVisible(false); 

//PANEL ALMUERZO
PanelAlmuerzo panelAlmuerzo = new PanelAlmuerzo();
panelcontenido.add(panelAlmuerzo);
panelAlmuerzo.setVisible(false); 

//PANEL POSTRES
PanelPostres panelPostres = new PanelPostres();
panelcontenido.add(panelPostres);
panelPostres.setVisible(false); 

//PANEL KIOSCO
PanelKiosco panelKiosco = new PanelKiosco();
panelcontenido.add(panelKiosco);
panelKiosco.setVisible(false); 

//PANEL BEBIDAS
PanelBebidas panelBebidas = new PanelBebidas();
panelcontenido.add(panelBebidas);
panelBebidas.setVisible(false); 

//PANEL DEL MENU
JPanel panel = new JPanel();
panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
panel.setBounds(51, 291, 1360, 590);
panel.setBackground(new Color(255, 255, 255));
panelcontenido.add(panel);
panel.setLayout(null);

JPanel panel_p1 = new JPanel();
panel_p1.setBackground(new Color(199, 59, 27));
panel_p1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
panel_p1.setBounds(0, 0, 351, 298);
panel.add(panel_p1);
panel_p1.setLayout(null);

JLabel lblImgProd1 = new JLabel("");
lblImgProd1.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/img_rest_catalogo/LATA.jpg"))); 
lblImgProd1.setBounds(0, 0, 351, 192);
panel_p1.add(lblImgProd1);

JLabel lblProd1 = new JLabel("Lata Coca-Cola Original 354 ml");
lblProd1.setForeground(Color.BLACK);
lblProd1.setFont(new Font("Dialog", Font.PLAIN, 15));
lblProd1.setBounds(30, 203, 215, 34);
panel_p1.add(lblProd1);

JLabel lblNewLabel_2_1_5_1 = new JLabel("Precio: $$$");
lblNewLabel_2_1_5_1.setForeground(Color.BLACK);
lblNewLabel_2_1_5_1.setFont(new Font("Dialog", Font.PLAIN, 15));
lblNewLabel_2_1_5_1.setBounds(30, 237, 170, 34);
panel_p1.add(lblNewLabel_2_1_5_1);

JPanel panel_p1_1 = new JPanel();
panel_p1_1.setLayout(null);
panel_p1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
panel_p1_1.setBackground(new Color(199, 59, 27));
panel_p1_1.setBounds(0, 298, 351, 298);
panel.add(panel_p1_1);

JLabel lblImgProd5 = new JLabel("");
lblImgProd5.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/img_rest_catalogo/ades.jpg"))); 
lblImgProd5.setBounds(0, 0, 351, 192);
panel_p1_1.add(lblImgProd5);

JLabel lblNewLabel_2_1 = new JLabel("Ades Soja 1L");
lblNewLabel_2_1.setForeground(Color.BLACK);
lblNewLabel_2_1.setFont(new Font("Dialog", Font.PLAIN, 15));
lblNewLabel_2_1.setBounds(30, 203, 170, 34);
panel_p1_1.add(lblNewLabel_2_1);

JLabel lblNewLabel_2_11 = new JLabel("Precio: $$$");
lblNewLabel_2_11.setForeground(Color.BLACK);
lblNewLabel_2_11.setFont(new Font("Dialog", Font.PLAIN, 15));
lblNewLabel_2_11.setBounds(30, 233, 170, 34);
panel_p1_1.add(lblNewLabel_2_11);

JPanel panel_p1_1_1 = new JPanel();
panel_p1_1_1.setLayout(null);
panel_p1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
panel_p1_1_1.setBackground(new Color(199, 59, 27));
panel_p1_1_1.setBounds(347, 298, 336, 298);
panel.add(panel_p1_1_1);

JLabel lblImgProd6 = new JLabel("");
lblImgProd6.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/img_rest_catalogo/mediaLunas.jpg")));
lblImgProd6.setBounds(0, 0, 351, 192);
panel_p1_1_1.add(lblImgProd6);

JLabel lblNewLabel_2_1_1 = new JLabel("Medialuna con  J&Q");
lblNewLabel_2_1_1.setForeground(Color.BLACK);
lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
lblNewLabel_2_1_1.setBounds(30, 203, 170, 34);
panel_p1_1_1.add(lblNewLabel_2_1_1);

JLabel lblNewLabel_2_11_1 = new JLabel("Precio: $$$");
lblNewLabel_2_11_1.setForeground(Color.BLACK);
lblNewLabel_2_11_1.setFont(new Font("Dialog", Font.PLAIN, 15));
lblNewLabel_2_11_1.setBounds(30, 235, 170, 34);
panel_p1_1_1.add(lblNewLabel_2_11_1);

JPanel panel_p1_1_2 = new JPanel();
panel_p1_1_2.setLayout(null);
panel_p1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) null));
panel_p1_1_2.setBackground(new Color(199, 59, 27));
panel_p1_1_2.setBounds(683, 298, 336, 298);
panel.add(panel_p1_1_2);

JLabel lblImgProd7 = new JLabel("");
lblImgProd7.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/img_rest_catalogo/pancho.jpg")));
lblImgProd7.setBounds(0, 0, 351, 192);
panel_p1_1_2.add(lblImgProd7);

JLabel lblNewLabel_2_1_2 = new JLabel("Super Pancho");
lblNewLabel_2_1_2.setForeground(Color.BLACK);
lblNewLabel_2_1_2.setFont(new Font("Dialog", Font.PLAIN, 15));
lblNewLabel_2_1_2.setBounds(30, 203, 215, 34);
panel_p1_1_2.add(lblNewLabel_2_1_2);

JLabel lblNewLabel_2_11_2 = new JLabel("Precio: $$$");
lblNewLabel_2_11_2.setForeground(Color.BLACK);
lblNewLabel_2_11_2.setFont(new Font("Dialog", Font.PLAIN, 15));
lblNewLabel_2_11_2.setBounds(30, 236, 170, 34);
panel_p1_1_2.add(lblNewLabel_2_11_2);

JPanel panel_p1_1_3 = new JPanel();
panel_p1_1_3.setLayout(null);
panel_p1_1_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
panel_p1_1_3.setBackground(new Color(199, 59, 27));
panel_p1_1_3.setBounds(1015, 298, 345, 298);
panel.add(panel_p1_1_3);

JLabel lblImgProd8 = new JLabel("");
lblImgProd8.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/img_rest_catalogo/pebete.jpg")));
lblImgProd8.setBounds(0, 0, 351, 192);
panel_p1_1_3.add(lblImgProd8);

JLabel lblNewLabel_2_1_3 = new JLabel("Pebete de salame y queso");
lblNewLabel_2_1_3.setForeground(Color.BLACK);
lblNewLabel_2_1_3.setFont(new Font("Dialog", Font.PLAIN, 15));
lblNewLabel_2_1_3.setBounds(30, 203, 215, 34);
panel_p1_1_3.add(lblNewLabel_2_1_3);

JLabel lblNewLabel_2_11_3 = new JLabel("Precio: $$$");
lblNewLabel_2_11_3.setForeground(Color.BLACK);
lblNewLabel_2_11_3.setFont(new Font("Dialog", Font.PLAIN, 15));
lblNewLabel_2_11_3.setBounds(30, 239, 170, 34);
panel_p1_1_3.add(lblNewLabel_2_11_3);

JPanel panel_p1_1_4 = new JPanel();
panel_p1_1_4.setLayout(null);
panel_p1_1_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) null));
panel_p1_1_4.setBackground(new Color(199, 59, 27));
panel_p1_1_4.setBounds(351, 0, 332, 298);
panel.add(panel_p1_1_4);

JLabel lblImgProd2 = new JLabel("");
lblImgProd2.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/img_rest_catalogo/ruditas.png")));
lblImgProd2.setBounds(0, 0, 351, 192);
panel_p1_1_4.add(lblImgProd2);

JLabel lblProd2 = new JLabel("Pep Rueditas Sabor Pizza 40g");
lblProd2.setForeground(Color.BLACK);
lblProd2.setFont(new Font("Dialog", Font.PLAIN, 15));
lblProd2.setBounds(30, 203, 215, 34);
panel_p1_1_4.add(lblProd2);

JLabel lblNewLabel_2_1_5_2 = new JLabel("Precio: $$$");
lblNewLabel_2_1_5_2.setForeground(Color.BLACK);
lblNewLabel_2_1_5_2.setFont(new Font("Dialog", Font.PLAIN, 15));
lblNewLabel_2_1_5_2.setBounds(30, 236, 170, 34);
panel_p1_1_4.add(lblNewLabel_2_1_5_2);

JPanel panel_p1_1_5 = new JPanel();
panel_p1_1_5.setLayout(null);
panel_p1_1_5.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
panel_p1_1_5.setBackground(new Color(199, 59, 27));
panel_p1_1_5.setBounds(683, 0, 336, 298);
panel.add(panel_p1_1_5);

JLabel lblImgProd3 = new JLabel("");
lblImgProd3.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/img_rest_catalogo/saladix.jpg")));
lblImgProd3.setBounds(0, 0, 351, 192);
panel_p1_1_5.add(lblImgProd3);

JLabel lblNewLabel_2_1_5 = new JLabel("Saladix Sabor Pizza 100g");
lblNewLabel_2_1_5.setForeground(Color.BLACK);
lblNewLabel_2_1_5.setFont(new Font("Dialog", Font.PLAIN, 15));
lblNewLabel_2_1_5.setBounds(30, 203, 170, 34);
panel_p1_1_5.add(lblNewLabel_2_1_5);

JLabel lblNewLabel_2_1_5_3 = new JLabel("Precio: $$$");
lblNewLabel_2_1_5_3.setForeground(Color.BLACK);
lblNewLabel_2_1_5_3.setFont(new Font("Dialog", Font.PLAIN, 15));
lblNewLabel_2_1_5_3.setBounds(30, 238, 170, 34);
panel_p1_1_5.add(lblNewLabel_2_1_5_3);

JPanel panel_p1_1_6 = new JPanel();
panel_p1_1_6.setLayout(null);
panel_p1_1_6.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
panel_p1_1_6.setBackground(new Color(199, 59, 27));
panel_p1_1_6.setBounds(1015, 0, 345, 298);
panel.add(panel_p1_1_6);

JLabel lblImgProd4 = new JLabel("");
lblImgProd4.setIcon(new javax.swing.ImageIcon(Menu.class.getResource("/img_rest_catalogo/sandwichmila.jpg")));
lblImgProd4.setBounds(0, 0, 351, 192);
panel_p1_1_6.add(lblImgProd4);

JLabel lblNewLabel_2_1_6 = new JLabel("Sandwich de milanesa, lechuga y tomate");
lblNewLabel_2_1_6.setForeground(Color.BLACK);
lblNewLabel_2_1_6.setFont(new Font("Dialog", Font.PLAIN, 15));
lblNewLabel_2_1_6.setBounds(30, 203, 300, 34);
panel_p1_1_6.add(lblNewLabel_2_1_6);

JLabel lblNewLabel_2_1_5_4 = new JLabel("Precio: $$$");
lblNewLabel_2_1_5_4.setForeground(Color.BLACK);
lblNewLabel_2_1_5_4.setFont(new Font("Dialog", Font.PLAIN, 15));
lblNewLabel_2_1_5_4.setBounds(30, 236, 170, 34);
panel_p1_1_6.add(lblNewLabel_2_1_5_4);

//BTN MENU
btnMenu.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		btnMenu.setBackground(new Color(199, 57, 29));
		btnDesayuno.setBackground(Color.WHITE);
		btnAlmuerzo.setBackground(Color.WHITE);
		btnPostres.setBackground(Color.WHITE);
		btnKiosco.setBackground(Color.WHITE);
		btnBebidas.setBackground(Color.WHITE);
		panel.setVisible(true);
		panelDesayuno.setVisible(false);
		panelAlmuerzo.setVisible(false);
		panelPostres.setVisible(false);
		panelKiosco.setVisible(false);
		panelBebidas.setVisible(false);				
	}
});
btnMenu.setBounds(51, 251, 226, 42);
btnMenu.setForeground(Color.BLACK);
btnMenu.setBackground(new Color(199, 57, 29));
btnMenu.setFont(new Font("Dialog", Font.PLAIN, 20));
panelcontenido.add(btnMenu);

//BTN DESAYUNO
btnDesayuno.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		btnMenu.setBackground(Color.WHITE);
		btnDesayuno.setBackground(new Color(199, 59, 27));
		btnAlmuerzo.setBackground(Color.WHITE);
		btnPostres.setBackground(Color.WHITE);
		btnKiosco.setBackground(Color.WHITE);
		btnBebidas.setBackground(Color.WHITE);
		panel.setVisible(false);
		panelAlmuerzo.setVisible(false);
		panelPostres.setVisible(false);
		panelKiosco.setVisible(false);
		panelBebidas.setVisible(false);
		panelDesayuno.setVisible(true);
	}
});
btnDesayuno.setBounds(280, 251, 226, 42);
btnDesayuno.setForeground(Color.BLACK);
btnDesayuno.setBackground(Color.WHITE);
btnDesayuno.setFont(new Font("Dialog", Font.PLAIN, 20));
panelcontenido.add(btnDesayuno);

//BTN ALMUERZO
btnAlmuerzo.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		btnMenu.setBackground(Color.WHITE);
		btnDesayuno.setBackground(Color.WHITE);
		btnAlmuerzo.setBackground(new Color(199, 59, 27));
		btnPostres.setBackground(Color.WHITE);
		btnKiosco.setBackground(Color.WHITE);
		btnBebidas.setBackground(Color.WHITE);
		panel.setVisible(false);
		panelDesayuno.setVisible(false);
		panelPostres.setVisible(false);
		panelKiosco.setVisible(false);
		panelBebidas.setVisible(false);
		panelAlmuerzo.setVisible(true);
	}
});
btnAlmuerzo.setBounds(496, 251, 226, 42);
btnAlmuerzo.setForeground(Color.BLACK);
btnAlmuerzo.setBackground(Color.WHITE);
btnAlmuerzo.setFont(new Font("Dialog", Font.PLAIN, 20));
panelcontenido.add(btnAlmuerzo);

//BTN POSTRES
btnPostres.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		btnMenu.setBackground(Color.WHITE);
		btnDesayuno.setBackground(Color.WHITE);
		btnAlmuerzo.setBackground(Color.WHITE);
		btnPostres.setBackground(new Color(199, 59, 27));
		btnKiosco.setBackground(Color.WHITE);
		btnBebidas.setBackground(Color.WHITE);
		panel.setVisible(false);
		panelDesayuno.setVisible(false);
		panelAlmuerzo.setVisible(false);
		panelKiosco.setVisible(false);
		panelBebidas.setVisible(false);
		panelPostres.setVisible(true);
	}
});
btnPostres.setBounds(731, 251, 226, 42);
btnPostres.setForeground(Color.BLACK);
btnPostres.setBackground(Color.WHITE);
btnPostres.setFont(new Font("Dialog", Font.PLAIN, 20));
panelcontenido.add(btnPostres);

//BTN BEBIDAS
btnBebidas.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		btnMenu.setBackground(Color.WHITE);
		btnDesayuno.setBackground(Color.WHITE);
		btnAlmuerzo.setBackground(Color.WHITE);
		btnPostres.setBackground(Color.WHITE);
		btnKiosco.setBackground(Color.WHITE);
		btnBebidas.setBackground(new Color(199, 59, 27));
		panel.setVisible(false);
		panelDesayuno.setVisible(false);
		panelAlmuerzo.setVisible(false);
		panelPostres.setVisible(false);
		panelKiosco.setVisible(false);
		panelBebidas.setVisible(true);
	}
});
btnBebidas.setBounds(1180, 251, 226, 42);
btnBebidas.setForeground(Color.BLACK);
btnBebidas.setBackground(Color.WHITE);
btnBebidas.setFont(new Font("Dialog", Font.PLAIN, 20));
panelcontenido.add(btnBebidas);

//BTN KIOSCO
btnKiosco.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		btnMenu.setBackground(Color.WHITE);
		btnDesayuno.setBackground(Color.WHITE);
		btnAlmuerzo.setBackground(Color.WHITE);
		btnPostres.setBackground(Color.WHITE);
		btnKiosco.setBackground(new Color(199, 59, 27));
		btnBebidas.setBackground(Color.WHITE);
		panel.setVisible(false);
		panelDesayuno.setVisible(false);
		panelAlmuerzo.setVisible(false);
		panelPostres.setVisible(false);
		panelBebidas.setVisible(false);
		panelKiosco.setVisible(true);
	}
});
btnKiosco.setBounds(955, 251, 226, 42);
btnKiosco.setForeground(Color.BLACK);
btnKiosco.setBackground(Color.WHITE);
btnKiosco.setFont(new Font("Dialog", Font.PLAIN, 20));
panelcontenido.add(btnKiosco);

JLabel lblbuffet = new JLabel("BUFFET 35");
lblbuffet.setForeground(new Color(255, 255, 255));
lblbuffet.setFont(new Font("Cambria", Font.PLAIN, 40));
lblbuffet.setBounds(686, 135, 204, 51);
panelcontenido.add(lblbuffet);
		
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
				Menu.this.setVisible(false);
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
				Menu.this.setVisible(false);
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
                panelcontenido.setPreferredSize(new Dimension( nuevoAncho-18, 1200));
                scrollPane.setBounds(0,0,nuevoAncho,nuevoAlto);
                panel_arriba.setBounds(0,0,nuevoAncho,84);
                btnUsu.setBounds(nuevoAncho-111, 0, 111, 84);
                panelusu.setBounds(nuevoAncho-207, 90, 181, 257);
                btnUsu1.setBounds(nuevoAncho-111, 0, 111, 84);
                panelusu2.setBounds(nuevoAncho-207, 90, 181, 257);
                panel_abajo.setBounds(0,1100,nuevoAncho,100);
                mails.setBounds((nuevoAncho/5)*4,0,nuevoAncho/5,100);
                escuela.setBounds((nuevoAncho/5)*3,0,nuevoAncho/5,100);
                labelCR.setBounds(nuevoAncho/5,0,nuevoAncho/5,100);
                lblLogo1.setBounds(0,0,nuevoAncho/5,100);
                ini.setBounds((nuevoAncho/5)*2,0,nuevoAncho/5,33);
                rest.setBounds((nuevoAncho/5)*2,33,nuevoAncho/5,33);
                acer.setBounds((nuevoAncho/5)*2,66,nuevoAncho/5,33);
                
                
                lblbuffet.setBounds(nuevoAncho/2-102, 135, 204, 51);
                btnMenu.setBounds(nuevoAncho/2-678, 251, 226, 42);
                btnDesayuno.setBounds(nuevoAncho/2-452, 251, 226, 42);
                btnAlmuerzo.setBounds(nuevoAncho/2-226, 251, 226, 42);
                btnPostres.setBounds(nuevoAncho/2, 251, 226, 42);
                btnBebidas.setBounds(nuevoAncho/2+226, 251, 226, 42);
                btnKiosco.setBounds(nuevoAncho/2+452, 251, 226, 42);
                
                panel.setBounds(nuevoAncho/2-678, 291, 1356, 590);
                panelDesayuno.setBounds(nuevoAncho/2-678, 291, 1356, 590);
                panelAlmuerzo.setBounds(nuevoAncho/2-678, 291, 1356, 590);
                panelPostres.setBounds(nuevoAncho/2-678, 291, 1356, 590);
                panelKiosco.setBounds(nuevoAncho/2-678, 291, 1356, 590);
                panelBebidas.setBounds(nuevoAncho/2-678, 291, 1356, 590);
                
            }
        });
	}
}
