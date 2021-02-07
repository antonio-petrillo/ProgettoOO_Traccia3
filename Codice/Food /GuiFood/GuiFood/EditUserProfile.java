package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;

// TODO : rimuovere il main, ed dopo il merge aggiungere il campo controller, ed aggiungere il box/rettangolo con il graphics2D 
public class EditUserProfile extends JFrame {

	private JPanel contentPane;
	private JTextField nameTextField;
	private JTextField phoneTextField;
	private JTextField emailTextField;
	private JTextField currentPasswordTextField;
	private JTextField newPasswordTextField;
	private JTextField confirmNewPasswordTextField;
	private JTextField provinceTextField;
	private JTextField cityTextField;
	private JTextField CAPTextField;
	private JTextField addressTextField;
	private JTextField numberAddressTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditUserProfile frame = new EditUserProfile();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EditUserProfile() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 720);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 165, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		JLabel userIcon = new JLabel();
		sl_contentPane.putConstraint(SpringLayout.NORTH, userIcon, 40, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, userIcon, 638, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, userIcon, -544, SpringLayout.EAST, contentPane);
		userIcon.setIcon(scaleImageIcon( new ImageIcon(EditUserProfile.class.getResource("/Accesso/user_icon.png")), 80, 80));
		contentPane.add(userIcon);
		
		JLabel nameLabel = new JLabel("Nome");
		sl_contentPane.putConstraint(SpringLayout.WEST, nameLabel, 528, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, nameLabel, -488, SpringLayout.SOUTH, contentPane);
		contentPane.add(nameLabel);
		
		nameTextField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, nameTextField, -2, SpringLayout.NORTH, nameLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, nameTextField, 0, SpringLayout.EAST, userIcon);
		contentPane.add(nameTextField);
		nameTextField.setColumns(10);
		
		JLabel phoneLabel = new JLabel("N. telefonico");
		sl_contentPane.putConstraint(SpringLayout.NORTH, phoneLabel, 17, SpringLayout.SOUTH, nameLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, phoneLabel, 0, SpringLayout.WEST, nameLabel);
		contentPane.add(phoneLabel);
		
		phoneTextField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, phoneTextField, 6, SpringLayout.SOUTH, nameTextField);
		sl_contentPane.putConstraint(SpringLayout.EAST, phoneTextField, 0, SpringLayout.EAST, userIcon);
		contentPane.add(phoneTextField);
		phoneTextField.setColumns(10);
		
		JLabel emailLabel = new JLabel("email");
		sl_contentPane.putConstraint(SpringLayout.NORTH, emailLabel, 6, SpringLayout.SOUTH, phoneLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, emailLabel, 0, SpringLayout.WEST, nameLabel);
		contentPane.add(emailLabel);
		
		emailTextField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, emailTextField, -2, SpringLayout.NORTH, emailLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, emailTextField, 0, SpringLayout.EAST, userIcon);
		contentPane.add(emailTextField);
		emailTextField.setColumns(10);
		
		JLabel currentPasswordLabel = new JLabel("Password attuale");
		sl_contentPane.putConstraint(SpringLayout.NORTH, currentPasswordLabel, 14, SpringLayout.SOUTH, emailLabel);
		contentPane.add(currentPasswordLabel);
		
		JLabel newPasswordLabel = new JLabel("Nuova password");
		sl_contentPane.putConstraint(SpringLayout.EAST, newPasswordLabel, 0, SpringLayout.EAST, currentPasswordLabel);
		contentPane.add(newPasswordLabel);
		
		JLabel confirmNewPasswordLabel = new JLabel("Conferma password");
		sl_contentPane.putConstraint(SpringLayout.EAST, confirmNewPasswordLabel, 0, SpringLayout.EAST, currentPasswordLabel);
		contentPane.add(confirmNewPasswordLabel);
		
		currentPasswordTextField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, currentPasswordTextField, 567, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, currentPasswordLabel, -38, SpringLayout.WEST, currentPasswordTextField);
		sl_contentPane.putConstraint(SpringLayout.NORTH, currentPasswordTextField, -2, SpringLayout.NORTH, currentPasswordLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, currentPasswordTextField, -482, SpringLayout.EAST, contentPane);
		contentPane.add(currentPasswordTextField);
		currentPasswordTextField.setColumns(10);
		
		newPasswordTextField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, newPasswordTextField, 38, SpringLayout.EAST, newPasswordLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, newPasswordTextField, -482, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, newPasswordLabel, 2, SpringLayout.NORTH, newPasswordTextField);
		sl_contentPane.putConstraint(SpringLayout.NORTH, newPasswordTextField, 16, SpringLayout.SOUTH, currentPasswordTextField);
		contentPane.add(newPasswordTextField);
		newPasswordTextField.setColumns(10);
		
		confirmNewPasswordTextField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.WEST, confirmNewPasswordTextField, 38, SpringLayout.EAST, confirmNewPasswordLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, confirmNewPasswordTextField, -482, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, confirmNewPasswordLabel, 2, SpringLayout.NORTH, confirmNewPasswordTextField);
		sl_contentPane.putConstraint(SpringLayout.NORTH, confirmNewPasswordTextField, 21, SpringLayout.SOUTH, newPasswordTextField);
		contentPane.add(confirmNewPasswordTextField);
		confirmNewPasswordTextField.setColumns(10);
		
		JLabel provinceLabel = new JLabel("Provincia");
		sl_contentPane.putConstraint(SpringLayout.NORTH, provinceLabel, 28, SpringLayout.SOUTH, confirmNewPasswordTextField);
		sl_contentPane.putConstraint(SpringLayout.WEST, provinceLabel, 0, SpringLayout.WEST, nameLabel);
		contentPane.add(provinceLabel);
		
		provinceTextField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, provinceTextField, -2, SpringLayout.NORTH, provinceLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, provinceTextField, 0, SpringLayout.WEST, nameTextField);
		contentPane.add(provinceTextField);
		provinceTextField.setColumns(10);
		
		JLabel cityLabel = new JLabel("Citta'");
		contentPane.add(cityLabel);
		
		cityTextField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, cityTextField, 26, SpringLayout.SOUTH, provinceTextField);
		sl_contentPane.putConstraint(SpringLayout.WEST, cityTextField, 476, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, cityTextField, -605, SpringLayout.EAST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, cityLabel, 2, SpringLayout.NORTH, cityTextField);
		sl_contentPane.putConstraint(SpringLayout.EAST, cityLabel, -28, SpringLayout.WEST, cityTextField);
		contentPane.add(cityTextField);
		cityTextField.setColumns(10);
		
		JLabel CAPLabel = new JLabel("CAP");
		sl_contentPane.putConstraint(SpringLayout.NORTH, CAPLabel, 0, SpringLayout.NORTH, cityLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, CAPLabel, 41, SpringLayout.EAST, cityTextField);
		contentPane.add(CAPLabel);
		
		CAPTextField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, CAPTextField, -2, SpringLayout.NORTH, cityLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, CAPTextField, 39, SpringLayout.EAST, CAPLabel);
		contentPane.add(CAPTextField);
		CAPTextField.setColumns(10);
		
		JLabel addressLabel = new JLabel("Via/Piazza");
		sl_contentPane.putConstraint(SpringLayout.NORTH, addressLabel, 28, SpringLayout.SOUTH, cityLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, addressLabel, 0, SpringLayout.WEST, cityLabel);
		contentPane.add(addressLabel);
		
		addressTextField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, addressTextField, -2, SpringLayout.NORTH, addressLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, addressTextField, 28, SpringLayout.EAST, addressLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, addressTextField, 0, SpringLayout.EAST, cityTextField);
		contentPane.add(addressTextField);
		addressTextField.setColumns(10);
		
		JLabel numberAddressLabel = new JLabel("Nº civico");
		sl_contentPane.putConstraint(SpringLayout.NORTH, numberAddressLabel, 0, SpringLayout.NORTH, addressLabel);
		sl_contentPane.putConstraint(SpringLayout.WEST, numberAddressLabel, 0, SpringLayout.WEST, CAPLabel);
		contentPane.add(numberAddressLabel);
		
		numberAddressTextField = new JTextField();
		sl_contentPane.putConstraint(SpringLayout.NORTH, numberAddressTextField, -2, SpringLayout.NORTH, addressLabel);
		sl_contentPane.putConstraint(SpringLayout.EAST, numberAddressTextField, 0, SpringLayout.EAST, CAPTextField);
		contentPane.add(numberAddressTextField);
		numberAddressTextField.setColumns(10);
		
		JButton saveButton = new JButton("Salva le modifiche");
		sl_contentPane.putConstraint(SpringLayout.NORTH, saveButton, 44, SpringLayout.SOUTH, addressTextField);
		sl_contentPane.putConstraint(SpringLayout.EAST, saveButton, -530, SpringLayout.EAST, contentPane);
		contentPane.add(saveButton);
	}

	static ImageIcon scaleImageIcon(ImageIcon image, int width, int height) {
		Image tmp = image.getImage();
		Image scaledImage = tmp.getScaledInstance(width, height, java.awt.Image.SCALE_SMOOTH);
		ImageIcon scaledImageIcon = new ImageIcon(scaledImage);
		return scaledImageIcon;
	}
}
