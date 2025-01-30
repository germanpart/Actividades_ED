/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author germa
 */
public class act1operacionmatematicas {
    public static void main(String[] args) {
       
        int[][] arreglo = {{1, 2, 3}, {4, 5, 6}};
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 1; j < arreglo[i].length; j++) {
                arreglo[i][0] += arreglo[i][j];
            }
            System.out.println("TOTAL: " + arreglo[i][0]);
        }
    }
}
    
    

