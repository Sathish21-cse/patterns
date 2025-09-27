import java.util.*;
public class main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String [] s=sc.nextLine().split(" ");
        List<String> ans=new ArrayList<>();
        List<List<String>> temp=new ArrayList<>();
        boolean [] vis=new boolean[s.length];
        for(int i=0;i<n;i++)
        {
            vis[i]=true;
            ans.add(s[i]);
            backtrack(s,ans,vis,temp);
            ans.remove(0);
            vis[i]=false;
        }
        List<String> cur=temp.get(0);
        for(String str:cur) System.out.print(str+" ");
        
    }
    public static void backtrack(String [] s,List<String> ans,boolean [] vis,List<List<String>> temp)
    {
        if(ans.size()==s.length)
        {
            temp.add(new ArrayList<>(ans));
            return;
        }
        for(int i=0;i<s.length;i++)
        {
            if(vis[i]) continue;
            String cur=ans.get(ans.size()-1);
            if(cur.charAt(cur.length()-1)== s[i].charAt(0))
            {
                vis[i]=true;
                ans.add(s[i]);
                backtrack(s,ans,vis,temp);
                ans.remove(ans.size()-1);
                vis[i]=false;
            }
        }
    }
}



// the ending number of shoud start with another number in the array