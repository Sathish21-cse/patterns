import java.util.*;
public class pattern6 {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char c='a';
        int m=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            { 
                m++;
                if(i==j)
                {
                    System.out.print(m+" ");
                }
                else
                {
                    System.out.print(c+" ");
                }
                c++;
            }
            System.out.println();
        }
    }
}
