package hw;
import java.util.Scanner;
//�мg�@��� lcm(x,y,z)�A�D�T�� x�By�Bz ���̤p������

public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
System.out.print("�п�Jx");
double x=scn.nextDouble();
System.out.print("�п�Jy");
double y=scn.nextDouble();
System.out.print("�п�Jz");
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
