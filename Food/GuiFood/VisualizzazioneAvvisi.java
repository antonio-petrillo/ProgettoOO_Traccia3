package GuiFood;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classi.Controller;

import java.awt.Color;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Rectangle;

public class VisualizzazioneAvvisi extends JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPanel = new JPanel();
	Controller ctrl;
	
	public VisualizzazioneAvvisi(Controller ctrl,String stringErrore) {
		setBounds(new Rectangle(0, 13, 0, 0));
		setResizable(false);
		setForeground(new Color(255, 165, 0));
		setBackground(new Color(255, 165, 0));
		setBounds(100, 100, 294, 150);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 165, 0));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		this.ctrl=ctrl;
		
		JLabel stringErroreCommesso = new JLabel(stringErrore);
		stringErroreCommesso.setForeground(new Color(255, 255, 255));
		stringErroreCommesso.setHorizontalAlignment(SwingConstants.CENTER);
		stringErroreCommesso.setFont(new Font("Dialog", Font.ITALIC, 14));
		stringErroreCommesso.setBounds(65, 43, 160, 34);
		contentPanel.add(stringErroreCommesso);
	}
}



