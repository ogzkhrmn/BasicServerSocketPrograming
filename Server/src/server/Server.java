/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

<<<<<<< HEAD
import java.io.IOException;
=======
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
>>>>>>> 05892ef4672d2083278a410b325e3dc49bceb0c5
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author oguz
 */
public class Server {


    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(1234);
        Runnable r;
        while (true) {
            Socket s1 = s.accept(); // Bir bağlantı bekleyip kabul et
            r=new SocketThread(s1);
            r.run();
        }
    }
}
