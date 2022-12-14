/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServerSocket;

/**
 *
 * @author yulien
 */
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


public class servidor {
    
   
 public static void main(String[] args) throws Exception
{
     System.out.println("Esperando Cliente....");
 ServerSocket ssock = new ServerSocket(5000);
 Socket socket = ssock.accept();
 InetAddress IA = InetAddress.getByName("localhost");
 File file = new File("planillarecibida.txt");
 FileInputStream input = new FileInputStream(file);
 BufferedInputStream bis = new BufferedInputStream(input);
 OutputStream os = socket.getOutputStream();
 byte[] contents;
 long fileLength = file.length();
 long current = 0;
 long start = System.nanoTime();
 while(current!=fileLength){
 int size = 100000;
 if(fileLength - current >= size)
 current += size;
 else{
 size = (int)(fileLength - current);
 current = fileLength;
 }
 contents = new byte[size];
 bis.read(contents, 0, size);
 os.write(contents);
 System.out.print("Enviando archivo ... "+(current*100)/fileLength+"% Archivo enviado");
 }
 os.flush();


 socket.close();
 ssock.close();
 System.out.println("Archivo enviado con exito");
 } }
    
