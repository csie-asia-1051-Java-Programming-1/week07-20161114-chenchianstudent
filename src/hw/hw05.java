package hw;
import java.util.Scanner;
//寫一遞迴函數，讓使用者輸入一個長整數，透過遞迴函數運算後得到反向的數字字串並印出。例如:輸入 1234 回傳 4321

public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入一長整數");
long n=scn.nextLong();

fun1(n);
	}
public static void fun1(long v1){
	if(v1!=0){
		
	fun1(v1%10);
	}else{
	
	}
}
}
