import java.util.*;
class A{
int length,breadth;
A(int len,int bre){
length=len;
breadth=bre;
}
}

class B extends A{
    int height;
    B(int l,int b,int h){
        super(l,b);
        height=h;
    }
    int volume()
    {
        return(length*breadth*height);
    }
}
class findVol{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Lendth,breadth&height");
        B obj=new B(sc.nextInt(),sc.nextInt(),sc.nextInt());
System.out.print("Volume:"+obj.volume());
    }
}