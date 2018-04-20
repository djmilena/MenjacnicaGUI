package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JComboBox;
import java.awt.Choice;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class IzvrsiZamenuGUI {

	private JFrame frmIzvrsiZamenu;
	private JLabel lblKupovni;
	private JLabel lblValuta;
	private JLabel lblProdajniKurs;
	private JTextField textFieldKupovni;
	private JTextField textFieldProdajni;
	private JLabel lblIznos;
	private JLabel lblVrstaTransakcije;
	private JTextField textField;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnProdaja;
	private JSlider slider;
	private JButton button;
	private JButton btnIzvrsiZamenu;
	
	private static MenjacnicaGUI gp;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void IzmeniProzor() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI window = new IzvrsiZamenuGUI(gp);
					window.frmIzvrsiZamenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI gp) {
		initialize();
		this.gp = gp;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmIzvrsiZamenu = new JFrame();
		frmIzvrsiZamenu.setResizable(false);
		frmIzvrsiZamenu.setTitle("Izvrsi zamenu");
		frmIzvrsiZamenu.setBounds(100, 100, 450, 300);
		frmIzvrsiZamenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmIzvrsiZamenu.getContentPane().setLayout(null);
		frmIzvrsiZamenu.getContentPane().add(getLblKupovni());
		frmIzvrsiZamenu.getContentPane().add(getLblValuta());
		frmIzvrsiZamenu.getContentPane().add(getLblProdajniKurs());
		frmIzvrsiZamenu.getContentPane().add(getTextFieldKupovni());
		frmIzvrsiZamenu.getContentPane().add(getTextFieldProdajni());
		frmIzvrsiZamenu.getContentPane().add(getLblIznos());
		frmIzvrsiZamenu.getContentPane().add(getLblVrstaTransakcije());
		frmIzvrsiZamenu.getContentPane().add(getTextField());
		frmIzvrsiZamenu.getContentPane().add(getRdbtnNewRadioButton());
		frmIzvrsiZamenu.getContentPane().add(getRdbtnProdaja());
		frmIzvrsiZamenu.getContentPane().add(getSlider());
		frmIzvrsiZamenu.getContentPane().add(getButton());
		frmIzvrsiZamenu.getContentPane().add(getBtnIzvrsiZamenu());
		frmIzvrsiZamenu.getContentPane().add(getComboBox());
	}

	private JLabel getLblKupovni() {
		if (lblKupovni == null) {
			lblKupovni = new JLabel("Kupovni kurs");
			lblKupovni.setBounds(10, 11, 66, 14);
		}
		return lblKupovni;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setBounds(210, 11, 46, 14);
		}
		return lblValuta;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(339, 11, 73, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextFieldKupovni() {
		if (textFieldKupovni == null) {
			textFieldKupovni = new JTextField();
			textFieldKupovni.setEditable(false);
			textFieldKupovni.setBounds(10, 34, 160, 20);
			textFieldKupovni.setColumns(10);
		}
		return textFieldKupovni;
	}
	private JTextField getTextFieldProdajni() {
		if (textFieldProdajni == null) {
			textFieldProdajni = new JTextField();
			textFieldProdajni.setEditable(false);
			textFieldProdajni.setBounds(274, 34, 160, 20);
			textFieldProdajni.setColumns(10);
		}
		return textFieldProdajni;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(10, 100, 46, 14);
		}
		return lblIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(210, 79, 90, 14);
		}
		return lblVrstaTransakcije;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(10, 125, 120, 20);
		}
		return textField;
	}
	private JRadioButton getRdbtnNewRadioButton() {
		if (rdbtnNewRadioButton == null) {
			rdbtnNewRadioButton = new JRadioButton("Kupovina");
			buttonGroup.add(rdbtnNewRadioButton);
			rdbtnNewRadioButton.setSelected(true);
			rdbtnNewRadioButton.setBounds(228, 100, 109, 23);
			
		}
		return rdbtnNewRadioButton;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			buttonGroup.add(rdbtnProdaja);
			rdbtnProdaja.setBounds(228, 124, 109, 23);
			
		}
		return rdbtnProdaja;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.setMajorTickSpacing(10);
			slider.setSnapToTicks(true);
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.setBounds(10, 166, 424, 59);
			slider.addChangeListener(new ChangeListener() {
				
				@Override
				public void stateChanged(ChangeEvent e) {
					int broj = slider.getValue();
					textField.setText(broj+" ");
					
				}
			});
			
			
		}
		return slider;
	}
	private JButton getButton() {
		if (button == null) {
			button = new JButton("Odustani");
			button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frmIzvrsiZamenu.dispose();
				}
			});
			button.setBounds(244, 236, 190, 23);
		}
		return button;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String s = " Vrsta transakcije: ";
					
					if(rdbtnNewRadioButton.isSelected() == true)
						s = s + "kupovina";
						
					
					if(rdbtnProdaja.isSelected() == true)
						s = s + "prodaja";
					
					s = s + " Valuta "+ comboBox.getSelectedItem()+" Iznos: " + textField.getText()  ;
					
					String curr = gp.getTextPane().getText();
					gp.getTextPane().setText(curr+" " +s);
					
					frmIzvrsiZamenu.dispose();
				}
			});
			btnIzvrsiZamenu.setBounds(10, 236, 190, 23);
		}
		return btnIzvrsiZamenu;
	}

	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.addItem("EUR");
			comboBox.addItem("USD");
			comboBox.addItem("CHF");
			comboBox.setSelectedItem(null);
			comboBox.setBounds(196, 34, 52, 20);
		}
		return comboBox;
	}
}
