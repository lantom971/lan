package new_serveur_client;

import java.io.IOException;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;



import java.net.ServerSocket;
import java.net.Socket;

public class serveur extends Thread{
	public  void serveur() throws ClassNotFoundException {
	int PORT=800;
	ServerSocket ecoute;
	Socket client;
	boolean v=true;
	int i=0;
	
	// ArrayList<Object> L = null;
	try {
		// On écoute sur le port <PORT>
		 ecoute=new ServerSocket(PORT);
		System.out.println("en attente de connexion ");
         // On accepte une demande de connexion d'un client
		 while (true) {
			 
			 client=ecoute.accept();
			 
         // On accepte une demande de connexion d'un client
         System.out.println("le client est connecté");
         
          traitement_client a =new traitement_client(client,i);
          a.start();
         i++;
         
         
		 
		
		}}
		catch (IOException e) {
		 System.err.println(e.getMessage());
		 System.exit(1);
		 }
		
}public static void main(String[] args) throws ClassNotFoundException{
	serveur a=new serveur();
	a.serveur();
}}
