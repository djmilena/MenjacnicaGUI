package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Checkbox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ObrisiKursGUI {

	private JFrame frmObrisiKurs;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JTextField textFieldSifra;
	private JTextField textFieldNaziv;
	private JTextField textFieldProdajni;
	private JTextField textFieldSrednji;
	private JTextField textFieldKupovni;
	private JTextField textFieldSkraceni;
	private JButton button;
	private JButton btnObrisi;
	private Checkbox checkbox;
	
	private static MenjacnicaGUI gp;
	
	/**
	 * Launch the application.
	 */
	public static void ObrisiProzor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI window = new ObrisiKursGUI(gp);
					window.frmObrisiKurs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ObrisiKursGUI(MenjacnicaGUI gp) {
		initialize();
		this.gp = gp;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmObrisiKurs = new JFrame();
		frmObrisiKurs.setResizable(false);
		frmObrisiKurs.setTitle("Obrisi kurs");
		frmObrisiKurs.setBounds(100, 100, 450, 300);
		frmObrisiKurs.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmObrisiKurs.getContentPane().setLayout(null);
		frmObrisiKurs.getContentPane().add(getLabel());
		frmObrisiKurs.getContentPane().add(getLabel_1());
		frmObrisiKurs.getContentPane().add(getLabel_2());
		frmObrisiKurs.getContentPane().add(getLabel_3());
		frmObrisiKurs.getContentPane().add(getLabel_4());
		frmObrisiKurs.getContentPane().add(getLabel_5());
		frmObrisiKurs.getContentPane().add(getTextFieldSifra());
		frmObrisiKurs.getContentPane().add(getTextFieldNaziv());
		frmObrisiKurs.getContentPane().add(getTextFieldProdajni());
		frmObrisiKurs.getContentPane().add(getTextFieldSrednji());
		frmObrisiKurs.getContentPane().add(getTextFieldKupovni());
		frmObrisiKurs.getContentPane().add(getTextFieldSkraceni());
		frmObrisiKurs.getContentPane().add(getButton());
		frmObrisiKurs.getContentPane().add(getBtnObrisi());
		frmObrisiKurs.getContentPane().add(getCheckbox());
	}

	private JLabel getLabel() {
		if (label == null) {
			label = new JLabel("Sifra");
			label.setBounds(10, 28, 46, 14);
		}
		return label;
	}
	private JLabel getLabel_1() {
		if (label_1 == null) {
			label_1 = new JLabel("Naziv");
			label_1.setBounds(242, 28, 46, 14);
		}
		return label_1;
	}
	private JLabel getLabel_2() {
		if (label_2 == null) {
			label_2 = new JLabel("Prodajni kurs");
			label_2.setBounds(10, 85, 80, 14);
		}
		return label_2;
	}
	private JLabel getLabel_3() {
		if (label_3 == null) {
			label_3 = new JLabel("Srednji kurs");
			label_3.setBounds(10, 154, 80, 14);
		}
		return label_3;
	}
	private JLabel getLabel_4() {
		if (label_4 == null) {
			label_4 = new JLabel("Kupovni kurs");
			label_4.setBounds(242, 85, 80, 14);
		}
		return label_4;
	}
	private JLabel getLabel_5() {
		if (label_5 == null) {
			label_5 = new JLabel("Skraceni naziv");
			label_5.setBounds(242, 154, 80, 14);
		}
		return label_5;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setColumns(10);
			textFieldSifra.setBounds(10, 53, 190, 20);
		}
		return textFieldSifra;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setColumns(10);
			textFieldNaziv.setBounds(244, 54, 190, 20);
		}
		return textFieldNaziv;
	}
	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setColumns(10);
			textFieldProdajni.setBounds(10, 110, 190, 20);
		}
		return textFieldProdajni;
	}
	private JTextField getTextFieldSrednji() {
		if (textFieldSrednji == null) {
			textFieldSrednji = new JTextField();
			textFieldSrednji.setColumns(10);
			textFieldSrednji.setBounds(10, 179, 190, 20);
		}
		return textFieldSrednji;
	}
	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setColumns(10);
			textFieldKupovni.setBounds(244, 110, 190, 20);
		}
		return textFieldKupovni;
	}
	private JTextField getTextFieldSkraceni() {
		if (textFieldSkraceni == null) {
			textFieldSkraceni = new JTextField();
			textFieldSkraceni.setColumns(10);
			textFieldSkraceni.setBounds(244, 179, 190, 20);
		}
		return textFieldSkraceni;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Odustani");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					frmObrisiKurs.dispose();
					
				}
			});
			button.setBounds(244, 237, 190, 23);
		}
		return button;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String tekst = "Sifra kursa: " + textFieldSifra.getText() + " Naziv: " + textFieldNaziv.getText() + " Kupovni: " + textFieldKupovni.getText() + " Prodajni: " 
							+ textFieldProdajni.getText() + " Srednji: " + textFieldSrednji.getText() + " Skraceni: " + textFieldSkraceni.getText();
					
					String curr = gp.getTextPane().getText();
					gp.getTextPane().setText(curr + " " + tekst);
					
					frmObrisiKurs.dispose();
					
				}
			});
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(10, 237, 190, 23);
		}
		return btnObrisi;
	}
	private Checkbox getCheckbox() {
		if (checkbox == null) {
			checkbox = new Checkbox("Zaista obrisi kurs");
			checkbox.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(e.getStateChange() == ItemEvent.SELECTED) {
						getBtnObrisi().setEnabled(true);
					}
					if(e.getStateChange() == ItemEvent.DESELECTED) {
						getBtnObrisi().setEnabled(false);
					}
					
				}
			});
			checkbox.setBounds(10, 205, 118, 22);
		}
		return checkbox;
	}
}
