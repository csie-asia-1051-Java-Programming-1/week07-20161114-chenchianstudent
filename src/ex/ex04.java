package ex;
import java.util.Scanner;
//���ϥΪ̿�J�@�ӥ���� n�A���ۨϥλ��j�I�s�L�X n! �����G
/*
 * Date: 2016/11/14
 * Author: 105021007 ���Q�w
 */
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("�п�Jn");
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
