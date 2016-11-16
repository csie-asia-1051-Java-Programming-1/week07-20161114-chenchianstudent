package hw;
import java.util.Scanner;
//寫一遞迴函數，求 m、n 兩數的最大公因數 gcd(m,n)由鍵盤輸入

public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner (System.in);
System.out.println("請輸入m");
int m=scn.nextInt();
System.out.println("請輸入n");
int n=scn.nextInt();
int m1,n1;
if(n>m){
m1=n;n1=m;	
}else{
m1=m;n1=n;	
}
System.out.print(fun1(m1,n1));
	}
public static int fun1(int m1,int n1){
	if(n1==0){
		return m1;
	}else{
		return fun1(n1, m1 % n1);
	}
}
}
