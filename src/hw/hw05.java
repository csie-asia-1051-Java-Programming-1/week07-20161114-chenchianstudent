package hw;
import java.util.Scanner;
//�g�@���j��ơA���ϥΪ̿�J�@�Ӫ���ơA�z�L���j��ƹB���o��ϦV���Ʀr�r��æL�X�C�Ҧp:��J 1234 �^�� 4321

public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("�п�J�@�����");
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
