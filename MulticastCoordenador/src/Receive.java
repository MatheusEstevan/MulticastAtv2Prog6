import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {

    public static String receive(DatagramSocket socket) throws IOException {
        byte[] receiveData = new byte[1024];

        DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
        socket.setSoTimeout(10 * 1000);
        socket.receive(receivePacket);
        
        String sentence = new String( receivePacket.getData());
        return sentence;
    }
}
