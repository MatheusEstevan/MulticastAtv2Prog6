import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class Send {
	public static void send(String msg, MulticastSocket socket, int port, InetAddress IPAddress) throws IOException {
		
	    
        byte[] sendData = new byte[1024];
        sendData = msg.getBytes();

        DatagramPacket sendPacket =
                new DatagramPacket(sendData, sendData.length, IPAddress, port);
        socket.send(sendPacket);
    }
	
}
