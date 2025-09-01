import java.util.*;
public class pattern5 {
  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int a=-1;
        while(n!=0)
        {
            a+=n;
            n--;
        }
        char c='A';
        c+=a;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(c+" ");
                c--;
            }
            System.out.println();
        }
    }
}


// input:4
// output     
// J 
// I H
// G F E
// D C B A
