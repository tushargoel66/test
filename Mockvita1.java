
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;


public class Mockvita1 {
    
    static boolean check(char bride[],char groom[],int j){
        for(int i=0;i<groom.length;i++){
            if(bride[j]==groom[i])
                return true;
        }
        return false;
    }
    
    static void rotateBy1(char[] arr){
        char temp = arr[arr.length - 1];
        for(int i = arr.length - 1 ;i > 0 ;i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        char bride[]=br.readLine().toCharArray();
        char groom[]=br.readLine().toCharArray();
        ArrayList<Character> bride1=new ArrayList();
        for(char c:bride)
            bride1.add(c);
        ArrayList<Character> groom1=new ArrayList();
        for(char c:groom)
            groom1.add(c);
        int j=0;
        while(check(bride,groom,j)){
            for(int i=0;i<groom.length;i++){
                if(bride[j]==groom[i]){
                    bride[j++]='2';
                    groom[i]='1';
                }                
            }
        }
        int ans=0;
        for(int i=0;i<groom.length;i++){
            if(groom[i]=='m'||groom[i]=='r')
                ans++;
        }
        System.out.print(ans);
    }
}
