package new_serveur_client;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Interface_graphique implements ActionListener{
	JButton OK,Annuler,OK_int,Annuler_int,OK_float,Annuler_float;
	JTextField textField,textField1,textField2;
	String texte,texte1,texte2;
	int texte_int;
	Float texte_float;
	public  void    actionPerformed(ActionEvent e)
    {
        //Object  source=e.getSource();
        
        if  (e.getSource()==OK) {
        	texte=textField.getText();
            System.out.println(texte);
        }
        if  (e.getSource()==OK_int) {
        	texte1=textField1.getText();
        	texte_int=Integer.parseInt(texte1);
            System.out.println(texte_int);
        }if  (e.getSource()==OK_float) {
        	texte2=textField2.getText();
        	texte_float=Float.parseFloat(texte2);
            System.out.println(texte_float);
        }
        if (e.getSource()==Annuler) {
        	textField.setText(" ");
        }if (e.getSource()==Annuler_int) {
        	textField1.setText(" ");
        }if (e.getSource()==Annuler_float) {
        	textField2.setText(" ");
        }
    
    }
	
	
	public void interface_grapfhique_string() {
	JFrame fenetre=new JFrame();
	fenetre.setSize(300,100);
	OK = new JButton("OK");
	Annuler = new JButton("Annuler");
	JPanel panneau = new JPanel();
	OK.addActionListener(this);
	Annuler.addActionListener(this);

	panneau.setSize(200,100);
	
	
	JLabel jLabel1 =new JLabel("Saisir la chaine de caractere:");
	textField = new JTextField("                  ");
	
	textField.setSize(100,100);
	panneau.add(jLabel1);
	panneau.add(textField);
	//panneau.setLayout(new BorderLayout());
	panneau.setLayout(new FlowLayout());
	panneau.add(OK);
	
	panneau.add(Annuler);
	fenetre.add(panneau);
	panneau.setVisible(true);
	fenetre.setVisible(true);
	}
	public void interface_grapfhique_Int() {
		JFrame fenetre1=new JFrame();
		fenetre1.setSize(300,100);
		OK_int = new JButton("OK");
		Annuler_int = new JButton("Annuler");
		JPanel panneau1 = new JPanel();
		OK_int.addActionListener(this);
		Annuler_int.addActionListener(this);

		panneau1.setSize(200,100);
		
		
		JLabel jLabel2 =new JLabel("Saisir l'entier:");
		textField1 = new JTextField();
		textField1.setPreferredSize(new Dimension(40, 20));
		
		textField1.setSize(100,100);
		panneau1.add(jLabel2);
		panneau1.add(textField1);
		//panneau.setLayout(new BorderLayout());
		panneau1.setLayout(new FlowLayout());
		panneau1.add(OK_int);
		
		panneau1.add(Annuler_int);
		fenetre1.add(panneau1);
		panneau1.setVisible(true);
		fenetre1.setVisible(true);
		}
	public void interface_grapfhique_Float() {
		JFrame fenetre2=new JFrame();
		fenetre2.setSize(300,100);
		OK_float = new JButton("OK");
		Annuler_float = new JButton("Annuler");
		JPanel panneau2 = new JPanel();
		OK_float.addActionListener(this);
		Annuler_float.addActionListener(this);

		panneau2.setSize(200,100);
		
		
		JLabel jLabel2 =new JLabel("Saisir le reel:");
		textField2 = new JTextField();
		textField2.setPreferredSize(new Dimension(40, 20));
		textField2.setSize(100,100);
		panneau2.add(jLabel2);
		panneau2.add(textField2);
		//panneau.setLayout(new BorderLayout());
		panneau2.setLayout(new FlowLayout());
		panneau2.add(OK_float);
		
		panneau2.add(Annuler_float);
		fenetre2.add(panneau2);
		panneau2.setVisible(true);
		fenetre2.setVisible(true);
		}
}
