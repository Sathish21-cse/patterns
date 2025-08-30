import java.util.*;
public class pattern4 {
  
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n*2;i++)
        {
            char c='A';
            for(int j=0;j<n-i;j++)
            {
                System.out.print(c++);
                
            }
            for(int s=0;s<i;s++)
            {
                System.out.print(" ");
            }
            for(int s=0;s<i;s++)
            {
                System.out.print(" ");
            }
            c--;
            for(int k=0;k<n-i;k++)
            {
                System.out.print(c--);
            }
            System.out.println();
        }
    }
}



//___________________
// input  7

// output


// ABCDEFGGFEDCBA
// ABCDEF  FEDCBA
// ABCDE    EDCBA
// ABCD      DCBA
// ABC        CBA
// AB          BA
// A            A