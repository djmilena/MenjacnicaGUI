package menjacnica.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTextPane;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenjacnicaGUI{// extends JFrame{

	private JFrame frmMenjacnica;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenuItem mntmAbout;
	private JMenuItem mntmOpen;
	private JMenuItem mntmEdit;
	private JMenuItem mntmExit;
	private JPanel panel;
	private JButton btnDodajKurs;
	private JButton btnObrisiKurs;
	private JButton btnIzvrsiIzmene;
	private JPanel panel_1;
	private JTextPane textPane;
	private JPanel panel_2;
	private JTable table;
	private JScrollPane scrollPane_1;
	private JPopupMenu popupMenu;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmObrisiKurs;
	private JMenuItem mntmIzvrsiIzmene;
	
	private MenjacnicaGUI glavniProzor;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI window = new MenjacnicaGUI();
					window.frmMenjacnica.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenjacnicaGUI() {
		
		initialize();
		this.glavniProzor = this;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMenjacnica = new JFrame();
		frmMenjacnica.setTitle("Menjacnica");
		frmMenjacnica.setBounds(100, 100, 511, 289);
		frmMenjacnica.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frmMenjacnica.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent arg0) {
				int opcija = 
						JOptionPane.showConfirmDialog(
							null, "Da li zelite da izadjete?",
							"Izlazak", JOptionPane.YES_NO_OPTION);
					
					if (opcija == JOptionPane.YES_OPTION)
						System.exit(0);
			}
			
			
			
		});
		frmMenjacnica.setJMenuBar(getMenuBar());
		frmMenjacnica.getContentPane().add(getPanel(), BorderLayout.EAST);
		frmMenjacnica.getContentPane().add(getPanel_1(), BorderLayout.SOUTH);
		frmMenjacnica.getContentPane().add(getPanel_2(), BorderLayout.CENTER);
	}

	private JMenuBar getMenuBar() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmEdit());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,
							"Aplikacija menjacnica, autor Milena Djordjevic",
							"O programu",
							JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return mntmAbout;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					JFileChooser chooser = new JFileChooser();
					int returnVal = chooser.showOpenDialog(null);
					
				    if(returnVal == JFileChooser.APPROVE_OPTION) {
				    	
				    	File f = chooser.getSelectedFile();
				    	try {

					    	String text = textPane.getText().concat("Ucitan fajl: " + f.getAbsolutePath());
					    	textPane.setText(text);
						} catch (Exception e) {
							
						}
				    	
				     
				    }
				    else if(returnVal == JFileChooser.CANCEL_OPTION) {
				    	chooser.setVisible(false);
				    }
				}
			});
			mntmOpen.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/file.gif")));
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		}
		return mntmOpen;
	}
	private JMenuItem getMntmEdit() {
		if (mntmEdit == null) {
			mntmEdit = new JMenuItem("Save");
			mntmEdit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser chooser = new JFileChooser();
					int returnVal = chooser.showSaveDialog(null);
					if(returnVal == JFileChooser.APPROVE_OPTION) {
						File f = chooser.getSelectedFile();
						
						try {
							String text = textPane.getText().concat("Sacuvan fajl: " + f.getAbsolutePath());
					    	textPane.setText(text);
							
						} catch (Exception ex) {
						
						}
					     
					    }
					    else if(returnVal == JFileChooser.CANCEL_OPTION) {
					    	chooser.setVisible(false);
					    }
				}
			});
			mntmEdit.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
			mntmEdit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmEdit;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int opcija = 
							JOptionPane.showConfirmDialog(
								null, "Da li zelite da izadjete?",
								"Izlazak", JOptionPane.YES_NO_CANCEL_OPTION);
						
						if (opcija == JOptionPane.YES_OPTION)
							System.exit(0);
						
				}
			});
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}
	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLayout(new MigLayout("", "[]", "[][][]"));
			panel.add(getBtnDodajKurs(), "cell 0 0,growx");
			panel.add(getBtnObrisiKurs(), "cell 0 1,growx");
			panel.add(getBtnIzvrsiIzmene(), "cell 0 2");
		}
		return panel;
	}
	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
			btnDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					DodajKursGUI dk = new DodajKursGUI(glavniProzor);
					dk.DodajKursProzor();
					
					//dk.setVisible(true);
					
				}
			});
		}
		return btnDodajKurs;
	}
	private JButton getBtnObrisiKurs() {
		if (btnObrisiKurs == null) {
			btnObrisiKurs = new JButton("Obrisi kurs");
		}
		return btnObrisiKurs;
	}
	private JButton getBtnIzvrsiIzmene() {
		if (btnIzvrsiIzmene == null) {
			btnIzvrsiIzmene = new JButton("Izvrsi izmene");
		}
		return btnIzvrsiIzmene;
	}
	private JPanel getPanel_1() {
		if (panel_1 == null) {
			panel_1 = new JPanel();
			panel_1.setBorder(new TitledBorder(null, "STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			panel_1.setLayout(new BorderLayout(0, 0));
			panel_1.add(getTextPane());
		}
		return panel_1;
	}
	JTextPane getTextPane() {
		if (textPane == null) {
			textPane = new JTextPane();
			textPane.setBounds(new Rectangle(0, 0, 550, 50));
			textPane.setSize(new Dimension(500, 100));
		}
		return textPane;
	}
	private JPanel getPanel_2() {
		if (panel_2 == null) {
			panel_2 = new JPanel();
			panel_2.add(getScrollPane_1());
		}
		return panel_2;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setCellSelectionEnabled(true);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			table.setFillsViewportHeight(true);
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"Sifra", "Skraceni naziv", "Prodajni kurs", "Srednji kurs", "Srednji kurs", "Naziv"
				}
			));
			table.getColumnModel().getColumn(1).setPreferredWidth(79);
			table.setPreferredScrollableViewportSize(new Dimension(400, 400));
			table.setPreferredSize(new Dimension(350, 200));
			addPopup(table, getPopupMenu());
		}
		return table;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setPreferredSize(new Dimension(400, 180));
			scrollPane_1.setViewportView(getTable());
		}
		return scrollPane_1;
	}
	private JPopupMenu getPopupMenu() {
		if (popupMenu == null) {
			popupMenu = new JPopupMenu();
			popupMenu.add(getMntmDodajKurs());
			popupMenu.add(getMntmObrisiKurs());
			popupMenu.add(getMntmIzvrsiIzmene());
		}
		return popupMenu;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
			mntmDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					DodajKursGUI dkp = new DodajKursGUI(glavniProzor);
					dkp.setVisible(true);
				}
			});
		}
		return mntmDodajKurs;
	}
	private JMenuItem getMntmObrisiKurs() {
		if (mntmObrisiKurs == null) {
			mntmObrisiKurs = new JMenuItem("Obrisi kurs");
		}
		return mntmObrisiKurs;
	}
	private JMenuItem getMntmIzvrsiIzmene() {
		if (mntmIzvrsiIzmene == null) {
			mntmIzvrsiIzmene = new JMenuItem("Izvrsi izmene");
		}
		return mntmIzvrsiIzmene;
	}
}
