package hw;
import java.util.Scanner;
//輸入兩個整數，使用遞迴函數呼叫輸出 C(m,n)。

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("請輸入m");
		int m=scn.nextInt();
		System.out.print("請輸入n");
		int n=scn.nextInt();
		double x=m-n;
        c1(m);
        c2(n);
        c3(x);
        System.out.print((double)c1(m)/(c2(n)*c3(x)));
	}
public static double c1(int m){
    if(m==1){
	return 1;	
	}else{
	return m*c1(m-1);	
	}
}
public static double c2(int n){
    if(n==1){
	return 1;	
	}else{
	return n*c2(n-1);	
	}
}
public static double c3(double x){
    if(x==1){
	return 1;	
	}else{
	return x*c3(x-1);	
	}
}
}
