import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Scanner asc = new Scanner(System.in);
        int[][] C = new int[n - 2][m - 2];
        int[][] temp = new int[3][3];
        int[][] A = new int[n][m];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int[][] B = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n-2; i++) {
            for (int j = 0; j < m-2; j++) {
                temp = xin(i, j, A);
                C[i][j]=cheng(temp,B);
            }
        }
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[i].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int cheng(int[][] p, int[][] q) {
        int[][] result = new int[3][3];
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            result[0][i] = p[0][i] * q[0][i];
            result[1][i] = p[1][i] * q[1][i];
            result[2][i] = p[2][i] * q[2][i];
        }
        for (int i = 0; i < 3; i++) {
            sum = sum + result[0][i];
            sum = sum + result[1][i];
            sum = sum + result[2][i];
        }
        return sum;
    }
    public static int[][] xin(int g, int h, int[][] T) {
        int[][] M = new int[3][3];
        M[0][0]=T[g][h];
        M[0][1]=T[g][h+1];
        M[0][2]=T[g][h+2];
        M[1][0]=T[g+1][h];
        M[1][1]=T[g+1][h+1];
        M[1][2]=T[g+1][h+2];
        M[2][0]=T[g+2][h];
        M[2][1]=T[g+2][h+1];
        M[2][2]=T[g+2][h+2];
        return M;
    }
}


