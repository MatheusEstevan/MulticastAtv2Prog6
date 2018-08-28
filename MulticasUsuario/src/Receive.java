import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.MulticastSocket;

public class Receive {

	public static String receive(MulticastSocket socket) throws IOException {
		byte[] receiveData = new byte[1024];

		DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
	
		socket.receive(receivePacket);

		String sentence = new String(receivePacket.getData());
		return sentence;
	}

}
