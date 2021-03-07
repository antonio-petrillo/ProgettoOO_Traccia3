package GuiFood;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classi.Controller;
import Classi.Ordine;
import Classi.Ristorante;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JComboBox;

public class SceltaRistorante extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
    private String Cerca_cmd = "Cerca";  
    private String Indietro_cmd = "Indietro";  
    private Controller ctrl;
    private JComboBox comboBox_sceltaRistorante;
    private Ristorante[] ristoranti;
	
    private JButton btnIndietro;
    private JButton btn_SceltaRistorante;
    
	public SceltaRistorante(Controller ctrl) {
		setUndecorated(true);
		setResizable(false);
		setTitle("Scelta ristorante");
		setBounds(100, 100, 404, 207);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 140, 0));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.ctrl=ctrl;

		{
			JLabel lbl_sceltaRistorante = new JLabel("Da quale ristorante preferisci acquistare?");
			lbl_sceltaRistorante.setForeground(new Color(255, 255, 255));
			lbl_sceltaRistorante.setBackground(new Color(255, 255, 255));
			lbl_sceltaRistorante.setBounds(26, 69, 277, 16);
			contentPanel.add(lbl_sceltaRistorante);
		}
		{
			ristoranti = ctrl.ottieniRistoranti();
			String[] nomiRistoranti = new String[ristoranti.length];
			for(int i =0 ; i<ristoranti.length; i++) {
				nomiRistoranti[i] = ristoranti[i].getNome();
			}
			comboBox_sceltaRistorante = new JComboBox(nomiRistoranti);
			comboBox_sceltaRistorante.setBounds(16, 85, 369, 27);
			contentPanel.add(comboBox_sceltaRistorante);
		}
		{
			btn_SceltaRistorante = new JButton("Cerca");
			btn_SceltaRistorante.setForeground(new Color(255, 140, 0));
			btn_SceltaRistorante.setBounds(111, 134, 172, 29);
			contentPanel.add(btn_SceltaRistorante);
			btn_SceltaRistorante.addActionListener(this);


			{
				btnIndietro = new JButton("");
				btnIndietro.setBounds(6, 6, 35, 29);
				contentPanel.add(btnIndietro);
				btnIndietro.setIcon(ctrl.scaleImageIcon(new ImageIcon(Ordine.class.getResource("/Fattura./indietro.png")), 25, 25));
				btnIndietro.addActionListener(this);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(btn_SceltaRistorante)){
			ctrl.setRistorante(this.ristoranti[comboBox_sceltaRistorante.getSelectedIndex()].getCodiceRistorante());
			this.dispose();
			ctrl.visualizzazioneMenu();
		}else if(e.getSource().equals(Indietro_cmd)){
			this.dispose();
			ctrl.visualizzazioneLogin();
		}
	}
}
