package color;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ColorFrame extends JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ColorFrame frame = new ColorFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public ColorFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 466, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton red = new JRadioButton("Red");
		
		red.setBounds(147, 121, 103, 30);
		contentPane.add(red);
		
		JRadioButton blue = new JRadioButton("Blue");
		blue.setBounds(147, 182, 103, 21);
		contentPane.add(blue);
		
		JRadioButton green = new JRadioButton("Greeen");
		green.setBounds(147, 229, 103, 21);
		contentPane.add(green);
		
		JRadioButton black = new JRadioButton("Black");
		black.setBounds(147, 286, 103, 21);
		contentPane.add(black);
		
		JLabel colorchange = new JLabel("Color Change");
		colorchange.setBounds(147, 63, 103, 36);
		contentPane.add(colorchange);
		
		ButtonGroup color=new ButtonGroup();
		color.add(black);
		color.add(red);
		color.add(green);
		color.add(blue);
		
		red.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.red);
			}
		});
		green.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.green);
			}
		});
		blue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.blue);
			}
		});
		black.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getContentPane().setBackground(Color.black);
			}
		});
	}
}
