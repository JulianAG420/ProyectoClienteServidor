/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;
import java.net.*;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author yulien
 */
public class servidor {
     static int PUERTO = 5000;
    ServerSocket sc;
    Socket so;
    DataOutputStream salida;
    DataInputStream entrada;
    String mensajeRecibido;
    
    
    public void iniciarServidor(){
        
        Scanner teclado = new Scanner(System.in);
        try{
            sc = new ServerSocket(PUERTO);
            so = new Socket();
            
            System.out.println("Esperando conexión...");
            so = sc.accept();
            System.out.println("CLiente conectado con exito...");
            entrada = new DataInputStream(so.getInputStream());
            salida = new DataOutputStream(so.getOutputStream());
            String msn = "";
            while(!msn.equals("x")){
                
                mensajeRecibido = entrada.readUTF();
                System.out.println(mensajeRecibido);
                System.out.println("Digite la fecha");
                msn = teclado.nextLine();
                salida.writeUTF(""+msn);

            }
            sc.close();
        }catch(Exception e){

        }
    }

    public static void main(String[] args){
        servidor o = new servidor();
        o.iniciarServidor();
    }

}


