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

    public int[][] Read(String path) throws FileNotFoundException, IOException {
        String line;
        String[] myline;
        BufferedReader br = null;
        int[][] mymatrix = new int[10][10];
        int j=0;
        try {
            br= new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null) {
                myline=line.split(",");
                for (int i = 0; i < myline.length; i++) {
                    mymatrix[j][i]=Integer.parseInt(myline[i]);
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
