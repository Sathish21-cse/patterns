import java.util.Scanner;

public class pattern7 {
         public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int m=sc.nextInt();
            int s=0;
            
            if(m<=0)
            {
                System.out.println("Invalid Input");
            }
            else{
                for(int r=1;r<=m;r++)
                {
                    s+=r;
                }
                //System.out.println(s);
                
                for(int j=0;j<m;j++)
                {
                    for(int k=0;k<m-j;k++)
                    {
                        System.out.print(s+" ");
                        s--;
                    }
                    System.out.println();
                }
            }
        }
      }
}

// input
// 1
// 4

// output
// 10 9 8 7 
// 6 5 4 
// 3 2 
// 1 