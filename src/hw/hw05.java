package hw;
import java.util.Scanner;
//�g�@���j��ơA���ϥΪ̿�J�@�Ӫ���ơA�z�L���j��ƹB���o��ϦV���Ʀr�r��æL�X�C�Ҧp:��J 1234 �^�� 4321

public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("�п�J�@�����");
String n=scn.next();

fun1(n);
	}
public static void fun1(String n){
	Scanner scn=new Scanner(System.in);
	char data[]=n.toCharArray();
	for(int i=data.length-1;i>=0;i--){
	System.out.print(data[i]);
}
}
}
