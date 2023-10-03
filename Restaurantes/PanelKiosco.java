package Restaurantes;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class PanelKiosco extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelKiosco() {
		
setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		
		this.setBounds(51, 291, 1360, 590);
		this.setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JPanel panel_p1_1 = new JPanel();
		panel_p1_1.setLayout(null);
		panel_p1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		panel_p1_1.setBackground(new Color(199, 57, 29));
		panel_p1_1.setBounds(0, 0, 351, 298);
		add(panel_p1_1);
		
		JLabel lblImgProd5 = new JLabel("");
		lblImgProd5.setIcon(new ImageIcon(PanelDesayuno.class.getResource("/img_rest_catalogo/ruditas.png")));
		lblImgProd5.setBounds(0, 0, 361, 192);
		panel_p1_1.add(lblImgProd5);
		
		JLabel lblNewLabel_2_1 = new JLabel("Pep Rueditas Sabor Pizza 40g");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(30, 203, 275, 34);
		panel_p1_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("Precio: $$$");
		lblNewLabel_2_1_5.setForeground(Color.BLACK);
		lblNewLabel_2_1_5.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_1_5.setBounds(30, 237, 170, 34);
		panel_p1_1.add(lblNewLabel_2_1_5);
		
		JPanel panel_p1_1_1 = new JPanel();
		panel_p1_1_1.setLayout(null);
		panel_p1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		panel_p1_1_1.setBackground(new Color(199, 57, 29));
		panel_p1_1_1.setBounds(348, 0, 336, 298);
		add(panel_p1_1_1);
		
		JLabel lblImgProd6 = new JLabel("");
		lblImgProd6.setIcon(new ImageIcon(PanelDesayuno.class.getResource("/img_rest_catalogo/saladix.jpg")));
		lblImgProd6.setBounds(0, 0, 336, 192);
		panel_p1_1_1.add(lblImgProd6);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Saladix Sabor Pizza 100g");
		lblNewLabel_2_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_1_1.setBounds(30, 203, 272, 34);
		panel_p1_1_1.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_5_1 = new JLabel("Precio: $$$");
		lblNewLabel_2_1_5_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_5_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_1_5_1.setBounds(30, 237, 170, 34);
		panel_p1_1_1.add(lblNewLabel_2_1_5_1);
		
		JPanel panel_p1_1_3 = new JPanel();
		panel_p1_1_3.setLayout(null);
		panel_p1_1_3.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		panel_p1_1_3.setBackground(new Color(199, 57, 29));
		panel_p1_1_3.setBounds(682, 0, 336, 298);
		add(panel_p1_1_3);
		
		JLabel lblImgProd8 = new JLabel("");
		lblImgProd8.setIcon(new ImageIcon(PanelDesayuno.class.getResource("/img_rest_catalogo/LATA.jpg")));
		lblImgProd8.setBounds(0, 0, 345, 192);
		panel_p1_1_3.add(lblImgProd8);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Lata Coca-Cola Original 354ml");
		lblNewLabel_2_1_3.setForeground(Color.BLACK);
		lblNewLabel_2_1_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_1_3.setBounds(30, 203, 283, 34);
		panel_p1_1_3.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_5_4 = new JLabel("Precio: $$$");
		lblNewLabel_2_1_5_4.setForeground(Color.BLACK);
		lblNewLabel_2_1_5_4.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_1_5_4.setBounds(30, 240, 170, 34);
		panel_p1_1_3.add(lblNewLabel_2_1_5_4);
		
		JPanel panel_p1_1_2 = new JPanel();
		panel_p1_1_2.setLayout(null);
		panel_p1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		panel_p1_1_2.setBackground(new Color(199, 57, 29));
		panel_p1_1_2.setBounds(1015, 0, 345, 298);
		add(panel_p1_1_2);
		
		JLabel lblImgProd5_1 = new JLabel("");
		lblImgProd5_1.setIcon(new ImageIcon(PanelDesayuno.class.getResource("/img_rest_catalogo/ades.jpg")));
		lblImgProd5_1.setBounds(0, 0, 351, 192);
		panel_p1_1_2.add(lblImgProd5_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Ades Soja 1L");
		lblNewLabel_2_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_1_2.setBounds(30, 203, 170, 34);
		panel_p1_1_2.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_5_7 = new JLabel("Precio: $$$");
		lblNewLabel_2_1_5_7.setForeground(Color.BLACK);
		lblNewLabel_2_1_5_7.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_1_5_7.setBounds(30, 238, 170, 34);
		panel_p1_1_2.add(lblNewLabel_2_1_5_7);
		
		JPanel panel_p1_1_1_1 = new JPanel();
		panel_p1_1_1_1.setLayout(null);
		panel_p1_1_1_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
		panel_p1_1_1_1.setBackground(new Color(199, 57, 29));
		panel_p1_1_1_1.setBounds(0, 292, 351, 298);
		add(panel_p1_1_1_1);
		
		JLabel lblImgProd6_1 = new JLabel("");
		lblImgProd6_1.setIcon(new ImageIcon(PanelDesayuno.class.getResource("/img_rest_catalogo/ruditas.png")));
		lblImgProd6_1.setBounds(0, 0, 390, 192);
		panel_p1_1_1_1.add(lblImgProd6_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Pep Rueditas Sabor Pizza 40g");
		lblNewLabel_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_1_1_1.setBounds(30, 203, 266, 34);
		panel_p1_1_1_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_2_1_5_2 = new JLabel("Precio: $$$");
		lblNewLabel_2_1_5_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_5_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_1_5_2.setBounds(30, 237, 170, 34);
		panel_p1_1_1_1.add(lblNewLabel_2_1_5_2);
		
		JPanel panel_p1_1_3_1 = new JPanel();
		panel_p1_1_3_1.setLayout(null);
		panel_p1_1_3_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		panel_p1_1_3_1.setBackground(new Color(199, 57, 29));
		panel_p1_1_3_1.setBounds(348, 292, 336, 298);
		add(panel_p1_1_3_1);
		
		JLabel lblImgProd8_1 = new JLabel("");
		lblImgProd8_1.setIcon(new ImageIcon(PanelDesayuno.class.getResource("/img_rest_catalogo/saladix.jpg")));
		lblImgProd8_1.setBounds(-47, 0, 392, 192);
		panel_p1_1_3_1.add(lblImgProd8_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("Saladix Sabor Pizza 100g");
		lblNewLabel_2_1_3_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_3_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_1_3_1.setBounds(30, 203, 279, 34);
		panel_p1_1_3_1.add(lblNewLabel_2_1_3_1);
		
		JLabel lblNewLabel_2_1_5_3 = new JLabel("Precio: $$$");
		lblNewLabel_2_1_5_3.setForeground(Color.BLACK);
		lblNewLabel_2_1_5_3.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_1_5_3.setBounds(30, 238, 170, 34);
		panel_p1_1_3_1.add(lblNewLabel_2_1_5_3);
		
		JPanel panel_p1_1_4 = new JPanel();
		panel_p1_1_4.setLayout(null);
		panel_p1_1_4.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		panel_p1_1_4.setBackground(new Color(199, 57, 29));
		panel_p1_1_4.setBounds(682, 292, 336, 298);
		add(panel_p1_1_4);
		
		JLabel lblImgProd5_2 = new JLabel("");
		lblImgProd5_2.setIcon(new ImageIcon(PanelDesayuno.class.getResource("/img_rest_catalogo/LATA.jpg")));
		lblImgProd5_2.setBounds(0, 0, 351, 192);
		panel_p1_1_4.add(lblImgProd5_2);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("Lata Coca-Cola Original 354ml");
		lblNewLabel_2_1_4.setForeground(Color.BLACK);
		lblNewLabel_2_1_4.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_1_4.setBounds(30, 203, 278, 34);
		panel_p1_1_4.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_2_1_5_5 = new JLabel("Precio: $$$");
		lblNewLabel_2_1_5_5.setForeground(Color.BLACK);
		lblNewLabel_2_1_5_5.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_1_5_5.setBounds(30, 239, 170, 34);
		panel_p1_1_4.add(lblNewLabel_2_1_5_5);
		
		JPanel panel_p1_1_1_2 = new JPanel();
		panel_p1_1_1_2.setLayout(null);
		panel_p1_1_1_2.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(192, 192, 192)));
		panel_p1_1_1_2.setBackground(new Color(199, 57, 29));
		panel_p1_1_1_2.setBounds(1015, 292, 345, 298);
		add(panel_p1_1_1_2);
		
		JLabel lblImgProd6_2 = new JLabel("");
		lblImgProd6_2.setIcon(new ImageIcon(PanelDesayuno.class.getResource("/img_rest_catalogo/ades.jpg")));
		lblImgProd6_2.setBounds(0, 0, 345, 192);
		panel_p1_1_1_2.add(lblImgProd6_2);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("Ades Soja 1L");
		lblNewLabel_2_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_1_1_2.setBounds(30, 203, 170, 34);
		panel_p1_1_1_2.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_5_6 = new JLabel("Precio: $$$");
		lblNewLabel_2_1_5_6.setForeground(Color.BLACK);
		lblNewLabel_2_1_5_6.setFont(new Font("Dialog", Font.PLAIN, 15));
		lblNewLabel_2_1_5_6.setBounds(30, 236, 170, 34);
		panel_p1_1_1_2.add(lblNewLabel_2_1_5_6);

	}

}
