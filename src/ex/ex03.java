package ex;
import java.util.Scanner;
//�мg�@�ӵ{���A���ϥΪ̿�J�@�Ӿ�ƤG���}�C�A�إ� var2()�禡 ��std2()�i�H���O�p��G���}�C���ܲ��ƻP�зǮt�A�ç⵲�G�^�Ǩ�D�{���L�X�C

/*
 * Date: 2016/11/14
 * Author: 105021007 ���Q�w
 */
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("�п�Jn");
int n=scn.nextInt();
std2(var2(n));

	}
public static double var2(int n){
	Scanner scn=new Scanner(System.in);
	int data[][]=new int[n][n];
	for(int i=0;i<data.length;i++){
		for(int j=0;j<data[0].length;j++){
			int num=scn.nextInt();
		data[i][j]=num;	
		}	
	}
	float us=0;
	float sum=0;
	for(int i=0;i<data.length;i++){
	for(int j=0;j<data[0].length;j++){
	us+=data[i][j];	
	}}
	float u=us/(n*n);
	for(int i=0;i<data.length;i++){
		for(int j=0;j<data[0].length;j++){
		data[i][j]=(int)((data[i][j]-u)*(data[i][j]-u));
		}}
	for(int i=0;i<data.length;i++){
		for(int j=0;j<data[0].length;j++){
		sum+=data[i][j];
		}}
	double ans=sum/(n*n);
	System.out.print(ans);
	return ans;
}
public static double std2(double ans){
	double stdans=Math.sqrt(ans);
	System.out.println("\t"+stdans);
	return stdans;
	
}
}
