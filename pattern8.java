import java.util.*;
public class pattern8 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n*2-1;
        for(int i=1;i<n;i++)
        {
            for(int j=1;j<n*2;j++)
            {
                if(i==j ||j==m )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            m--;
            System.out.println();
        }

        
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n*2;j++)
            {
                if(j==n-i||j==n+i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }
}

// input

// 10

// output

// *                 *
//  *               *
//   *             *
//    *           *
//     *         *
//      *       *     
//       *     *
//        *   *
//         * *
//          *
//         * *
//        *   *
//       *     *      
//      *       *
//     *         *
//    *           *
//   *             *
//  *               *
// *                 *