package new_serveur_client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class client {
	public  void client() throws ClassNotFoundException {
Socket s=null;
int PORT=800;
boolean v=true;
String serverhost="127.0.0.1";

try {
	s=new Socket(serverhost,PORT); // Cr�ation du socket
// R�cup�ration des flux d�entr�e/sortie
OutputStream out = s.getOutputStream();
InputStream in = s.getInputStream();
ObjectOutputStream objOut = new ObjectOutputStream(out);
ObjectInputStream objIn = new ObjectInputStream(in);

//Integer I= (Integer)objIn.readObject();



Object O= new Object() ;
Object Objet_a_envoyer= new Object() ;
O= objIn.readObject();

System.out.print(O);
System.out.print(O.getClass().getName());
Interface_graphique Int1=new Interface_graphique();


if(O.getClass().getName()=="java.lang.String") {
	
	
	Int1.interface_grapfhique_string();
	System.out.print(Int1.texte);
	Objet_a_envoyer=Int1.texte;
	 
}
if(O.getClass().getName()=="java.lang.Integer") {
	
	Int1.interface_grapfhique_Int();
	System.out.print(Int1.texte_int);
	Objet_a_envoyer=Int1.texte_int;
}
if(O.getClass().getName()=="java.lang.Float") {
	Int1.interface_grapfhique_Float();
	System.out.print(Int1.texte_float);
	Objet_a_envoyer=Int1.texte_float;
}  
objOut.writeObject(Objet_a_envoyer);

//objIn.readObject();

/*String O= new String() ;
String message_serveur= (String)objIn.readObject();
System.out.print(message_serveur);

System.out.print("tapez le message :");
Scanner scanner = new Scanner( System.in );

O = scanner.nextLine();

objOut.writeObject(O);
*/
s.close();
} catch (IOException e) {System.err.println(e);}
	}
	public static void main(String[] args) throws ClassNotFoundException{
	client a=new client();
	a.client();
	}
	}
	
