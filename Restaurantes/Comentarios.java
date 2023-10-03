package Restaurantes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Paginas.AcercaDe;
import Paginas.Inicio;
import Paginas.Restaurantes;
import Usuario.InicioSesion;
import Usuario.Registro;

public class Comentarios extends JFrame {

	private JPanel contentPane;

	private boolean usuvisible = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Comentarios frame = new Comentarios();
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
	public Comentarios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setResizable(false); //no se puede achicar la pantalla
		contentPane = new JPanel() {
			@Override
            protected void paintComponent(Graphics g) { 
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
		panel_arriba.setBounds(0, 0, 1444, 82);
		panel_arriba.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(Inicio.class.getResource("/img_fondo/logo.PNG")));
		lblLogo.setBounds(0, 0, 208, 82);
		panel_arriba.add(lblLogo);
		
		
		//USUARIO PANEL
		
				//Elementos de panel de usuario para inicio de sesion y registro:
		        JPanel panelusu = new JPanel();
		        panelusu.setBackground(new Color(255, 255, 255));
		        panelusu.setBounds(1253, 93, 181, 245);
		        contentPane.add(panelusu);
		        panelusu.setLayout(null);
		        panelusu.setVisible(usuvisible);
		       
		        JLabel usuimagen = new JLabel("");
		        usuimagen.setIcon(new ImageIcon(Inicio.class.getResource("/img_usuario/usuario blanco.jpg")));
		        usuimagen.setBounds(55, 11, 73, 75);
		        panelusu.add(usuimagen);
		       
		        JLabel entrar = new JLabel("Entrar a food finder:");
		        entrar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		        entrar.setBounds(29, 97, 130, 14);
		        panelusu.add(entrar);
		       
		        JButton regist = new JButton("Registrarse");
		        regist.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        Registro.main(new String[]{});
		        Comentarios.this.setVisible(false);
		        }
		        });
		        regist.setFont(new Font("Georgia", Font.BOLD, 11));
		        regist.setBackground(new Color(199, 59, 27));
		        regist.setForeground(new Color(255, 255, 255));
		        regist.setBounds(29, 135, 130, 23);
		        panelusu.add(regist);
		       
		        JButton inic = new JButton("Iniciar sesion");
		        inic.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        InicioSesion.main(new String[]{});
		        Comentarios.this.setVisible(false);
		        }
		        });
		        inic.setFont(new Font("Georgia", Font.BOLD, 11));
		        inic.setBackground(new Color(199, 59, 27));
		     	inic.setForeground(new Color(255, 255, 255));
		        inic.setBounds(29, 185, 130, 23);
		        panelusu.add(inic);
		       
		        //boton de usuario para abrir y cerrar panel de inicio y registro de sesion:
		        JButton btnUsu = new JButton("");
		        btnUsu.addActionListener(new ActionListener() {
		        public void actionPerformed(ActionEvent e) {
		        usuvisible=!usuvisible;
		                panelusu.setVisible(usuvisible);
		        }
		        });
		        btnUsu.setIcon(new ImageIcon(Inicio.class.getResource("/img_fondo/usuario.PNG")));
		        btnUsu.setBounds(1333, 0, 111, 82);
		        panel_arriba.add(btnUsu);
		
	
		        
		        
		JButton btnInicio = new JButton("Inicio");
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio.main(new String[]{});
				Comentarios.this.setVisible(false);
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
				Comentarios.this.setVisible(false);
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
				Comentarios.this.setVisible(false);
			}
		});
		btnAcercaDe.setForeground(Color.WHITE);
		btnAcercaDe.setFont(new Font("Mangal", Font.PLAIN, 20));
		btnAcercaDe.setBackground(new Color(0, 0, 0));
		btnAcercaDe.setBounds(793, 24, 214, 36);
		panel_arriba.add(btnAcercaDe);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(199, 59, 27));
		panel.setBounds(41, 120, 1360, 465);
		contentPane.add(panel);
		
		
	}
}
