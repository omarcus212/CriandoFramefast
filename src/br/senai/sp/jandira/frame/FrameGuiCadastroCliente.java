package br.senai.sp.jandira.frame;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class FrameGuiCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private final ButtonGroup buttonGroupGenero = new ButtonGroup();

	 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameGuiCadastroCliente frame = new FrameGuiCadastroCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public FrameGuiCadastroCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 40, 226, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nome :");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 15, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("idade :");
		lblNewLabel_1_1.setBounds(10, 71, 46, 14);
		contentPane.add(lblNewLabel_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 96, 226, 20);
		contentPane.add(textField_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("m");
		buttonGroupGenero.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(203, 144, 33, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(105, 227, 237, 23);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnF = new JRadioButton("f");
		buttonGroupGenero.add(rdbtnF);
		rdbtnF.setBounds(168, 144, 33, 23);
		contentPane.add(rdbtnF);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Stanford", "los Angeles", "MIT"}));
		comboBox.setBounds(10, 144, 94, 22);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("City");
		lblNewLabel.setBounds(10, 127, 46, 14);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(307, 52, 94, 72);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		list.setLayoutOrientation(JList.VERTICAL_WRAP);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setFont(new Font("Tahoma", Font.BOLD, 11));
		list.setForeground(new Color(255, 255, 255));
		list.setBackground(new Color(70, 130, 180));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"blaaa", "blaaa", "blaaa", "bla", "blaaa", "bla", "bllaaaa", "blaaa"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
		contentPane.setVisible(true);
	}
}
