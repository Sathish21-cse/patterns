import java.util.*;
public class reversearray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr.add(sc.nextInt());
        }
        int d=sc.nextInt();
        if(d%2!=0)
        {
            for(int i=0;i<d;i++)
            {
                int s=arr.get(n-1);
                arr.remove(n-1);
                arr.add(0,s);
            }
        }
        else
        {
            for(int i=0;i<d;i++)
            {
                int s=arr.get(0);
                arr.remove(0);
                arr.add(n-1,s);
            }
        }
        
       arr.forEach(f->System.out.print(f+" "));      
    //    here i have user Lamada function

    }
}