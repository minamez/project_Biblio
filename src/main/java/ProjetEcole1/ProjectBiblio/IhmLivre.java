package ProjetEcole1.ProjectBiblio;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class IhmLivre {

	private JFrame frame;
	private JTextField textFieldTitre;
	private JTextField textFieldAnnee;
	private JTextField textFieldEditeur;
	private JTextField textFieldAuteur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IhmLivre window = new IhmLivre();
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
	public IhmLivre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 684, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblTitre = new JLabel("Titre");
		lblTitre.setBounds(51, 73, 46, 14);
		frame.getContentPane().add(lblTitre);

		textFieldTitre = new JTextField();
		textFieldTitre.setBounds(88, 70, 86, 20);
		frame.getContentPane().add(textFieldTitre);
		textFieldTitre.setColumns(10);

		JLabel lblAnne = new JLabel("Année");
		lblAnne.setBounds(51, 124, 46, 14);
		frame.getContentPane().add(lblAnne);

		textFieldAnnee = new JTextField();
		textFieldAnnee.setBounds(88, 121, 86, 20);
		frame.getContentPane().add(textFieldAnnee);
		textFieldAnnee.setColumns(10);

		JLabel lblEditeur = new JLabel("Editeur");
		lblEditeur.setBounds(51, 186, 46, 14);
		frame.getContentPane().add(lblEditeur);

		textFieldEditeur = new JTextField();
		textFieldEditeur.setBounds(88, 183, 86, 20);
		frame.getContentPane().add(textFieldEditeur);
		textFieldEditeur.setColumns(10);

		JLabel lblAuteur = new JLabel("Auteur");
		lblAuteur.setBounds(51, 247, 46, 14);
		frame.getContentPane().add(lblAuteur);

		textFieldAuteur = new JTextField();
		textFieldAuteur.setBounds(88, 244, 86, 20);
		frame.getContentPane().add(textFieldAuteur);
		textFieldAuteur.setColumns(10);

		JButton btnAjouter = new JButton("AJOUTER");
		btnAjouter.setBounds(300, 149, 89, 23);
		frame.getContentPane().add(btnAjouter);

		JLabel lblAjoutDeLivres = new JLabel("Ajout de livres");
		lblAjoutDeLivres.setBounds(257, 26, 109, 14);
		frame.getContentPane().add(lblAjoutDeLivres);
	}
}
