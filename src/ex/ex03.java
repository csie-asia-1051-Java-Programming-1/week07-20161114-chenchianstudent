package ex;
import java.util.Scanner;
//請寫一個程式，讓使用者輸入一個整數二維陣列，建立 var2()函式 及std2()可以分別計算二維陣列的變異數與標準差，並把結果回傳到主程式印出。

/*
 * Date: 2016/11/14
 * Author: 105021007 陳麒安
 */
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入n");
int n=scn.nextInt();
std2(var2(n));

	}
public static double var2(int n){
	Scanner scn=new Scanner(System.in);
	int data[][]=new int[n][n];
	for(int i=0;i<data.length;i++){
		for(int j=0;j<data[0].length;j++){
			int num=scn.nextInt();
		data[i][j]=num;	
		}	
	}
	float us=0;
	float sum=0;
	for(int i=0;i<data.length;i++){
	for(int j=0;j<data[0].length;j++){
	us+=data[i][j];	
	}}
	float u=us/(n*n);
	for(int i=0;i<data.length;i++){
		for(int j=0;j<data[0].length;j++){
		data[i][j]=(int)((data[i][j]-u)*(data[i][j]-u));
		}}
	for(int i=0;i<data.length;i++){
		for(int j=0;j<data[0].length;j++){
		sum+=data[i][j];
		}}
	double ans=sum/(n*n);
	System.out.print(ans);
	return ans;
}
public static double std2(double ans){
	double stdans=Math.sqrt(ans);
	System.out.println("\t"+stdans);
	return stdans;
	
}
}
