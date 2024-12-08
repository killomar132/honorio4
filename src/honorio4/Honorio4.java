/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package honorio4;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Honorio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Introduce el número de filas (n): ");
        int n=leer.nextInt();
        System.out.print("Introduce el número de columnas (m): ");
        int m=leer.nextInt();
        int[][] matriz=new int[n][m];
        System.out.println("Introduce los elementos de la matriz:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Elemento en la posición ("+i+","+j+"): ");
                matriz[i][j]=leer.nextInt();
            }
        }
        int[][] matrizTranspuesta=new int[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrizTranspuesta[j][i]=matriz[i][j];
            }
        }
        System.out.println("\nMatriz original:");
        for(int i=0;i<n;i++){
            for(int j = 0; j < m; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nMatriz transpuesta:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrizTranspuesta[i][j]+" ");
            }
            System.out.println();
        }
        leer.close();
    }
}
