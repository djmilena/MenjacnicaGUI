package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.omg.CORBA.FREE_MEM;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frmDodajKurs;
	private JLabel label;
	private JTextField textFieldSifra;
	private JLabel label_1;
	private JTextField textFieldNaziv;
	private JLabel label_2;
	private JTextField textFieldProdajni;
	private JLabel label_3;
	private JTextField textFieldKupovni;
	private JLabel label_4;
	private JTextField textFieldSrednji;
	private JTextField textFieldSkraceni;
	private JLabel label_5;
	private JButton button;
	private JButton button_1;
	
	private static MenjacnicaGUI gp;

	/**
	 * Launch the application.
	 */
	public static void DodajKursProzor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DodajKursGUI window = new DodajKursGUI(gp);//ne radi
					window.frmDodajKurs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DodajKursGUI(MenjacnicaGUI gp) {
		initialize();
		this.gp = gp;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDodajKurs = new JFrame();
		frmDodajKurs.setResizable(false);
		frmDodajKurs.setTitle("Dodaj kurs");
		frmDodajKurs.setBounds(100, 100, 450, 300);
		frmDodajKurs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmDodajKurs.getContentPane().setLayout(null);
		frmDodajKurs.getContentPane().add(getLabel());
		frmDodajKurs.getContentPane().add(getTextFieldSifra());
		frmDodajKurs.getContentPane().add(getLabel_1());
		frmDodajKurs.getContentPane().add(getTextFieldNaziv());
		frmDodajKurs.getContentPane().add(getLabel_2());
		frmDodajKurs.getContentPane().add(getTextFieldProdajni());
		frmDodajKurs.getContentPane().add(getLabel_3());
		frmDodajKurs.getContentPane().add(getTextFieldKupovni());
		frmDodajKurs.getContentPane().add(getLabel_4());
		frmDodajKurs.getContentPane().add(getTextFieldSrednji());
		frmDodajKurs.getContentPane().add(getTextFieldSkraceni());
		frmDodajKurs.getContentPane().add(getLabel_5());
		frmDodajKurs.getContentPane().add(getButton());
		frmDodajKurs.getContentPane().add(getButton_1());
	}
	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Sifra");
			label.setBounds(10, 27, 46, 14);
		}
		return label;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setColumns(10);
			textFieldSifra.setBounds(10, 48, 190, 20);
		}
		return textFieldSifra;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Naziv");
			label_1.setBounds(234, 27, 46, 14);
		}
		return label_1;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setColumns(10);
			textFieldNaziv.setBounds(234, 48, 190, 20);
		}
		return textFieldNaziv;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Prodajni kurs");
			label_2.setBounds(10, 91, 80, 14);
		}
		return label_2;
	}
	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setColumns(10);
			textFieldProdajni.setBounds(10, 116, 190, 20);
		}
		return textFieldProdajni;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Kupovni kurs");
			label_3.setBounds(234, 91, 80, 14);
		}
		return label_3;
	}
	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setColumns(10);
			textFieldKupovni.setBounds(234, 116, 190, 20);
		}
		return textFieldKupovni;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("Srednji kurs");
			label_4.setBounds(10, 155, 80, 14);
		}
		return label_4;
	}
	private JTextField getTextFieldSrednji() {
		if (textFieldSrednji == null) {
			textFieldSrednji = new JTextField();
			textFieldSrednji.setColumns(10);
			textFieldSrednji.setBounds(10, 180, 190, 20);
		}
		return textFieldSrednji;
	}
	private JTextField getTextFieldSkraceni() {
		if (textFieldSkraceni == null) {
			textFieldSkraceni = new JTextField();
			textFieldSkraceni.setColumns(10);
			textFieldSkraceni.setBounds(234, 180, 190, 20);
		}
		return textFieldSkraceni;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("Skraceni naziv");
			label_5.setBounds(234, 155, 80, 14);
		}
		return label_5;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Dodaj kurs");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String tekst = "Sifra kursa: " + textFieldSifra.getText() + " Naziv: " + textFieldNaziv.getText() + " Kupovni: " + textFieldKupovni.getText() + " Prodajni: " 
							+ textFieldProdajni.getText() + " Srednji: " + textFieldSrednji.getText() + " Skraceni: " + textFieldSkraceni.getText();
					
					String curr = gp.getTextPane().getText();
					gp.getTextPane().setText(curr + " " + tekst);
					
					frmDodajKurs.dispose();
					
				}
			});
			button.setBounds(10, 227, 190, 23);
		}
		return button;
	}
	private JButton getButton_1() {
		if (button_1 == null) {
			button_1 = new JButton("Odustani");
			button_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frmDodajKurs.dispose();
				}
			});
			button_1.setBounds(234, 227, 190, 23);
		}
		return button_1;
	}
}
