/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

/**
 *
 * @author oguz
 */
public class Operation {
    int[][] result;
    public int[][] AddMatrix(int[][] matrix1,int[][] matrix2,int n,int m){
        result=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return result;
    }
    public int[][] SubMatrix(int[][] matrix1,int[][] matrix2,int n,int m){
        result=new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j]=matrix1[i][j]-matrix2[i][j];
            }
        }
        return result;
    }
    public int[][] MultMatrix(int[][] matrix1,int[][] matrix2,int m1i,int m1j,int m2i,int m2j){
        result=new int[m1i][m2j];
        int sum=0;
        for (int i = 0; i < m1i; i++) {
            for (int j = 0; j < m2j; j++) {
                for (int k = 0; k < m1j; k++) {
                    sum=sum+matrix1[i][k]*matrix2[k][j];
                }
                result[i][j]=sum;
                sum=0;
            }
        }
        return result;
    }
}
