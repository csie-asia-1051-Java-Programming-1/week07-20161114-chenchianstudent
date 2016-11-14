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
var(scn.nextInt());
			}
public static double var(int n){
Scanner scn=new Scanner(System.in);
int data[]=new int[n];
float us=0;
float sum=0;
for(int i=0;i<n;i++){
	int num=scn.nextInt();
	data[i]=num;
}
for(int i=0;i<n;i++){
us+=data[i];	
}
float u=(float)us/n;
for(int i=0;i<n;i++){
data[i]=(int)((data[i]-u)*(data[i]-u));
}
for(int i=0;i<n;i++){
	sum+=data[i];
}
float ans=(float)sum/n;
System.out.print(ans);
return ans;
}
	}


