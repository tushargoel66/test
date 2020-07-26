
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Mockvita5 {
    
    static boolean check(int a[],int b[]){
        return Arrays.equals(a, b);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t--!=0){
            int n=Integer.parseInt(br.readLine());
            int a[]=new int[n];
            int b[]=new int[n];
            String s[]=br.readLine().split(" ");
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s[i]);
                b[i]=Integer.parseInt(s[i]);
            }
            int k=1;
            while(check(a,b)){
                int t=a[k-1];
                a[k-1];
            }
            
        }
    }
}
