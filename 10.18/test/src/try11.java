import java.util.Scanner;

public class try11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入个数n");
        int n = sc.nextInt();
        int carr[]=new int[n];
        int karr[]=new int[n];
        for (int i = 0; i < n; i++) {
            int num1=sc.nextInt();
            carr[i]=num1;
            int num2=sc.nextInt();
            karr[i]=num2;
        }
        for (int i = 0; i < carr.length; i++) {
            System.out.print(carr[i]+" ");
            System.out.print(karr[i]+" ");
        }
        int maxc=carr[0];
        for (int i = 1; i < carr.length; i++) {
            if (carr[i]>maxc){
                maxc=carr[i];}
        }
        System.out.println(maxc);
        int minc=carr[0];
        for (int i = 1; i < carr.length; i++) {
            if (minc>carr[i]){
                minc=carr[i];}
        }
        int chang=maxc-minc;
        int maxk=karr[0];
        for (int i = 1; i < karr.length; i++) {
            if (maxk<karr[i]){
                maxk=karr[i];}
        }
        int mink=carr[0];
        for (int i = 1; i < karr.length; i++) {
            if (mink>karr[i]){
                mink=karr[i];}
        }
        int kuan=maxk-mink;
        System.out.println(chang*kuan);
    }
}
