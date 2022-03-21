import java.util.*;
class ReadAndPrint{
     public static void main(String args[])
    {
        
        Scanner sic=new Scanner(System.in);
        System.out.println("Enter Name");
        String k=sic.nextLine();
        System.out.println("Enter Roll Number");
        int mn=sic.nextInt();
        System.out.println("Your name  is:"+k+"\n Roll Number is:"+mn);
    }
}
/*Write a program to read name,roll_no,ad mark of a student and display details*/