package new_serveur_client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client1 {
	public  void client() throws ClassNotFoundException {
Socket s=null;
int PORT=678;
boolean v=true;
String serverhost="127.0.0.1";

try {
	s=new Socket(serverhost,PORT); // Création du socket
// Récupération des flux d’entrée/sortie
OutputStream out = s.getOutputStream();
InputStream in = s.getInputStream();
ObjectOutputStream objOut = new ObjectOutputStream(out);
ObjectInputStream objIn = new ObjectInputStream(in);

Integer I= (Integer)objIn.readObject();
String O= new String() ;
String message_serveur= (String)objIn.readObject();
System.out.print(message_serveur);

System.out.print("tapez le message :");
Scanner scanner = new Scanner( System.in );

O = scanner.nextLine();

objOut.writeObject(O);

s.close();
} catch (IOException e) {System.err.println(e);}
	}
	public static void main(String[] args) throws ClassNotFoundException{
	client1 a=new client1();
	a.client();
	}
	}
	
