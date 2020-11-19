package new_serveur_client;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class traitement_client extends Thread {
    public ArrayList<Object> Liste1;
    public ArrayList<Object> Liste2;
    public Socket client;
    public traitement_client(Socket client) 
 {
                               this.client=client;// TODO Auto-generated constructor stub
                               //this.Liste1=L;
                              // this.Liste2=L2;

    }

    public void run() {
                  
        try { 
            System.out.println("J'effectue le traitement");
            System.out.println(""+Thread.currentThread().getName());
            OutputStream out = client.getOutputStream();
            ObjectOutputStream objOut = new ObjectOutputStream(out);
            InputStream in = client.getInputStream();
            ObjectInputStream objIn = new ObjectInputStream(in);
//Integer I = new Integer(3);
//objOut.writeObject(I)

           /* Object o=Liste1.get(0);
            Liste1.remove(0);
            
            //ecrit a un client 
            objOut.writeObject(o);
            //o=objIn.readObject();
            //ajout du tableau
            Liste2.add(o);
            client.close();*/
}            catch (IOException e) {
            System.err.println(e.getMessage());
            System.exit(1);
            }
}
}
