package ex;
import java.util.Scanner;
//�ӤW�D�A���Fvar() ��Ƥ��~�A�A�Ϋإߤ@�� std() ��ơA�{���b�������ϥΪ̿�J���@����ư}�C����A�I�sstd()�禡�i�o��}�C���зǮt�A
//�S�O�`�N�A���n�u�� std() ��ƺ⵲�G�A������std()�h�I�s var() ��Ƥ���^�� std() �禡�B�z���A�Ǧ^���D�{���A�D�{���A�⵲�G�L�X
/*
 * Date: 2016/11/14
 * Author: 105021007 ���Q�w
 */
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("�п�Jn");
int n=scn.nextInt();

//var(n);
std(var(n));

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
		//System.out.print(ans);
		return ans;
		}
public static double std(double ans){
	double stdans=Math.sqrt(ans);
	System.out.println(stdans);
	return stdans;
}	
}
