/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author oguz
 */
public class SocketThread implements Runnable {

    Socket socket;

    public SocketThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            int m1i, m1j, m2i, m2j;
            int tur;
            
            DataOutputStream out=new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());
            m1i = in.readInt();
            m1j = in.readInt();
            m2i = in.readInt();
            m2j = in.readInt();
<<<<<<< HEAD
            Double[][] matris1 = new Double[m1i][m1j];
            Double[][] matris2 = new Double[m2i][m2j];
            Double[][] result;
            for (int i = 0; i < m1i; i++) {
                for (int j = 0; j < m1j; j++) {
                    matris1[i][j] = in.readDouble();
=======
            int[][] matris1 = new int[m1i][m1j];
            int[][] matris2 = new int[m2i][m2j];
            int[][] result;
            for (int i = 0; i < m1i; i++) {
                for (int j = 0; j < m1j; j++) {
                    matris1[i][j] = in.readInt();
>>>>>>> 05892ef4672d2083278a410b325e3dc49bceb0c5
                    System.out.println(matris1[i][j]);
                }
            }
            for (int i = 0; i < m2i; i++) {
                for (int j = 0; j < m2j; j++) {
<<<<<<< HEAD
                    matris2[i][j] = in.readDouble();
=======
                    matris2[i][j] = in.readInt();
>>>>>>> 05892ef4672d2083278a410b325e3dc49bceb0c5
                    System.out.println(matris2[i][j]);
                }
            }
            tur = in.readInt();
            Operation op = new Operation();
            switch (tur) {
                case 1:
                    result=op.AddMatrix(matris1, matris2, m1i, m2j);
                    out.writeInt(m1i);
                    out.writeInt(m1j);
                    for(int i = 0; i < m1i; i++) {
                         for (int j = 0; j < m1j; j++) {
<<<<<<< HEAD
                            out.writeDouble(result[i][j]);
=======
                            out.writeInt(result[i][j]);
>>>>>>> 05892ef4672d2083278a410b325e3dc49bceb0c5
                        }
                    }
                    break;
                case 2:
                    result=op.MultMatrix(matris1, matris2, m1i, m1j, m2i, m2j);
                    out.writeInt(m1i);
                    out.writeInt(m2j);
                    for(int i = 0; i < m1i; i++) {
                         for (int j = 0; j < m2j; j++) {
<<<<<<< HEAD
                            out.writeDouble(result[i][j]);
=======
                            out.writeInt(result[i][j]);
>>>>>>> 05892ef4672d2083278a410b325e3dc49bceb0c5
                        }
                    }
                    break;
                case 3:
                    result=op.SubMatrix(matris1, matris2, m1i, m2j);
                    out.writeInt(m1i);
                    out.writeInt(m1j);
                    for(int i = 0; i < m1i; i++) {
                         for (int j = 0; j < m1j; j++) {
<<<<<<< HEAD
                            out.writeDouble(result[i][j]);
=======
                            out.writeInt(result[i][j]);
>>>>>>> 05892ef4672d2083278a410b325e3dc49bceb0c5
                        }
                    }
                    break;
            }
            out.close();
            in.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                socket.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}
