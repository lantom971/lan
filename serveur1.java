package new_serveur_client;

import java.io.IOException;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;



import java.net.ServerSocket;
import java.net.Socket;

public class serveur1 extends Thread{
	public  void serveur() {
	int PORT=678;
	ServerSocket ecoute;
	Socket client;
	boolean v=true;
	
	try {
		// On écoute sur le port <PORT>
		 ecoute=new ServerSocket(PORT);
		 
         // On accepte une demande de connexion d'un client
		 while (true) {
			 System.out.println("attente de connexion ");
			 client=ecoute.accept();
         
         // On accepte une demande de connexion d'un client
         System.out.println("le client est connecté");
       
          traitement_client a =new traitement_client(client);
          a.start();
         
         
         }


		 
		/* OutputStream out = client.getOutputStream();
   		InputStream in = client.getInputStream();
   		ObjectOutputStream objOut = new ObjectOutputStream(out);
   		 ObjectInputStream objIn = new ObjectInputStream(in);
		 
		 
		 
		Integer I= new Integer(3);
		System.out.print("tapez le message serveur:");
		Scanner scanner = new Scanner( System.in );

		String message_serveur = scanner.nextLine();
		objOut.writeObject(I);
		objOut.writeObject(message_serveur);
		String O= (String)objIn.readObject();
		System.out.println(O);*/
		 
		 
		
		}
		catch (IOException e) {
		 System.err.println(e.getMessage());
		 System.exit(1);
		 }
		
}public static void main(String[] args){
	serveur1 a=new serveur1();
	a.serveur();
}}
