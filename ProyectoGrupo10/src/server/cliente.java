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
public class cliente {
      static String HOST = "localhost";
    static int PUERTO = 5000;
    Socket sc;
    DataOutputStream salida;
    DataInputStream entrada;
    String mensajeRecibido;
    
    
    public void iniciarCliente(){
        Scanner teclado = new Scanner(System.in);
        try{
            sc = new Socket(HOST, PUERTO);
            salida = new DataOutputStream(sc.getOutputStream());
            entrada = new DataInputStream(sc.getInputStream());
            String msn = "";
            while(!msn.equals("x")){
                System.out.println("Digite la fecha de la planilla que desea enviar");
                msn = teclado.nextLine();
                salida.writeUTF(msn);
                mensajeRecibido = entrada.readUTF();
                System.out.println(mensajeRecibido);
            }
            
            sc.close();
        }catch(Exception e){

        }
    }

    public static void main(String[] args){
        cliente o = new cliente();
        o.iniciarCliente();
    }

}

