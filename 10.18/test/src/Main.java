import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] x = new int[n][1];
        int[][] y = new int[n][1];
        Scanner msc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            x[i][0] =msc.nextInt();
            y[i][0] =msc.nextInt();
        }
            int s = getS(x, y, n);
            System.out.println(s);
    }
    public static int getS(int[][] x, int[][] y, int n) {
        int xmax= x[0][0];
        int xmin= x[0][0];
        int ymax= y[0][0];
        int ymin= y[0][0];
        for (int i = 0; i < n; i++) {
            if(x[i][0]>xmax){
                xmax= x[i][0];
            }
            else if(x[i][0]<xmin){
                xmin= x[i][0];
            }
        }
        for (int i = 0; i < n; i++) {
            if(y[i][0]>ymax){
                ymax= y[i][0];
            }
            else if(y[i][0]<ymin){
                ymin= y[i][0];
            }
        }
        int s=(xmax-xmin)*(ymax-ymin);
        return s;
    }
}