package ex;
import java.util.Scanner;
//請寫一個程式，用陣列儲存使用者輸入的 n 個整數，透過函式 var() 可以回傳計算該陣列裡的數字的變異數後再列印出結果。
/*
 * Date: 2016/11/14
 * Author: 105021007 陳麒安
 */
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入n");
int n=scn.nextInt();
var(n);
			}
public static void var(int n){
Scanner scn=new Scanner(System.in);
int a=0;
int data[]=new int[n];
for(int i=0;i<=data.length;i++){
int num=scn.nextInt();
data[i]=num;
a++;
}

		}
	}


