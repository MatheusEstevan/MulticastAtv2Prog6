import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {
	
	
	public static void send(String msg, DatagramSocket socket, int port, InetAddress IPAddress) throws IOException {

    
        byte[] sendData = new byte[1024];
        sendData = msg.getBytes();

        DatagramPacket sendPacket =
                new DatagramPacket(sendData, sendData.length, IPAddress, port);
        socket.send(sendPacket);
    }
}
