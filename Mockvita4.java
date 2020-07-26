
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Mockvita4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s[]=br.readLine().split(" ");
        int a[]=new int[s.length];
        int n=s.length,totsum=0;
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(s[i]);
            totsum+=a[i];
        }
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<(1<<n);i++){
            int sum=0,t=i;
            for(int j=0;j<n;j++){
                if((t&1)==1)
                    sum+=a[j];
                t=t>>1;
            }
            ans=Math.min(ans, Math.max(sum, totsum-sum));
        }
        System.out.print(ans);
    }
}
