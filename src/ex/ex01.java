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


