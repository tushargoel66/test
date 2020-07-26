
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class NewClass {
    
    static boolean check(int i1,int n){
        int l=0;
        int i=i1;
        while(i!=0){
            if((i&1)==1)
                l++;
            i=i>>1;
        }
        if(l==n)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a[]=new int[6];
        for(int i=0;i<6;i++){
            a[i]=Integer.parseInt(br.readLine());
        }
        //Finding all the possible subset of length n
        ArrayList<ArrayList<Integer>> possibleAns=new ArrayList();
        for(int i=0;i<(1<<6);i++){
            if (check(i,n)){
                int t=i;
                ArrayList<Integer> poss=new ArrayList();
                for(int j=0;j<6;j++){
                    if((t&1)==1)
                        poss.add(j);
                    t=t>>1;
                }
                possibleAns.add(new ArrayList(poss));
            }
        }
        //Trying to get all the subset with the difference between their neighbours of 1
        System.out.println("Possible answer : "+possibleAns);
        int count=0;
        for(ArrayList<Integer> i:possibleAns){
            for(int j=0;j<i.size()-1;j++){
                System.out.println(a[i.get(j)]-a[i.get(j+1)]);
                if(Math.abs(a[i.get(j)]-a[i.get(j+1)])==1)
                    count++;
            }
        }
        System.out.println("Output : "+(count-1));
    }
}
