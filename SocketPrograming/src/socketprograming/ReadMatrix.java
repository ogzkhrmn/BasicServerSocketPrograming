/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprograming;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author oguz
 */
public class ReadMatrix {

<<<<<<< HEAD
    public Double[][] Read(String path) throws FileNotFoundException, IOException {
        String line;
        String[] myline;
        BufferedReader br = null;
        Double[][] mymatrix = new Double[10][10];
=======
    public int[][] Read(String path) throws FileNotFoundException, IOException {
        String line;
        String[] myline;
        BufferedReader br = null;
        int[][] mymatrix = new int[10][10];
>>>>>>> 05892ef4672d2083278a410b325e3dc49bceb0c5
        int j=0;
        try {
            br= new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                myline=line.split(",");
                for (int i = 0; i < myline.length; i++) {
<<<<<<< HEAD
                    mymatrix[j][i]=Double.parseDouble(myline[i]);
=======
                    mymatrix[j][i]=Integer.parseInt(myline[i]);
>>>>>>> 05892ef4672d2083278a410b325e3dc49bceb0c5
                }
                j++;
            }
        } catch (IOException e) {
        } finally {
            if(br!=null){
               br.close(); 
            }
        }
       return mymatrix; 
    }
}
