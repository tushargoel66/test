


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

class Pairs{
    int first,second;
    Pairs(int f,int s){
        this.first=f;
        this.second=s;
    }
}

public class Mockvita2 {

    static int findMax(int x){
        int max=Integer.MIN_VALUE;
        while(x!=0){
            if(x%10>max)
                max=x%10;
            x/=10;
        }
        return max;
    }
    static int findMin(int x){
        int max=Integer.MAX_VALUE;
        while(x!=0){
            if(x%10<max)
                max=x%10;
            x/=10;
        }
        return max;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=Integer.parseInt(s[i]);
        ArrayList<Integer> l=new ArrayList();
        for(int i=0;i<n;i++){
            int max=findMax(a[i]);
            int min=findMin(a[i]);
            l.add((max*11+min*7)%100);
        }
        int j=1;
        ArrayList<Integer> odd=new ArrayList();
        ArrayList<Integer> even=new ArrayList();
        int count=0;
        for(int x:l){
            if(j%2==0)
                even.add(x/10);
            else
                odd.add(x/10);
            j++;
        }
        HashMap<Integer,Integer> hm=new HashMap();
        HashMap<Integer,Integer> hm1=new HashMap();
        for(int i:even){
            if(hm.containsKey(i))
                hm.put(i, hm.get(i)+1);
            else
                hm.put(i,1);
        }
        for(int i:odd){
            if(hm1.containsKey(i))
                hm1.put(i, hm1.get(i)+1);
            else
                hm1.put(i,1);
        }
        ArrayList<Pairs> ans=new ArrayList();
        int halfcount=0;
        for(int i:hm.keySet()){
            if(hm.get(i)!=1){
                if(hm.get(i)<=2){
                    count++;
                }
                else{
                    halfcount=halfcount+hm.get(i);
                }
            }
        }
        for(int i:hm1.keySet()){
            if(hm1.get(i)!=1){
                if(hm1.get(i)<=2){
                    count++;
                }
                else{
                    halfcount=halfcount+hm1.get(i);
                }
            }
        }
        float f=halfcount/2f;
        if(halfcount/2!=f){
            System.out.println(((halfcount+count)/2)+1);
        }
        else{
            System.out.println(((halfcount+count)/2));
        }
        //System.out.println(hm+" "+hm1+" "+count+" "+even+" "+odd+" "+halfcount+" "+f);
        //15 9 4 9 8 6 9 5 0 7 8 8
    }
    
}
