package CO1;
import java.util.*;
public class Qn2 {
public static void main(String args[]){
	System.out.println("Enter Row and Column Size");
	Scanner obj=new Scanner(System.in);
	int m=obj.nextInt();
	int n=obj.nextInt();
	ArGet a=new ArGet(m,n);
	ArGet b=new ArGet(m,n);
}
}
class ArGet{
	int a[][]=new int[50][50];
	ArGet(){
		;
	}
	ArGet(int m,int n){
		
		System.out.println("Enter "+m+"X"+n+" Elements");
		Scanner obj=new Scanner(System.in);
		for(int i=0;i<m;i++)
			for(int j=0;j<n;++j)
				a[i][j]=obj.nextInt();
	}
}
class Calculate{
	ArGet z=new ArGet();
ArGet calcu(ArGet a,ArGet b){
		
	}
}

