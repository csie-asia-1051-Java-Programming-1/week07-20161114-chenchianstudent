package ex;
import java.util.Scanner;
//�мg�@�ӵ{���A�ΰ}�C�x�s�ϥΪ̿�J�� n �Ӿ�ơA�z�L�禡 var() �i�H�^�ǭp��Ӱ}�C�̪��Ʀr���ܲ��ƫ�A�C�L�X���G�C
/*
 * Date: 2016/11/14
 * Author: 105021007 ���Q�w
 */
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("�п�Jn");
int n=scn.nextInt();
var(n);
			}
public static void var(int n){
Scanner scn=new Scanner(System.in);
int a=0;
int data[]=new int[n];
for(int i=0;i<=data.length;i++){
int num=scn.nextInt();
data[i]=num;
a++;
}

		}
	}


