import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;

public class MainUsuario {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String group = "225.4.5.6";		
	    DatagramSocket serverSocket = new DatagramSocket();		
		MulticastSocket socket = new MulticastSocket(8080);
		socket.joinGroup(InetAddress.getByName(group));
		
		
		
	}
	
	private static int getPort(DatagramSocket ds) {
		return ds.getLocalPort();
	}
}
