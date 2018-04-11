package ProjetEcole1.ProjectBiblio;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;

public class IhmEmprunt {

	private JFrame frame;
	private JTextField textFieldNomUser;
	private JTextField textFieldRefLivre;
	private JTextField textFieldDateEmprunt;
	private JTextField textField;

	/**
	 * Launch the application..
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IhmEmprunt window = new IhmEmprunt();
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
	public IhmEmprunt() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 684, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNomUsager = new JLabel("Nom Usager");
		lblNomUsager.setBounds(55, 109, 67, 14);
		frame.getContentPane().add(lblNomUsager);

		textFieldNomUser = new JTextField();
		textFieldNomUser.setBounds(130, 106, 86, 20);
		frame.getContentPane().add(textFieldNomUser);
		textFieldNomUser.setColumns(10);

		JLabel lblRefLivre = new JLabel("Ref. Livre");
		lblRefLivre.setBounds(55, 157, 59, 14);
		frame.getContentPane().add(lblRefLivre);

		textFieldRefLivre = new JTextField();
		textFieldRefLivre.setBounds(130, 154, 86, 20);
		frame.getContentPane().add(textFieldRefLivre);
		textFieldRefLivre.setColumns(10);

		JLabel lblDateEmprunt = new JLabel("Date Emprunt");
		lblDateEmprunt.setBounds(55, 216, 77, 14);
		frame.getContentPane().add(lblDateEmprunt);

		textFieldDateEmprunt = new JTextField();
		textFieldDateEmprunt.setBounds(130, 213, 86, 20);
		frame.getContentPane().add(textFieldDateEmprunt);
		textFieldDateEmprunt.setColumns(10);

		JLabel lblDateRendu = new JLabel("Date Retour");
		lblDateRendu.setBounds(55, 290, 67, 14);
		frame.getContentPane().add(lblDateRendu);

		textField = new JTextField();
		textField.setBounds(130, 287, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnValider = new JButton("VALIDER");
		btnValider.setBounds(90, 358, 89, 23);
		frame.getContentPane().add(btnValider);

		String choix[] = { " Pierre", " Paul", " Jacques", " Lou", " Marie" };

		JList listEmprunt = new JList(choix);
		listEmprunt.setBounds(322, 81, 302, 309);
		frame.getContentPane().add(listEmprunt);

		JLabel lblNouvelEmprunt = new JLabel("Nouvel Emprunt");
		lblNouvelEmprunt.setBounds(268, 27, 108, 14);
		frame.getContentPane().add(lblNouvelEmprunt);
	}
}
