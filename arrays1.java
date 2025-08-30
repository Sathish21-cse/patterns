import java.util.*;
public class arrays1 {
        public static void main(String[] args)
        {
          Scanner sc=new Scanner(System.in);
          int[] nums=new int[5];
          for(int i=0;i<5;i++)
          {
            nums[i]=sc.nextInt();
          }
        int[] test=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            test[i]=nums[i];
        }
        Arrays.sort(test);
        int a=nums.length%2;
        int[] t=new int[a];
        for(int i=0;i<a;i++)
        {
            t[i]=nums[i];
            System.out.println("T"+""+t[i]);
        }
        for(int i=0;i<a;i++)
        {
            nums[i]=nums[a+i];
        }
        for(int i=0;i<a;i++)
        {
            nums[a+i]=t[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(test[i]+" "+nums[i]);

        }
        
        
    }
}

