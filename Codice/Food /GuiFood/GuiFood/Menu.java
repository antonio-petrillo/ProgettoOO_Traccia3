package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.SpringLayout;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JList;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Panel;

public class Menu {

	private JFrame frame;
	private JTextField searchField;

	/**
	 * Launch the application.
	 */
	// TODO : rimuovere il main, ed dopo il merge aggiungere il campo controller 
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel cartPane = new JPanel();
		cartPane.setBackground(Color.GRAY);
		frame.getContentPane().add(cartPane, BorderLayout.EAST);
		cartPane.setLayout(new BorderLayout(0, 0));
		
		JPanel cartInfo = new JPanel();
		cartInfo.setBackground(new Color(255, 165, 0));
		cartInfo.setToolTipText("");
		cartPane.add(cartInfo, BorderLayout.NORTH);
     	cartInfo.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel username = new JLabel("username placeholder");
		cartInfo.add(username);
		
		JButton userAction = new JButton("azioni utente");
		userAction.setPreferredSize(new Dimension(100,40));
		userAction.setFocusable(false);
		cartInfo.add(userAction);
		
		JList cartItem = new JList();
		cartPane.add(cartItem, BorderLayout.CENTER);
		
		JPanel cartAction = new JPanel();
		cartAction.setBackground(new Color(255, 165, 0));
		cartPane.add(cartAction, BorderLayout.SOUTH);
		
		JButton completeOrder = new JButton("Acquista");
		cartAction.add(completeOrder);
		
		JPanel menuPane = new JPanel();
		frame.getContentPane().add(menuPane, BorderLayout.CENTER);
		menuPane.setLayout(new BorderLayout(0, 0));
		
		JToolBar menuBar = new JToolBar();
		menuBar.setBackground(new Color(255, 165, 0));
		menuPane.add(menuBar, BorderLayout.NORTH);
		
		JButton antipasti = new JButton("anitpasti");
		antipasti.setFocusable(false);
		antipasti.setIcon(scaleImageIcon(new ImageIcon(Menu.class.getResource("/Menu/antipasti.png")), 32, 32));
		//antipasti.setHorizontalTextPosition(JButton.CENTER);
		//antipasti.setVerticalTextPosition(JButton.CENTER);
		antipasti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(antipasti);
		
		JButton primi = new JButton("primi");
		primi.setFocusable(false);
		primi.setIcon(scaleImageIcon(new ImageIcon(Menu.class.getResource("/Menu/primi.png")), 32, 32));
		primi.setPreferredSize(new Dimension(100,40));
		menuBar.add(primi);
		
		JButton secondi = new JButton("secondi");
		secondi.setFocusable(false);
		secondi.setIcon(scaleImageIcon(new ImageIcon(Menu.class.getResource("/Menu/secondi.png")), 32, 32));
		secondi.setPreferredSize(new Dimension(100,40));
		menuBar.add(secondi);
		
		JButton contorni = new JButton("contorni");
		contorni.setFocusable(false);
		contorni.setIcon(scaleImageIcon(new ImageIcon(Menu.class.getResource("/Menu/contorni.png")), 32, 32));
		antipasti.setPreferredSize(new Dimension(100,40));
		menuBar.add(contorni);
		
		JButton dolci = new JButton("dolci");
		dolci.setFocusable(false);
		dolci.setIcon(scaleImageIcon(new ImageIcon(Menu.class.getResource("/Menu/dolci.png")), 32, 32));
		dolci.setPreferredSize(new Dimension(100,40));
		menuBar.add(dolci);
		
		JButton bevande = new JButton("bevande");
		bevande.setFocusable(false);
		bevande.setIcon(scaleImageIcon(new ImageIcon(Menu.class.getResource("/Menu/bevande.png")), 32, 32));
		bevande.setPreferredSize(new Dimension(100,40));
		menuBar.add(bevande);
		
		
		
		JScrollPane productPane = new JScrollPane();
		menuPane.add(productPane);
		
		Panel searchBar = new Panel();
		searchBar.setBackground(new Color(255, 165, 0));
		frame.getContentPane().add(searchBar, BorderLayout.NORTH);
		FlowLayout flowLayout = (FlowLayout) searchBar.getLayout();
		flowLayout.setAlignOnBaseline(true);
		flowLayout.setAlignment(FlowLayout.LEFT);
		
		searchField = new JTextField();
		searchBar.add(searchField);
		searchField.setColumns(10);
		
		JButton searchButton = new JButton("Cerca");
		searchButton.setFocusable(false);
		searchBar.add(searchButton);
		
		JButton filters = new JButton("Filtri");
		searchBar.setFocusable(false);
		searchBar.add(filters);
	}

	static ImageIcon scaleImageIcon(ImageIcon image, int width, int height) {
		Image tmp = image.getImage();
		Image scaledImage = tmp.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
		return scaledImageIcon;
	}
}
