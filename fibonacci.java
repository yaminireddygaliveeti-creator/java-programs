import java.util.Scanner;
class fibonacci{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
         System.out.println("enter the number:");
        int n=sc.nextInt();
        int f3,f1=0,f2=1;
        for(int i=0;i<=n;i++)
        {
            f3=f1+f2;
            f1=f2;
            f2=f3;
            System.out.println(f3);
        }
    }
}