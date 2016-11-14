package ex;
import java.util.Scanner;
//讓使用者輸入一個正整數 n，接著使用遞迴呼叫印出 n! 的結果
/*
 * Date: 2016/11/14
 * Author: 105021007 陳麒安
 */
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入n");
int n=scn.nextInt();
System.out.print(n+"!="+fac(n));
	}
public static int fac(int v1){
	if(v1==1){
	return 1;	
	}else{
	return v1*fac(v1-1);	
	}
	
}
}
