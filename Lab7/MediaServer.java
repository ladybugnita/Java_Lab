package Lab7;

import java.io.*;
import java.net.*;
public class MediaServer {
    public static void main(String[] args) {
        DatagramSocket socket = null;
        FileInputStream fileInputStream = null;
        try {
            // Create a DatagramSocket to send the data to the client
            socket = new DatagramSocket();
            InetAddress clientAddress = InetAddress.getByName("localhost");  // Assuming client is on the same machine
            int clientPort = 9876;
            // Open a media file (audio/video file) to stream
            File file = new File("music.mp3");  // Replace with an actual media file
            fileInputStream = new FileInputStream(file);
            byte[] buffer = new byte[1024];  // Buffer to read chunks of the file
            int bytesRead;
            // Read and send the file in chunks to the client
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
           DatagramPacket sendPacket = new DatagramPacket(buffer, bytesRead, clientAddress, clientPort);
                socket.send(sendPacket);  // Send packet to client
                System.out.println("Sent a chunk of size: " + bytesRead);
            }

            System.out.println("File streaming completed.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();  // Close the file stream
                }
                if (socket != null && !socket.isClosed()) {
                    socket.close();  // Close the socket
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

