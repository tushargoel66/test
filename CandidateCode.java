
import java.util.Arrays;
import java.util.Scanner;

public class CandidateCode {
    static int dp[][]=new int[21][21];
    static int find(int d1[][],int p,int d )
    {
        for(int i=1;i<d+1;i++){
            for(int j=1;j<p+1;j++){
                dp[i][j]=dp[i][j-1]+d1[i-1][j-1];
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i=1;i<=d;i++){
            //System.out.println(dp[i][p]);
            ans=Math.min(ans, dp[i][p]);
        }
        return ans;
    }
    
    
    public static void main(String args[] ) throws Exception
     {
         int p,d;
         Scanner obj=new Scanner(System.in);
         p=obj.nextInt();
         d=obj.nextInt();

    	 int d1[][]= new int[d][p];//{{2,2,2,2},{3,1,2,3}};

        for(int i=0;i<d;i++)
        {
            for(int j=0;j<p;j++)
            {
                d1[i][j]=obj.nextInt();
            }
        }

        for(int i=0;i<20;i++)
            Arrays.fill(dp[i], 0);
        System.out.println(find(d1,p,d));

   }
}