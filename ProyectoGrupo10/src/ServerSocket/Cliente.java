/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServerSocket;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;


public class Cliente {

    public static void main(String[] args) throws Exception{
 Socket socket = new Socket(InetAddress.getByName("localhost"), 5000);
 byte[] contents = new byte[100000];
 FileOutputStream fos = new FileOutputStream("planillarecibida.txt");
 BufferedOutputStream bos = new BufferedOutputStream(fos);
 InputStream is = socket.getInputStream();
 int bytesRead = 0;
 while((bytesRead=is.read(contents))!=-1)
 bos.write(contents, 0, bytesRead);
 bos.flush();
 socket.close();
 System.out.println("Planilla almacenada de manera exitosa");
 }
}
