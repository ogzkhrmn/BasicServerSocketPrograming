/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;


import java.io.IOException;

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
