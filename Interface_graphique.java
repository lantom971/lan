package new_serveur_client;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interface_graphique {
	public void interface_grapfhique() {
	JFrame fenetre=new JFrame();
	fenetre.setSize(300,100);
	fenetre.setVisible(true);
	JButton bouton = new JButton("Mon bouton");
	JPanel panneau = new JPanel();
	

	panneau.setSize(200,100);
	panneau.setVisible(true);
	fenetre.add(panneau);
	JLabel jLabel1 =new JLabel("Saisir la chaine de caractere:");
	JTextField textField = new JTextField();
	panneau.add(jLabel1);
	panneau.add(textField);
	panneau.add(bouton);
	}
}
