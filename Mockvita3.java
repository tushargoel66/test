
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




public class Mockvita3 {
    
    
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int lmin=Integer.parseInt(br.readLine());
        int lmax=Integer.parseInt(br.readLine());
        int bmin=Integer.parseInt(br.readLine());
        int bmax=Integer.parseInt(br.readLine());
        int ans=0;
        for(int i=lmin;i<=lmax;i++){
            for(int j=bmin;j<=bmax;j++){
                int i1=i,j1=j;
                while(i1!=0&&j1!=0){
                    if(i1>=j1){
                        i1-=j1;
                    }
                    else{
                        j1-=i1;
                    }
                    ans++;
                }
            }
        }
        System.out.print(ans);
    }
}
