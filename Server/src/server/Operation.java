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
    Double[][] result;
    public Double[][] AddMatrix(Double[][] matrix1,Double[][] matrix2,int n,int m){
        result=new Double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }
        return result;
    }
    public Double[][] SubMatrix(Double[][] matrix1,Double[][] matrix2,int n,int m){
        result=new Double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j]=matrix1[i][j]-matrix2[i][j];
            }
        }
        return result;
    }
    public Double[][] MultMatrix(Double[][] matrix1,Double[][] matrix2,int m1i,int m1j,int m2i,int m2j){
        result=new Double[m1i][m2j];
        Double sum=0.0;
        for (int i = 0; i < m1i; i++) {
            for (int j = 0; j < m2j; j++) {
                for (int k = 0; k < m1j; k++) {
                    sum=sum+matrix1[i][k]*matrix2[k][j];
                }
                result[i][j]=sum;
                sum=0.0;
            }
        }
        return result;
    }
}
