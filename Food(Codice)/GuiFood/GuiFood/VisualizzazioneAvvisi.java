package GuiFood;

import java.awt.BorderLayout;

import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import Classi.Controller;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.JTextArea;

public class VisualizzazioneAvvisi extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPanel = new JPanel();

	private Controller ctrl;
	
	/**
	 * @wbp.parser.constructor
	 */
	public VisualizzazioneAvvisi(Controller ctrl, String ... stringErrore) {
		setBounds(new Rectangle(0, 13, 0, 0));
		setResizable(false);
		setForeground(new Color(255, 165, 0));
		setBackground(new Color(255, 165, 0));
		setBounds(100, 100, 329, 219);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 165, 0));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		DefaultListModel<String>  defaultListModel = new DefaultListModel<String>();
		JList<String> listaAvvisi = new JList<>(defaultListModel);
		listaAvvisi.setBackground(Color.ORANGE);
		getContentPane().add(new JScrollPane(listaAvvisi));
		for(String errore: stringErrore) {
			defaultListModel.addElement(errore);
		}
		this.ctrl=ctrl;
		this.pack();
	}

	public VisualizzazioneAvvisi(Controller ctrl, ArrayList<String> stringErrore) {
		setBounds(new Rectangle(0, 13, 0, 0));
		setResizable(false);
		setForeground(new Color(255, 165, 0));
		setBackground(new Color(255, 165, 0));
		setBounds(100, 100, 329, 219);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 165, 0));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		DefaultListModel<String>  defaultListModel = new DefaultListModel<String>();
		JList<String> listaAvvisi = new JList<>(defaultListModel);
		getContentPane().add(listaAvvisi);
		for(String errore: stringErrore) {
			defaultListModel.addElement(errore);
		}
		this.ctrl=ctrl;
		this.pack();
	}
}
