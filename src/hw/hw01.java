package hw;
import java.util.Scanner;
//請寫一函數 lcm(x,y,z)，求三數 x、y、z 之最小公倍數

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("請輸入x");
double x=scn.nextDouble();
System.out.print("請輸入y");
double y=scn.nextDouble();
System.out.print("請輸入z");
double z=scn.nextDouble();
lcm(x,y,z);
	}
public static double lcm(double x,double y,double z){
	double test=Math.max(x, y);
	double test2=Math.max(test, z);
    double	x1=test2%x;
    double	y1=test2%y;
    double	z1=test2%z;
    if(x1!=0&&y1!=0&&z1!=0){
    int i=1;
    i++;
    test*i;	
    }
    
		
		
	}
}
}
