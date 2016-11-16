package hw;
import java.util.Scanner;
//以遞迴設計函數，輸入一個正整數值(不含 0)，傳回該數值是幾位數(# ofdigits)。

public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner (System.in);
System.out.print("請輸入n");
int n=scn.nextInt();
int m=0;
System.out.print(fun1(n,m));
	}
	public static int fun1(int v1,int v2){
		
		if(v1!=0){
			v2++;return fun1(v1/10,v2);
		}else{
		return v2;	
		}
		
	}

}
