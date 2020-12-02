package new_serveur_client;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class traitement_client extends Thread {
    public ArrayList<Object> Liste1=new ArrayList <Object> ();
    public ArrayList<Object> Liste2=new ArrayList <Object> ();
    int i;
    public Socket client;
    Integer I = new Integer(3);
    String S="coucou" ;
    float F = 0;
    
    public traitement_client(Socket client,int indice) 
 {
                               this.client=client;// TODO Auto-generated constructor stub
                               this.i=indice;
                              

    }

 
    
    public void run() {
    	try { 
        System.out.println("J'effectue le traitement");
		System.out.println(""+Thread.currentThread().getName());



		 
		 OutputStream out = client.getOutputStream();
  		InputStream in = client.getInputStream();
  		ObjectOutputStream objOut = new ObjectOutputStream(out);
  		ObjectInputStream objIn = new ObjectInputStream(in);
  	    
		 
  	    Liste1.add(I);
  		Liste1.add(S);
  	    Liste1.add(F);
  		objOut.writeObject(Liste1.get(i));
  		Object O;
  		O=objIn.readObject();
  		Liste2.add(O);
		 
       }         catch (IOException e) {
        System.err.println(e.getMessage());
        System.exit(1);
        } catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}