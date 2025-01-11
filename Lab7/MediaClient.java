package Lab7;
import javax.sound.sampled.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.*;
public class MediaClient {

    public static void main(String[] args) {
//        long startTime = System.currentTimeMillis();
//        long timeout = 3200;
//        double size = 136191.0;
//        double count =0 ;
        DatagramSocket socket = null;
        byte[] buffer = new byte[1024];
        String outputFilePath = "audio_temp.mp3";// Buffer to receive data
        try {
            // Create a DatagramSocket to listen for incoming data
            socket = new DatagramSocket(9876);  // The same port the server is sending to
            FileOutputStream fileOutputStream = new FileOutputStream(outputFilePath);

            // Receive data packets from the server
            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(buffer, buffer.length);
                socket.receive(receivePacket);  // Receive the data packet from the server
                fileOutputStream.write(receivePacket.getData(), 0, receivePacket.getLength());
                String mediaChunk = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received chunk of size: " + mediaChunk.length());
                System.out.println("Received data: " + receivePacket.getData());
//                count = count + mediaChunk.length();
//                System.out.println("Size" + count);
//                // Check if the timeout has occurred
//                if (count > size ) {
//                    System.out.println("Timeout reached. Exiting...");
//                    break;
//                }
            }
            // After receiving all packets, play the audio file
//            playAudio(outputFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();  // Close the socket after receiving all data
            }
        }
    }
    private static void playAudio(String filePath) {
        try {
            File audioFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            // Wait until the audio finishes playing
            Thread.sleep(clip.getMicrosecondLength() / 1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
