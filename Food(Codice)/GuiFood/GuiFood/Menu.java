package GuiFood;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JTextField;

import Classi.Controller;
import Classi.Prodotto;

import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JMenuBar;
import java.awt.FlowLayout;
import java.awt.Cursor;

public class Menu extends JFrame implements ActionListener,MouseListener {
    private static final long serialVersionUID = 1L;
    protected JFrame frame1;
  
    private Controller ctrl;
    private JScrollPane panelContent1; // cambia nome al panel dei prodotti
    private JPanel container;
	private JButton antipasti;
	private JButton primi;
	private JButton secondi;
	private JButton contorni;
	private JButton dolci;
	private JButton bevande;

	private String[] prezzo = {
			     "qualunque",
			     "0-5 €",
			     "5-10 €",
			     "10-20 €",
			     "20-75 €" };
	
	private  String[] MezziTrasporto = {
			 "qualunque",
			 "moto",
		     "bicicletta"};	

	private JComboBox comboBox_prezzo;
	private JComboBox comboBox_MezzoTrasporto;
	private String[] listaProdotti;
	private ArrayList<Prodotto> prodotti = new ArrayList<Prodotto> ();

	private JList listaGui;

    public Menu(Controller ctrl) {
        setTitle("Menù");
        this.getContentPane().setBackground(new Color(255, 165, 0));
        this.setResizable(false);
        this.setBounds(100, 100, 747, 504);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        this.ctrl=ctrl;

        
        this.setVisible(true);

        ///////////////

        prodotti = ctrl.ottieniProdotti();
        int size = prodotti.size();
        listaProdotti = new String[size];
        for (int i=0; i<size; i++) {
        	listaProdotti[i] = prodotti.get(i).getNome();
         }
        listaGui = new JList<>(listaProdotti);
        listaGui.addMouseListener(this);
        
        panelContent1.add(listaGui);
        getContentPane().add(panelContent1);
        
        ///////////////

            
        // TODO : porta la definizione dei bottoni fuori dal costruttore
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 165, 0));
        panel_1.setBounds(559, 0, 188, 481);
        getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        JLabel username = new JLabel("Nickname Utente");
        username.setBounds(0, 22, 138, 16);
        panel_1.add(username);
        
        JSeparator separator_1 = new JSeparator();
        separator_1.setForeground(Color.WHITE);
        separator_1.setBounds(0, 34, 188, 12);
        panel_1.add(separator_1);

        JSeparator separator_2 = new JSeparator();
        separator_2.setForeground(Color.WHITE);
        separator_2.setBounds(0, 436, 188, 12);
        panel_1.add(separator_2);
        
        JButton completeOrder = new JButton("Acquista");
        completeOrder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        completeOrder.setForeground(new Color(255, 140, 0));
        completeOrder.setBounds(63, 446, 99, 29);
        panel_1.add(completeOrder);
		completeOrder.setIcon(ctrl.scaleImageIcon(new ImageIcon(Menu.class.getResource("/Menu./carrello.png")), 25, 25));
        completeOrder.addActionListener(this);
        
        JPanel panel_servizi = new JPanel();
        panel_servizi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel_servizi.setOpaque(false);
        panel_servizi.setEnabled(false);
        panel_servizi.setFocusable(false);
        panel_servizi.setBackground(new Color(255, 165, 0));
        panel_servizi.setBounds(146, 6, 36, 32);
        panel_1.add(panel_servizi);
        
        JMenuBar menuBar1 = new JMenuBar();
        panel_servizi.add(menuBar1);
        
        JMenu Servizi = new JMenu("");
        menuBar1.add(Servizi);
		Servizi.setIcon(ctrl.scaleImageIcon(new ImageIcon(Menu.class.getResource("/Menu./Menu.png")), 18, 18));
        Servizi.addActionListener(this);

        JMenuItem ModificaProfilo = new JMenuItem("Modifica Profilo");
        ModificaProfilo.setForeground(new Color(255, 140, 0));
        Servizi.add(ModificaProfilo);
		ModificaProfilo.setIcon(ctrl.scaleImageIcon(new ImageIcon(Menu.class.getResource("/Menu./Modifica.png")), 20, 20));
        ModificaProfilo.addActionListener(this);
        
        JMenuItem Uscire = new JMenuItem("Uscire");
        Uscire.setForeground(new Color(255, 140, 0));
        Servizi.add(Uscire);
		Uscire.setIcon(ctrl.scaleImageIcon(new ImageIcon(Menu.class.getResource("/Menu./Uscire.png")), 25, 25));
        Uscire.addActionListener(this);
                
        JPanel globalContainer = new JPanel();
        globalContainer.setBounds(0, 0, 560, 481);
        getContentPane().add(globalContainer);
        globalContainer.setLayout(null);
        
        JPanel panelMenu = new JPanel();
        panelMenu.setBackground(new Color(255, 140, 0));
        panelMenu.setBounds(0, 0, 560, 111);
        globalContainer.add(panelMenu);
        panelMenu.setLayout(null);
        
        JPanel panelText = new JPanel();
        panelText.setBackground(new Color(255, 140, 0));
        panelText.setBounds(0, 0, 560, 51);
        panelMenu.add(panelText);
        panelText.setLayout(null);
        
        JPanel panelBtn = new JPanel();
        panelBtn.setBackground(new Color(255, 140, 0));
        panelBtn.setBounds(0, 44, 560, 51);
        panelMenu.add(panelBtn);
        panelBtn.setLayout(null);
        
        antipasti = new JButton("Antipasti");
        antipasti.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        antipasti.setForeground(new Color(255, 140, 0));
        antipasti.setBackground(new Color(255, 255, 255));
        antipasti.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
        antipasti.setActionCommand("Antipasti");
        antipasti.setBounds(6, 12, 102, 39);
		antipasti.setIcon(ctrl.scaleImageIcon(new ImageIcon(Menu.class.getResource("/Menu./antipasti.png")), 30, 30));
        panelBtn.add(antipasti);
        antipasti.addActionListener(this);
        
        primi = new JButton("primi");
        primi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        primi.setForeground(new Color(255, 140, 0));
        primi.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
        primi.setActionCommand("Primi");
        primi.setBounds(107, 12, 84, 39);
		primi.setIcon(ctrl.scaleImageIcon(new ImageIcon(Menu.class.getResource("/Menu./primi.png")), 30, 30));
        panelBtn.add(primi);
        primi.addActionListener(this);

        secondi = new JButton("secondi");
        secondi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        secondi.setForeground(new Color(255, 140, 0));
        secondi.setFont(new Font("Lucida Grande", Font.PLAIN, 11));
        secondi.setActionCommand("Secondi");
        secondi.setBounds(189, 12, 96, 39);
		secondi.setIcon(ctrl.scaleImageIcon(new ImageIcon(Menu.class.getResource("/Menu./secondi.png")), 30, 30));
        panelBtn.add(secondi);
        secondi.addActionListener(this);

        contorni = new JButton("contorni");
        contorni.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        contorni.setForeground(new Color(255, 140, 0));
        contorni.setActionCommand("Contorini");
        contorni.setBounds(284, 11, 96, 39);
		contorni.setIcon(ctrl.scaleImageIcon(new ImageIcon(Menu.class.getResource("/Menu./contorni.png")), 30, 30));
        panelBtn.add(contorni);
        contorni.addActionListener(this);
        
        dolci = new JButton("dolci");
        dolci.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        dolci.setForeground(new Color(255, 140, 0));
        dolci.setActionCommand("Dolci");
        dolci.setBounds(379, 11, 84, 39);
		dolci.setIcon(ctrl.scaleImageIcon(new ImageIcon(Menu.class.getResource("/Menu./dolci.png")), 30, 30));
        panelBtn.add(dolci);
        dolci.addActionListener(this);
        
        bevande = new JButton("bevande");
        bevande.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        bevande.setForeground(new Color(255, 140, 0));
        bevande.setActionCommand("Bevande");
        bevande.setBounds(464, 11, 90, 39);
		bevande.setIcon(ctrl.scaleImageIcon(new ImageIcon(Menu.class.getResource("/Menu./bevande.png")), 30, 30));
        panelBtn.add(bevande);
        bevande.addActionListener(this);
        
        panelMenu.add(panelBtn);
        
        container = new JPanel();
        container.setBackground(new Color(255, 140, 0));
        container.setBounds(0, 111, 560, 370);
        globalContainer.add(container);
        
        container.add(panelContent1);
       
        globalContainer.add(panelMenu, BorderLayout.NORTH);
        globalContainer.add(container, BorderLayout.NORTH);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
        JLabel lbl_Prezzo = new JLabel("prezzo");
        lbl_Prezzo.setForeground(Color.WHITE);
        lbl_Prezzo.setBounds(6, 18, 48, 16);
        panelText.add(lbl_Prezzo);
        
        comboBox_prezzo = new JComboBox(prezzo);
        comboBox_prezzo.setBounds(50, 14, 127, 27);
        comboBox_prezzo.setVisible(true);
        panelText.add(comboBox_prezzo);
        
        JLabel lblMezzoDiTrasporto = new JLabel("mezzo di trasporto");
        lblMezzoDiTrasporto.setForeground(Color.WHITE);
        lblMezzoDiTrasporto.setBounds(189, 14, 143, 29);
        panelText.add(lblMezzoDiTrasporto);
        
        comboBox_MezzoTrasporto = new JComboBox(MezziTrasporto);
        comboBox_MezzoTrasporto.setBounds(315, 14, 143, 27);
        comboBox_MezzoTrasporto.setVisible(true);
        panelText.add(comboBox_MezzoTrasporto); 
        
    }
    
    public void actionPerformed(ActionEvent e) {
    }

          
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}

   
         
   

